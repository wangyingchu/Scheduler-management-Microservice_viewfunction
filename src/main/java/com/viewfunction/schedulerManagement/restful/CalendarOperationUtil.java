package com.viewfunction.schedulerManagement.restful;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.viewfunction.schedulerManagement.calendarAction.BaseCalendarAction;
import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;
import com.viewfunction.schedulerManagement.util.ServiceResourceHolder;

public class CalendarOperationUtil {
	public static Map<String,CalendarData> getCalendarDataMap(List<DataObjectVO> dataObjectList){		
		Map<String,CalendarData> dataMap=new HashMap<String,CalendarData>();		
		for(DataObjectVO dataObjectVO:dataObjectList){
			dataMap.put(dataObjectVO.getDataKey(), new CalendarData(dataObjectVO.getDataKey(),dataObjectVO.getDataValue(),dataObjectVO.getDataType()));			
		}	
		return dataMap;
	}
	
	public static LinkedList<BaseCalendarAction> getCalendarActionList(List<CalendarActionVO> calendarActionVOList,Map<String,CalendarData> calendarEntityMap){		
		LinkedList<BaseCalendarAction> calendarActionList=new LinkedList<BaseCalendarAction>();
		for(CalendarActionVO calendarActionVO:calendarActionVOList){			
			Map<String,CalendarData> calendarActionDataMap=CalendarOperationUtil.getCalendarDataMap(calendarActionVO.getCalendarActionData());			
			try {
				String reflectionClassName=ServiceResourceHolder.getCalendarActionClassName(calendarActionVO.getCalendarActionName());				
				if(reflectionClassName!=null){
					Class<?> reflectionClass=Class.forName(reflectionClassName);				
					BaseCalendarAction baseCalendarAction=(BaseCalendarAction)reflectionClass.newInstance();				
					baseCalendarAction.setCalendarActionData(calendarActionDataMap);
					baseCalendarAction.setCalendarEntityData(calendarEntityMap);				
					calendarActionList.add(baseCalendarAction);				
				}				
			} catch (ClassNotFoundException e) {			
				e.printStackTrace();
			} catch (InstantiationException e) {			
				e.printStackTrace();
			} catch (IllegalAccessException e) {			
				e.printStackTrace();
			}			
		}		
		return calendarActionList;
	}
}