package com.viewfunction.schedulerManagement.restful;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TimePointEntityVO")
public class TimePointEntityVO {
	private String calendarEntityUserId;
	private List<DataObjectVO> calendarEntityData;	
	private long time;
	private String calendarScope;
	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

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

	public String getCalendarScope() {
		return calendarScope;
	}

	public void setCalendarScope(String calendarScope) {
		this.calendarScope = calendarScope;
	}
}