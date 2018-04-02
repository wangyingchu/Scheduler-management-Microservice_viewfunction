package com.viewfunction.schedulerManagement.restful;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "ComplexDateEntityVO")
public class ComplexDateEntityVO {
	private String calendarEntityUserId;
	private List<DataObjectVO> calendarEntityData;	
	private String cronExpression;
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
	public String getCronExpression() {
		return cronExpression;
	}
	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}
	public String getCalendarScope() {
		return calendarScope;
	}
	public void setCalendarScope(String calendarScope) {
		this.calendarScope = calendarScope;
	}
}