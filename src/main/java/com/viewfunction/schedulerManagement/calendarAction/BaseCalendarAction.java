package com.viewfunction.schedulerManagement.calendarAction;

import java.util.Map;

import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;

public interface BaseCalendarAction {	
	public static String CALENDAR_ACTION_TYPE_PEROCCUR="PEROCCUR";
	public static String CALENDAR_ACTION_TYPE_POSTOCCUR="POSTOCCUR";
	
	public void setCalendarEntityData(Map<String,CalendarData> entityMap);	
	public void setCalendarActionData(Map<String,CalendarData> actionMap);	
	public Map<String,CalendarData> getCalendarEntityData();	
	public Map<String,CalendarData> getCalendarActionData();	
	public void executeCalendarAction();
	public String getActionName();
}