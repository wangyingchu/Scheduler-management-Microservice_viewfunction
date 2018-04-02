package com.viewfunction.schedulerManagement.calendarServiceImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.viewfunction.schedulerManagement.util.ServiceResourceHolder;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.access.DataContext;

import com.viewfunction.schedulerManagement.calendarAction.BaseCalendarAction;
import com.viewfunction.schedulerManagement.calendarEntity.BaseCalendarEntity;
import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;
import com.viewfunction.schedulerManagement.calendarEntity.ComplexDateEntity;
import com.viewfunction.schedulerManagement.calendarEntity.TimePointEntity;
import com.viewfunction.schedulerManagement.calendarEntity.TimeRangeEntity;
import com.viewfunction.schedulerManagement.calendarService.CalendarActionMetaInfo;
import com.viewfunction.schedulerManagement.calendarService.CalendarEntityMetaInfo;
import com.viewfunction.schedulerManagement.calendarService.CalendarEntityType;
import com.viewfunction.schedulerManagement.calendarService.CalendarServiceAccessPoint;
import com.viewfunction.schedulerManagement.persistent.CalendarAction;
import com.viewfunction.schedulerManagement.persistent.CalendarActionDataObject;
import com.viewfunction.schedulerManagement.persistent.CalendarDataObject;
import com.viewfunction.schedulerManagement.persistent.CalendarEntity;
import com.viewfunction.schedulerManagement.util.DBOperationUtil;

public class QuartzCalendarServiceAccessPointImpl implements CalendarServiceAccessPoint{

	@Override
	public List<CalendarEntityMetaInfo> getCalendarEntitiesByUserId(String userId) {	
		List<CalendarEntity> calendarEntityObjList=DBOperationUtil.getUserCalendar(userId);				
		List<CalendarEntityMetaInfo> calendarEntityMetaInfoList=new ArrayList<CalendarEntityMetaInfo>();
		for(CalendarEntity calendarEntity:calendarEntityObjList){
			CalendarEntityMetaInfo calendarEntityMetaInfo=new CalendarEntityMetaInfo();			
			calendarEntityMetaInfo.setCalendarEntityId(calendarEntity.getCalendarEntityId());
			calendarEntityMetaInfo.setCalendarEntityType(calendarEntity.getCalendarEntityType());
			calendarEntityMetaInfo.setCalendarEntityUserId(calendarEntity.getCalendarEntityUserId());			
			calendarEntityMetaInfo.setCalendarScope(calendarEntity.getCalendarScope());
			if(calendarEntity.getEntityOccurCronExpression()!=null){
				calendarEntityMetaInfo.setEntityOccurCronExpression(calendarEntity.getEntityOccurCronExpression());
			}
			if(calendarEntity.getEntityOccurEndTime()!=null){
				calendarEntityMetaInfo.setEntityOccurEndTime(calendarEntity.getEntityOccurEndTime());
			}
			if(calendarEntity.getEntityOccurStartTime()!=null){
				calendarEntityMetaInfo.setEntityOccurStartTime(calendarEntity.getEntityOccurStartTime());				
			}
			if(calendarEntity.getEntityOccurTime()!=null){
				calendarEntityMetaInfo.setEntityOccurTime(calendarEntity.getEntityOccurTime());
			}
			if(calendarEntity.getEntityRepeatCount()!=null){
				calendarEntityMetaInfo.setEntityRepeatCount(calendarEntity.getEntityRepeatCount());
			}
			if(calendarEntity.getEntityRepeatInterval()!=null){
				calendarEntityMetaInfo.setEntityRepeatInterval(calendarEntity.getEntityRepeatInterval());
			}
			
			List<CalendarData> calendarEntityDataList=new ArrayList<CalendarData>();			
			List<CalendarDataObject> entityDataObjList=calendarEntity.getCalendarEntityDataList();
			for(CalendarDataObject calendarDataObject:entityDataObjList){
				CalendarData calendarData=new CalendarData();
				calendarData.setDataKey(calendarDataObject.getDataKey());
				calendarData.setDataType(calendarDataObject.getDataType());
				calendarData.setDataValue(calendarDataObject.getDataValue());	
				calendarEntityDataList.add(calendarData);				
			}
			calendarEntityMetaInfo.setCalendarEntityDataList(calendarEntityDataList);
			
			List<CalendarActionMetaInfo> calendarActionMetaInfoList=new ArrayList<CalendarActionMetaInfo>();
			List<CalendarAction> entityActionObjList=calendarEntity.getCalendarActionList();
			for(CalendarAction calendarAction:entityActionObjList){
				CalendarActionMetaInfo calendarActionMetaInfo=new CalendarActionMetaInfo();				
				calendarActionMetaInfo.setCalendarActionType(calendarAction.getCalendarActionType());
				calendarActionMetaInfo.setClendarActionName(calendarAction.getCalendarActionName());	
				
				List<CalendarData> calendarActionDataList=new ArrayList<CalendarData>();
				List<CalendarActionDataObject> entityActionDataObjList=calendarAction.getCalendarActionDataList();
				for(CalendarActionDataObject calendarActionDataObject:entityActionDataObjList){
					CalendarData calendarData=new CalendarData();
					calendarData.setDataKey(calendarActionDataObject.getDataKey());
					calendarData.setDataType(calendarActionDataObject.getDataType());
					calendarData.setDataValue(calendarActionDataObject.getDataValue());					
					calendarActionDataList.add(calendarData);
				}
				calendarActionMetaInfo.setCalendarActionDataList(calendarActionDataList);
				calendarActionMetaInfoList.add(calendarActionMetaInfo);				
			}			
			calendarEntityMetaInfo.setCalendarActionMetaInfoList(calendarActionMetaInfoList);			
			calendarEntityMetaInfoList.add(calendarEntityMetaInfo);			
		}	
		return calendarEntityMetaInfoList;
	}

	@Override
	public String addCalendarEntity(BaseCalendarEntity baseCalendarEntity,LinkedList<BaseCalendarAction> perOccurCalendarActionList,LinkedList<BaseCalendarAction> postOccurCalendarActionList) {		
		String currentCalendarEntityType= baseCalendarEntity.getCalendarEntityType();	
		String calendarEntityId=java.util.UUID.randomUUID().toString();		
		if(perOccurCalendarActionList.size()>0){
			for(BaseCalendarAction perOccurCalendarAction:perOccurCalendarActionList){
				perOccurCalendarAction.executeCalendarAction();				
			}
		}			
		
		ObjectContext context = ServiceResourceHolder.getCayenneServerRuntime().getContext();;
		CalendarEntity calendarEntity=context.newObject(CalendarEntity.class);
		calendarEntity.setCalendarEntityId(calendarEntityId);
		calendarEntity.setCalendarEntityType(currentCalendarEntityType);
		calendarEntity.setCalendarEntityUserId(baseCalendarEntity.getCalendarEntityUserId());
		calendarEntity.setCalendarScope(baseCalendarEntity.getCalendarScope());
		
		Map<String, CalendarData> calendarEntityDataMap=baseCalendarEntity.getCalendarEntityData();			
		for (Map.Entry<String, CalendarData> entry : calendarEntityDataMap.entrySet()){  	             
            CalendarData calendarData = entry.getValue(); 	            
            CalendarDataObject calendarDataObject=context.newObject(CalendarDataObject.class);	            
            calendarDataObject.setDataKey(calendarData.getDataKey());
            calendarDataObject.setDataValue(calendarData.getDataValue());
            calendarDataObject.setDataType(calendarData.getDataType());	            
            calendarEntity.addToCalendarEntityDataList(calendarDataObject);	             
        }  		
		for(BaseCalendarAction perOccurCalendarAction:perOccurCalendarActionList){				
			String actionName=perOccurCalendarAction.getActionName();				
			CalendarAction calendarAction=context.newObject(CalendarAction.class);				
			calendarAction.setCalendarEntity(calendarEntity);				
			calendarAction.setCalendarActionName(actionName);
			calendarAction.setCalendarActionType(BaseCalendarAction.CALENDAR_ACTION_TYPE_PEROCCUR);					
			Map<String, CalendarData> calendarActionDataMap=perOccurCalendarAction.getCalendarActionData();
			for (Map.Entry<String, CalendarData> entry : calendarActionDataMap.entrySet()){  	             
	            CalendarData calendarData = entry.getValue(); 	            
	            CalendarActionDataObject calendarActionDataObject=context.newObject(CalendarActionDataObject.class);	            
	            calendarActionDataObject.setDataKey(calendarData.getDataKey());
	            calendarActionDataObject.setDataValue(calendarData.getDataValue());
	            calendarActionDataObject.setDataType(calendarData.getDataType());	            
	            calendarAction.addToCalendarActionDataList(calendarActionDataObject);   
	        }  			
		}		
		for(BaseCalendarAction postOccurCalendarAction:postOccurCalendarActionList){				
			String actionName=postOccurCalendarAction.getActionName();				
			CalendarAction calendarAction=context.newObject(CalendarAction.class);				
			calendarAction.setCalendarEntity(calendarEntity);				
			calendarAction.setCalendarActionName(actionName);
			calendarAction.setCalendarActionType(BaseCalendarAction.CALENDAR_ACTION_TYPE_POSTOCCUR);					
			Map<String, CalendarData> calendarActionDataMap=postOccurCalendarAction.getCalendarActionData();
			for (Map.Entry<String, CalendarData> entry : calendarActionDataMap.entrySet()){  	             
	            CalendarData calendarData = entry.getValue(); 	            
	            CalendarActionDataObject calendarActionDataObject=context.newObject(CalendarActionDataObject.class);	            
	            calendarActionDataObject.setDataKey(calendarData.getDataKey());
	            calendarActionDataObject.setDataValue(calendarData.getDataValue());
	            calendarActionDataObject.setDataType(calendarData.getDataType());	            
	            calendarAction.addToCalendarActionDataList(calendarActionDataObject);   
	        }  			
		}		
		if(currentCalendarEntityType.equals(CalendarEntityType.TIMEPOINT)){
			TimePointEntity timePointEntity=(TimePointEntity)baseCalendarEntity;									
			calendarEntity.setEntityOccurTime(timePointEntity.getTime());				
		}
		if(currentCalendarEntityType.equals(CalendarEntityType.TIMERANGE)){
			TimeRangeEntity timeRangeEntity=(TimeRangeEntity)baseCalendarEntity;			
			calendarEntity.setEntityOccurStartTime(timeRangeEntity.getStartTime());
			calendarEntity.setEntityOccurEndTime(timeRangeEntity.getEndTime());
			calendarEntity.setEntityRepeatCount(timeRangeEntity.getRepeatCount());
			calendarEntity.setEntityRepeatInterval(timeRangeEntity.getRepeatInterval());			
		}
		if(currentCalendarEntityType.equals(CalendarEntityType.COMPLEXDATE)){
			ComplexDateEntity complexDateEntity=(ComplexDateEntity)baseCalendarEntity;
			calendarEntity.setEntityOccurCronExpression(complexDateEntity.getCronExpression());
		}			
		context.commitChanges();		
		if(postOccurCalendarActionList.size()>0){
			for(BaseCalendarAction postCalendarAction:postOccurCalendarActionList){
				postCalendarAction.executeCalendarAction();
			}
		}		
		return calendarEntityId;
	}

	@Override
	public boolean updateCalendarEntity(BaseCalendarEntity baseCalendarEntity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeCalendarEntity(String userId, String calendarEntityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateCalendarAction(String userId, String calendarEntityId,
			LinkedList<BaseCalendarAction> perOccurCalendarActionList,
			LinkedList<BaseCalendarAction> postOccurCalendarActionList) {
		// TODO Auto-generated method stub
		return false;
	}
}