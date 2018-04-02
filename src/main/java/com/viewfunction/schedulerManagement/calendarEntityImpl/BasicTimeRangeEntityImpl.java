package com.viewfunction.schedulerManagement.calendarEntityImpl;

import java.util.Map;

import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;
import com.viewfunction.schedulerManagement.calendarEntity.TimeRangeEntity;
import com.viewfunction.schedulerManagement.calendarService.CalendarEntityType;

public class BasicTimeRangeEntityImpl implements TimeRangeEntity{
	private Map<String, CalendarData> dataMap;
	private String userId;	
	private String entityId;
	private long startTime;
	private long endTime;	
	private int repeatCount;
	private long repeatInterval;
	private String calendarScope;
	@Override
	public String getCalendarEntityType() {		
		return CalendarEntityType.TIMERANGE;
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
	public long getStartTime() {		
		return this.startTime;
	}
	@Override
	public void setStartTime(long startTime) {
		this.startTime=startTime;		
	}
	@Override
	public long getEndTime() {		
		return this.endTime;
	}
	@Override
	public void setEndTime(long endTime) {
		this.endTime=endTime;		
	}	
	@Override
	public int getRepeatCount() {		
		return this.repeatCount;
	}
	@Override
	public void setRepeatCount(int repeatCount) {
		this.repeatCount=repeatCount;		
	}
	@Override
	public long getRepeatInterval() {		
		return this.repeatInterval;
	}
	@Override
	public void setRepeatInterval(long repeatInterval) {
		this.repeatInterval=repeatInterval;		
	}
	public String getCalendarScope() {
		return calendarScope;
	}
	public void setCalendarScope(String calendarScope) {
		this.calendarScope = calendarScope;
	}	
}