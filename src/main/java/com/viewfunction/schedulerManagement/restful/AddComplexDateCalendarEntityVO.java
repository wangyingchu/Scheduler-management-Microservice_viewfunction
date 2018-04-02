package com.viewfunction.schedulerManagement.restful;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddComplexDateCalendarEntityVO")
public class AddComplexDateCalendarEntityVO {
	private List<CalendarActionVO> perOccurCalendarActionList;	
	private List<CalendarActionVO> postOccurCalendarActionList;
	private ComplexDateEntityVO complexDateEntity;
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
	public ComplexDateEntityVO getComplexDateEntity() {
		return complexDateEntity;
	}
	public void setComplexDateEntity(ComplexDateEntityVO complexDateEntity) {
		this.complexDateEntity = complexDateEntity;
	}
}