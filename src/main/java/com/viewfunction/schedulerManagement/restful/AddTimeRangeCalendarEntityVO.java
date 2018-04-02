package com.viewfunction.schedulerManagement.restful;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddTimeRangeCalendarEntityVO")
public class AddTimeRangeCalendarEntityVO {
	private List<CalendarActionVO> perOccurCalendarActionList;	
	private List<CalendarActionVO> postOccurCalendarActionList;
	private TimeRangeEntityVO timeRangeEntity;
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
	public TimeRangeEntityVO getTimeRangeEntity() {
		return timeRangeEntity;
	}
	public void setTimeRangeEntity(TimeRangeEntityVO timeRangeEntityVO) {
		this.timeRangeEntity = timeRangeEntityVO;
	}
}