package com.viewfunction.schedulerManagement.util;

import java.util.Properties;

import org.apache.cayenne.configuration.server.ServerRuntime;
import org.quartz.Scheduler;

public class ServiceResourceHolder {
	private static Scheduler scheduler;	
	private static Properties calendarActionConfigProperty;
	private static ServerRuntime cayenneServerRuntime;

	public static ServerRuntime getCayenneServerRuntime() {
		return cayenneServerRuntime;
	}
	public static void setCayenneServerRuntime(ServerRuntime cayenneServerRuntime) {
		ServiceResourceHolder.cayenneServerRuntime = cayenneServerRuntime;
	}
	public static Scheduler getScheduler() {
		return scheduler;
	}
	public static void setScheduler(Scheduler scheduler) {
		ServiceResourceHolder.scheduler = scheduler;
	}
	public static Properties getCalendarActionConfigProperty() {
		return calendarActionConfigProperty;
	}
	public static void setCalendarActionConfigProperty(
			Properties calendarActionConfigProperty) {
		ServiceResourceHolder.calendarActionConfigProperty = calendarActionConfigProperty;
	}	
	public static String getCalendarActionClassName(String actionName){
		return calendarActionConfigProperty.getProperty(actionName);
	}
}