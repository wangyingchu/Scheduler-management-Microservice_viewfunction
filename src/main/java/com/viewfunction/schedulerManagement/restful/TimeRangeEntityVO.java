package com.viewfunction.schedulerManagement.restful;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TimeRangeEntityVO")
public class TimeRangeEntityVO {
	private String calendarEntityUserId;
	private List<DataObjectVO> calendarEntityData;	
	private long startTime;
	private long endTime;
	private int repeatCount;
	private long repeatInterval;
	private String calendarScope;
	public String getCalendarEntityUserId() {
		return calendarEntityUserId;
	}
	public void setCalendarEntityUserId(String calendarEntityUserId) {
		this.calendarEntityUserId = calendarEntityUserId;
	}
	public List<DataObjectVO> getCalendarEntityData() {
		return calendarEntityData;
	}
	public void setCalendarEntityData(List<DataObjectVO> calendarEntityData) {
		this.calendarEntityData = calendarEntityData;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public int getRepeatCount() {
		return repeatCount;
	}
	public void setRepeatCount(int repeatCount) {
		this.repeatCount = repeatCount;
	}
	public long getRepeatInterval() {
		return repeatInterval;
	}
	public void setRepeatInterval(long repeatInterval) {
		this.repeatInterval = repeatInterval;
	}
	public String getCalendarScope() {
		return calendarScope;
	}
	public void setCalendarScope(String calendarScope) {
		this.calendarScope = calendarScope;
	}
}