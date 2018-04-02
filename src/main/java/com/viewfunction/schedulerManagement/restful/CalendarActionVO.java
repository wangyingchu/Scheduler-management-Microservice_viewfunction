package com.viewfunction.schedulerManagement.restful;

import java.util.List;

public class CalendarActionVO {
	private String calendarActionName;
	private List<DataObjectVO> calendarEntityData;
	private List<DataObjectVO> calendarActionData;
	public String getCalendarActionName() {
		return calendarActionName;
	}
	public void setCalendarActionName(String calendarActionName) {
		this.calendarActionName = calendarActionName;
	}
	public List<DataObjectVO> getCalendarEntityData() {
		return calendarEntityData;
	}
	public void setCalendarEntityData(List<DataObjectVO> calendarEntityData) {
		this.calendarEntityData = calendarEntityData;
	}
	public List<DataObjectVO> getCalendarActionData() {
		return calendarActionData;
	}
	public void setCalendarActionData(List<DataObjectVO> calendarActionData) {
		this.calendarActionData = calendarActionData;
	}
}