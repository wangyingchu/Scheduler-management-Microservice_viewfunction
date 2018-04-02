package com.viewfunction.schedulerManagement.util.factory;

import com.viewfunction.schedulerManagement.calendarEntity.ComplexDateEntity;
import com.viewfunction.schedulerManagement.calendarEntity.TimePointEntity;
import com.viewfunction.schedulerManagement.calendarEntity.TimeRangeEntity;
import com.viewfunction.schedulerManagement.calendarEntityImpl.BasicComplexDateEntityImpl;
import com.viewfunction.schedulerManagement.calendarEntityImpl.BasicTimePointEntityImpl;
import com.viewfunction.schedulerManagement.calendarEntityImpl.BasicTimeRangeEntityImpl;
import com.viewfunction.schedulerManagement.calendarService.CalendarServiceAccessPoint;
import com.viewfunction.schedulerManagement.calendarServiceImpl.QuartzCalendarServiceAccessPointImpl;

public class SchedulerManagementComponentFactory {	
	public static CalendarServiceAccessPoint getCalendarServiceAccessPoint(){
		return new QuartzCalendarServiceAccessPointImpl();
	}	
	public static TimeRangeEntity createTimeRangeEntity(){
		return new BasicTimeRangeEntityImpl();
	}
	public static TimePointEntity createTimePointEntity(){
		return new BasicTimePointEntityImpl();
	}	
	public static ComplexDateEntity createComplexDateEntity(){
		return new BasicComplexDateEntityImpl();
	}
}