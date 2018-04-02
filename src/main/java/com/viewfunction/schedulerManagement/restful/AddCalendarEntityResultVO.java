package com.viewfunction.schedulerManagement.restful;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddCalendarEntityResultVO")
public class AddCalendarEntityResultVO {
	private boolean addCalendarEntityResult;
	private String calendarEntityId;

	public boolean isAddCalendarEntityResult() {
		return addCalendarEntityResult;
	}

	public void setAddCalendarEntityResult(boolean addCalendarEntityResult) {
		this.addCalendarEntityResult = addCalendarEntityResult;
	}

	public String getCalendarEntityId() {
		return calendarEntityId;
	}

	public void setCalendarEntityId(String calendarEntityId) {
		this.calendarEntityId = calendarEntityId;
	}
}
