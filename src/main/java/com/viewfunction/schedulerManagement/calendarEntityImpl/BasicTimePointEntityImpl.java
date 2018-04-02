package com.viewfunction.schedulerManagement.calendarEntityImpl;

import java.util.Map;

import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;
import com.viewfunction.schedulerManagement.calendarEntity.TimePointEntity;
import com.viewfunction.schedulerManagement.calendarService.CalendarEntityType;

public class BasicTimePointEntityImpl implements TimePointEntity{
	private Map<String, CalendarData> dataMap;
	private String userId;	
	private String entityId;
	private long time;
	private String calendarScope;
	@Override
	public String getCalendarEntityType() {		
		return CalendarEntityType.TIMEPOINT;
	}
	@Override
	public void setCalendarEntityData(Map<String, CalendarData> dataMap) {
		this.dataMap=dataMap;		
	}
	@Override
	public Map<String, CalendarData> getCalendarEntityData() {		
		return this.dataMap;
	}
	@Override
	public void setCalendarEntityUserId(String userId) {
		this.userId=userId;		
	}
	@Override
	public String getCalendarEntityUserId() {		
		return this.userId;
	}
	@Override
	public void setCalendarEntityId(String calendarEntityId) {
		this.entityId=calendarEntityId;		
	}
	@Override
	public String getCalendarEntityId() {		
		return this.entityId;
	}
	@Override
	public long getTime() {		
		return this.time;
	}
	@Override
	public void setTime(long timePoint) {
		this.time=timePoint;		
	}
	public String getCalendarScope() {
		return calendarScope;
	}
	public void setCalendarScope(String calendarScope) {
		this.calendarScope = calendarScope;
	}	
}