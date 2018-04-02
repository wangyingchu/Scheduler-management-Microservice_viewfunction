package com.viewfunction.schedulerManagement.calendarEntityImpl;

import java.util.Map;

import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;
import com.viewfunction.schedulerManagement.calendarEntity.ComplexDateEntity;
import com.viewfunction.schedulerManagement.calendarService.CalendarEntityType;

public class BasicComplexDateEntityImpl implements ComplexDateEntity{
	private Map<String, CalendarData> dataMap;
	private String userId;	
	private String entityId;
	private String cronExpress;
	private String calendarScope;
	@Override
	public String getCalendarEntityType() {		
		return CalendarEntityType.COMPLEXDATE;
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
	public void setCronExpression(String cronExpression) {
		this.cronExpress=cronExpression;		
	}
	@Override
	public String getCronExpression() {		
		return this.cronExpress;
	}
	public String getCalendarScope() {
		return calendarScope;
	}
	public void setCalendarScope(String calendarScope) {
		this.calendarScope = calendarScope;
	}	
}