package com.viewfunction.schedulerManagement.restful;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.viewfunction.schedulerManagement.calendarService.CalendarEntityMetaInfo;

@XmlRootElement(name = "CalendarEntityMetaInfoListVO")
public class CalendarEntityMetaInfoListVO {
	private List<CalendarEntityMetaInfo> calendarEntityMetaInfoList;

	public List<CalendarEntityMetaInfo> getCalendarEntityMetaInfoList() {
		return calendarEntityMetaInfoList;
	}

	public void setCalendarEntityMetaInfoList(
			List<CalendarEntityMetaInfo> calendarEntityMetaInfoList) {
		this.calendarEntityMetaInfoList = calendarEntityMetaInfoList;
	}
}
