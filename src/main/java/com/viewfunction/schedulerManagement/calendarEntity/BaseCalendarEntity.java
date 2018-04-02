package com.viewfunction.schedulerManagement.calendarEntity;

import java.util.Map;

public interface BaseCalendarEntity {
	public String getCalendarEntityType();
	public void setCalendarEntityData(Map<String, CalendarData> dataMap);
	public Map<String, CalendarData> getCalendarEntityData();
	
	public void setCalendarEntityUserId(String userId);
	public String getCalendarEntityUserId();
	
	public void setCalendarEntityId(String calendarEntityId);
	public String getCalendarEntityId();
	
	public void setCalendarScope(String calendarScope);
	public String getCalendarScope();
}