package com.viewfunction.schedulerManagement.calendarActionImpl;

import java.util.Map;

import com.viewfunction.schedulerManagement.calendarAction.BaseCalendarAction;
import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;

public class MakeTaskOverdueCalendarAction implements BaseCalendarAction{
	private Map<String, CalendarData> entityMap;
	private Map<String, CalendarData> actionMap;
	

	@Override
	public void executeCalendarAction() {
		System.out.println("executeCalendarAction-MakeTaskOverdueCalendarAction");
		
	}

	@Override
	public void setCalendarEntityData(Map<String, CalendarData> entityMap) {
		this.entityMap=entityMap;
		
	}
	@Override
	public void setCalendarActionData(Map<String, CalendarData> actionMap) {
		this.actionMap=actionMap;
		
	}
	@Override
	public Map<String, CalendarData> getCalendarEntityData() {
		// TODO Auto-generated method stub
		return this.entityMap;
	}
	@Override
	public Map<String, CalendarData> getCalendarActionData() {		
		return this.actionMap;
	}

	@Override
	public String getActionName() {
		// TODO Auto-generated method stub
		return "MakeTaskOverdueCalendarAction";
	}

}
