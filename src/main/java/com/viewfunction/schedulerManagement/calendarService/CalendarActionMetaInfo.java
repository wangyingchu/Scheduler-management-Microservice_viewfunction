package com.viewfunction.schedulerManagement.calendarService;

import java.util.List;

import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;

public class CalendarActionMetaInfo {
	private String calendarActionType;
	private String clendarActionName;
	private List<CalendarData> calendarActionDataList;
	public String getCalendarActionType() {
		return calendarActionType;
	}
	public void setCalendarActionType(String calendarActionType) {
		this.calendarActionType = calendarActionType;
	}
	public String getClendarActionName() {
		return clendarActionName;
	}
	public void setClendarActionName(String clendarActionName) {
		this.clendarActionName = clendarActionName;
	}
	public List<CalendarData> getCalendarActionDataList() {
		return calendarActionDataList;
	}
	public void setCalendarActionDataList(List<CalendarData> calendarActionDataList) {
		this.calendarActionDataList = calendarActionDataList;
	}
}