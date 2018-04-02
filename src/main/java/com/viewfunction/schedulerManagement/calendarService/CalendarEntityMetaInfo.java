package com.viewfunction.schedulerManagement.calendarService;

import java.util.List;

import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;

public class CalendarEntityMetaInfo {
	
	private String calendarEntityId;
	private String calendarEntityType;
	private String calendarEntityUserId;	
	private String entityOccurCronExpression;
	private long entityOccurTime;	
	private long entityOccurStartTime;
	private long entityOccurEndTime;	
	private int entityRepeatCount;	
	private long entityRepeatInterval;	
	private List<CalendarData> calendarEntityDataList;
	private List<CalendarActionMetaInfo> calendarActionMetaInfoList;
	private String calendarScope;	
	
	public String getCalendarEntityId() {
		return calendarEntityId;
	}
	public void setCalendarEntityId(String calendarEntityId) {
		this.calendarEntityId = calendarEntityId;
	}
	public String getCalendarEntityType() {
		return calendarEntityType;
	}
	public void setCalendarEntityType(String calendarEntityType) {
		this.calendarEntityType = calendarEntityType;
	}
	public String getCalendarEntityUserId() {
		return calendarEntityUserId;
	}
	public void setCalendarEntityUserId(String calendarEntityUserId) {
		this.calendarEntityUserId = calendarEntityUserId;
	}
	public String getEntityOccurCronExpression() {
		return entityOccurCronExpression;
	}
	public void setEntityOccurCronExpression(String entityOccurCronExpression) {
		this.entityOccurCronExpression = entityOccurCronExpression;
	}
	public long getEntityOccurTime() {
		return entityOccurTime;
	}
	public void setEntityOccurTime(long entityOccurTime) {
		this.entityOccurTime = entityOccurTime;
	}
	public long getEntityOccurStartTime() {
		return entityOccurStartTime;
	}
	public void setEntityOccurStartTime(long entityOccurStartTime) {
		this.entityOccurStartTime = entityOccurStartTime;
	}
	public long getEntityOccurEndTime() {
		return entityOccurEndTime;
	}
	public void setEntityOccurEndTime(long entityOccurEndTime) {
		this.entityOccurEndTime = entityOccurEndTime;
	}
	public int getEntityRepeatCount() {
		return entityRepeatCount;
	}
	public void setEntityRepeatCount(int entityRepeatCount) {
		this.entityRepeatCount = entityRepeatCount;
	}
	public long getEntityRepeatInterval() {
		return entityRepeatInterval;
	}
	public void setEntityRepeatInterval(long entityRepeatInterval) {
		this.entityRepeatInterval = entityRepeatInterval;
	}
	public List<CalendarData> getCalendarEntityDataList() {
		return calendarEntityDataList;
	}
	public void setCalendarEntityDataList(List<CalendarData> calendarEntityDataList) {
		this.calendarEntityDataList = calendarEntityDataList;
	}
	public List<CalendarActionMetaInfo> getCalendarActionMetaInfoList() {
		return calendarActionMetaInfoList;
	}
	public void setCalendarActionMetaInfoList(
			List<CalendarActionMetaInfo> calendarActionMetaInfoList) {
		this.calendarActionMetaInfoList = calendarActionMetaInfoList;
	}
	public String getCalendarScope() {
		return calendarScope;
	}
	public void setCalendarScope(String calendarScope) {
		this.calendarScope = calendarScope;
	}	
}