package com.viewfunction.schedulerManagement.restful;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddTimePointCalendarEntityVO")
public class AddTimePointCalendarEntityVO {	
	private List<CalendarActionVO> perOccurCalendarActionList;	
	private List<CalendarActionVO> postOccurCalendarActionList;	
	private TimePointEntityVO timePointEntity;

	public TimePointEntityVO getTimePointEntity() {
		return timePointEntity;
	}
	public void setTimePointEntity(TimePointEntityVO timePointEntityVO) {
		this.timePointEntity = timePointEntityVO;
	}
	public List<CalendarActionVO> getPerOccurCalendarActionList() {
		return perOccurCalendarActionList;
	}
	public void setPerOccurCalendarActionList(
			List<CalendarActionVO> perOccurCalendarActionList) {
		this.perOccurCalendarActionList = perOccurCalendarActionList;
	}
	public List<CalendarActionVO> getPostOccurCalendarActionList() {
		return postOccurCalendarActionList;
	}
	public void setPostOccurCalendarActionList(
			List<CalendarActionVO> postOccurCalendarActionList) {
		this.postOccurCalendarActionList = postOccurCalendarActionList;
	}
}