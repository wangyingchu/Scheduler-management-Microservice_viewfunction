package com.viewfunction.schedulerManagement.restful;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.viewfunction.schedulerManagement.calendarAction.BaseCalendarAction;
import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;
import com.viewfunction.schedulerManagement.calendarEntity.ComplexDateEntity;
import com.viewfunction.schedulerManagement.calendarEntity.TimePointEntity;
import com.viewfunction.schedulerManagement.calendarEntity.TimeRangeEntity;
import com.viewfunction.schedulerManagement.calendarService.CalendarEntityMetaInfo;
import com.viewfunction.schedulerManagement.calendarService.CalendarServiceAccessPoint;

import com.viewfunction.schedulerManagement.util.factory.SchedulerManagementComponentFactory;
import org.springframework.stereotype.Service;

@Service
@Path("/calendarOperationService")  
@Produces("application/json")
public class CalendarOperationService {
	@POST
    @Path("/addTimePointCalendarEntity/")    
	@Produces({"application/xml", "application/json"})	
	public AddCalendarEntityResultVO addTimePointCalendarEntity(AddTimePointCalendarEntityVO addCalendarEntityVO){		
		if(addCalendarEntityVO.getTimePointEntity()==null||addCalendarEntityVO.getPerOccurCalendarActionList()==null||
				addCalendarEntityVO.getPostOccurCalendarActionList()==null){
			return null;
		}		
		TimePointEntity timePointEntity=SchedulerManagementComponentFactory.createTimePointEntity();
		Map<String,CalendarData> calendarEntityDataMap= CalendarOperationUtil.getCalendarDataMap(addCalendarEntityVO.getTimePointEntity().getCalendarEntityData());		
		timePointEntity.setCalendarEntityData(calendarEntityDataMap);		
		timePointEntity.setCalendarEntityUserId(addCalendarEntityVO.getTimePointEntity().getCalendarEntityUserId());
		timePointEntity.setCalendarScope(addCalendarEntityVO.getTimePointEntity().getCalendarScope());
		timePointEntity.setTime(addCalendarEntityVO.getTimePointEntity().getTime());				
		
		LinkedList<BaseCalendarAction> perOccurCalendarActionList=
				CalendarOperationUtil.getCalendarActionList(addCalendarEntityVO.getPerOccurCalendarActionList(),calendarEntityDataMap);
		LinkedList<BaseCalendarAction> postOccurCalendarActionList=		
				CalendarOperationUtil.getCalendarActionList(addCalendarEntityVO.getPostOccurCalendarActionList(),calendarEntityDataMap);		
		
		CalendarServiceAccessPoint calendarServiceAccessPoint=SchedulerManagementComponentFactory.getCalendarServiceAccessPoint();		
		String calendarEntityId=calendarServiceAccessPoint.addCalendarEntity(timePointEntity, perOccurCalendarActionList, postOccurCalendarActionList);	
		
		AddCalendarEntityResultVO addCalendarEntityResultVO=new AddCalendarEntityResultVO();
		addCalendarEntityResultVO.setAddCalendarEntityResult(true);
		addCalendarEntityResultVO.setCalendarEntityId(calendarEntityId);
		return addCalendarEntityResultVO;
	}
	
	@POST
    @Path("/addTimeRangeCalendarEntity/")
	@Produces({"application/xml", "application/json"})
	public AddCalendarEntityResultVO addTimeRangeCalendarEntity(AddTimeRangeCalendarEntityVO addCalendarEntityVO){
		if(addCalendarEntityVO.getTimeRangeEntity()==null||addCalendarEntityVO.getPerOccurCalendarActionList()==null||
				addCalendarEntityVO.getPostOccurCalendarActionList()==null){
			return null;
		}		
		TimeRangeEntity timeRangeEntity=SchedulerManagementComponentFactory.createTimeRangeEntity();
		Map<String,CalendarData> calendarEntityDataMap= CalendarOperationUtil.getCalendarDataMap(addCalendarEntityVO.getTimeRangeEntity().getCalendarEntityData());		
		timeRangeEntity.setCalendarEntityData(calendarEntityDataMap);		
		timeRangeEntity.setCalendarEntityUserId(addCalendarEntityVO.getTimeRangeEntity().getCalendarEntityUserId());
		timeRangeEntity.setCalendarScope(addCalendarEntityVO.getTimeRangeEntity().getCalendarScope());
		timeRangeEntity.setStartTime(addCalendarEntityVO.getTimeRangeEntity().getStartTime());
		timeRangeEntity.setEndTime(addCalendarEntityVO.getTimeRangeEntity().getEndTime());
		timeRangeEntity.setRepeatCount(addCalendarEntityVO.getTimeRangeEntity().getRepeatCount());
		timeRangeEntity.setRepeatInterval(addCalendarEntityVO.getTimeRangeEntity().getRepeatInterval());		
		
		LinkedList<BaseCalendarAction> perOccurCalendarActionList=
				CalendarOperationUtil.getCalendarActionList(addCalendarEntityVO.getPerOccurCalendarActionList(),calendarEntityDataMap);
		LinkedList<BaseCalendarAction> postOccurCalendarActionList=		
				CalendarOperationUtil.getCalendarActionList(addCalendarEntityVO.getPostOccurCalendarActionList(),calendarEntityDataMap);		
		
		CalendarServiceAccessPoint calendarServiceAccessPoint=SchedulerManagementComponentFactory.getCalendarServiceAccessPoint();		
		String calendarEntityId=calendarServiceAccessPoint.addCalendarEntity(timeRangeEntity, perOccurCalendarActionList, postOccurCalendarActionList);	
		
		AddCalendarEntityResultVO addCalendarEntityResultVO=new AddCalendarEntityResultVO();
		addCalendarEntityResultVO.setAddCalendarEntityResult(true);
		addCalendarEntityResultVO.setCalendarEntityId(calendarEntityId);
		return addCalendarEntityResultVO;
	}
	
	@POST
    @Path("/addComplexDateCalendarEntity/")
	@Produces({"application/xml", "application/json"})
	public AddCalendarEntityResultVO addComplexDateCalendarEntity(AddComplexDateCalendarEntityVO addCalendarEntityVO){		
		if(addCalendarEntityVO.getComplexDateEntity()==null||addCalendarEntityVO.getPerOccurCalendarActionList()==null||
				addCalendarEntityVO.getPostOccurCalendarActionList()==null){
			return null;
		}			
		ComplexDateEntity complexDateEntity=SchedulerManagementComponentFactory.createComplexDateEntity();
		Map<String,CalendarData> calendarEntityDataMap= CalendarOperationUtil.getCalendarDataMap(addCalendarEntityVO.getComplexDateEntity().getCalendarEntityData());		
		complexDateEntity.setCalendarEntityData(calendarEntityDataMap);		
		complexDateEntity.setCalendarEntityUserId(addCalendarEntityVO.getComplexDateEntity().getCalendarEntityUserId());
		complexDateEntity.setCalendarScope(addCalendarEntityVO.getComplexDateEntity().getCalendarScope());
		complexDateEntity.setCronExpression(addCalendarEntityVO.getComplexDateEntity().getCronExpression());		
		
		LinkedList<BaseCalendarAction> perOccurCalendarActionList=
				CalendarOperationUtil.getCalendarActionList(addCalendarEntityVO.getPerOccurCalendarActionList(),calendarEntityDataMap);
		LinkedList<BaseCalendarAction> postOccurCalendarActionList=		
				CalendarOperationUtil.getCalendarActionList(addCalendarEntityVO.getPostOccurCalendarActionList(),calendarEntityDataMap);		
		
		CalendarServiceAccessPoint calendarServiceAccessPoint=SchedulerManagementComponentFactory.getCalendarServiceAccessPoint();		
		String calendarEntityId=calendarServiceAccessPoint.addCalendarEntity(complexDateEntity, perOccurCalendarActionList, postOccurCalendarActionList);	
		
		AddCalendarEntityResultVO addCalendarEntityResultVO=new AddCalendarEntityResultVO();
		addCalendarEntityResultVO.setAddCalendarEntityResult(true);
		addCalendarEntityResultVO.setCalendarEntityId(calendarEntityId);
		return addCalendarEntityResultVO;
	}
	
	@GET
    @Path("/getUserCalendarEntities/{userId}")
	@Produces({"application/xml", "application/json"})
	public CalendarEntityMetaInfoListVO getUserCalendarEntityList(@PathParam("userId") String userId){			
		CalendarServiceAccessPoint calendarServiceAccessPoint=SchedulerManagementComponentFactory.getCalendarServiceAccessPoint();		
		List<CalendarEntityMetaInfo> calendarEntityMetaInfoList=calendarServiceAccessPoint.getCalendarEntitiesByUserId(userId);			
		CalendarEntityMetaInfoListVO calendarEntityMetaInfoListVO=new CalendarEntityMetaInfoListVO();		
		calendarEntityMetaInfoListVO.setCalendarEntityMetaInfoList(calendarEntityMetaInfoList);		
		return calendarEntityMetaInfoListVO;
	}
}