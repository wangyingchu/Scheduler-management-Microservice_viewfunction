package com.viewfunction.schedulerManagement.calendarService;

import java.util.LinkedList;
import java.util.List;

import com.viewfunction.schedulerManagement.calendarAction.BaseCalendarAction;
import com.viewfunction.schedulerManagement.calendarEntity.BaseCalendarEntity;

public interface CalendarServiceAccessPoint {
	public  List<CalendarEntityMetaInfo> getCalendarEntitiesByUserId(String userId);
	public  String addCalendarEntity(BaseCalendarEntity baseCalendarEntity,
			LinkedList<BaseCalendarAction> perOccurCalendarActionList,LinkedList<BaseCalendarAction> postOccurCalendarActionList);
	public  boolean updateCalendarEntity(BaseCalendarEntity baseCalendarEntity);	
	public  boolean updateCalendarAction(String userId,String calendarEntityId,
			LinkedList<BaseCalendarAction> perOccurCalendarActionList,LinkedList<BaseCalendarAction> postOccurCalendarActionList);
	public  void removeCalendarEntity(String userId,String calendarEntityId);
}