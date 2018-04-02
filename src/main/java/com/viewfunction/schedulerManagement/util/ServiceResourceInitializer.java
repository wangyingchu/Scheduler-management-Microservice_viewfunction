package com.viewfunction.schedulerManagement.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.viewfunction.schedulerManagementService.util.RuntimeEnvironmentHandler;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

@WebListener
public class ServiceResourceInitializer implements ServletContextListener{

	private static String cayenneDataBaseProjectFile= RuntimeEnvironmentHandler.getApplicationRootPath()+"dataPersistance/cayenne.xml";

	private Scheduler quartzScheduler;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {		
		try {
			quartzScheduler.shutdown(true);
			ServerRuntime cayenneRuntime=ServiceResourceHolder.getCayenneServerRuntime();
			if(cayenneRuntime!=null){
				cayenneRuntime.shutdown();
			}
		} catch (SchedulerException e) {			
			e.printStackTrace();
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServerRuntime cayenneRuntime= new ServerRuntime(cayenneDataBaseProjectFile);
		ServiceResourceHolder.setCayenneServerRuntime(cayenneRuntime);
		StdSchedulerFactory sf = new StdSchedulerFactory();		
		try {
			sf.initialize(RuntimeEnvironmentHandler.getApplicationRootPath()+"quartz.properties");
			quartzScheduler = sf.getScheduler();
			quartzScheduler.start();
			ServiceResourceHolder.setScheduler(quartzScheduler);
		} catch (SchedulerException e) {			
			e.printStackTrace();
		}			
		Properties _properties=new Properties();
		try {			
			_properties.load(new FileInputStream(RuntimeEnvironmentHandler.getApplicationRootPath()+"calendarActionsConfig.properties"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		ServiceResourceHolder.setCalendarActionConfigProperty(_properties);			
	}
}