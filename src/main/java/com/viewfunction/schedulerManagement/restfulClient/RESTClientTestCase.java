package com.viewfunction.schedulerManagement.restfulClient;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.viewfunction.schedulerManagement.calendarService.CalendarDataType;
import com.viewfunction.schedulerManagement.calendarService.CalendarEntityMetaInfo;
import com.viewfunction.schedulerManagement.restful.AddCalendarEntityResultVO;
import com.viewfunction.schedulerManagement.restful.AddComplexDateCalendarEntityVO;
import com.viewfunction.schedulerManagement.restful.AddTimePointCalendarEntityVO;
import com.viewfunction.schedulerManagement.restful.AddTimeRangeCalendarEntityVO;
import com.viewfunction.schedulerManagement.restful.CalendarActionVO;
import com.viewfunction.schedulerManagement.restful.CalendarEntityMetaInfoListVO;
import com.viewfunction.schedulerManagement.restful.ComplexDateEntityVO;
import com.viewfunction.schedulerManagement.restful.DataObjectVO;
import com.viewfunction.schedulerManagement.restful.TimePointEntityVO;
import com.viewfunction.schedulerManagement.restful.TimeRangeEntityVO;

public class RESTClientTestCase {
	public static void addTimePointCalendarEntity(){				
		AddTimePointCalendarEntityVO addTimePointCalendarEntityVO=new AddTimePointCalendarEntityVO();	
		
		TimePointEntityVO timePointEntityVO=new TimePointEntityVO();		
		DataObjectVO dataObjectVO1=new DataObjectVO();
		dataObjectVO1.setDataKey("param1Key");
		dataObjectVO1.setDataValue("param1Value");		
		dataObjectVO1.setDataType(CalendarDataType.CalendarDataType_STRING);
		
		timePointEntityVO.setTime(new Date().getTime());		
		timePointEntityVO.setCalendarEntityUserId("wangychu");		
		timePointEntityVO.setCalendarScope("viewfunction.inc");		
		List<DataObjectVO> dataVOList=new ArrayList<DataObjectVO>();	
		dataVOList.add(dataObjectVO1);
		
		timePointEntityVO.setCalendarEntityData(dataVOList);		
		addTimePointCalendarEntityVO.setTimePointEntity(timePointEntityVO);	
		
		CalendarActionVO calendarActionVO=new CalendarActionVO();
		calendarActionVO.setCalendarActionName("SendNotificationCalendarAction");
		calendarActionVO.setCalendarActionData(dataVOList);		
		List<CalendarActionVO> perOccurCalendarActionList=new LinkedList<CalendarActionVO>();		
		perOccurCalendarActionList.add(calendarActionVO);		
		
		DataObjectVO dataObjectVO2=new DataObjectVO();
		dataObjectVO2.setDataKey("param2Key");
		dataObjectVO2.setDataValue("1500");		
		dataObjectVO2.setDataType(CalendarDataType.CalendarDataType_LONG);
		dataVOList.add(dataObjectVO2);		
		
		addTimePointCalendarEntityVO.setPerOccurCalendarActionList(perOccurCalendarActionList);			
		
		CalendarActionVO calendarActionVO2=new CalendarActionVO();
		calendarActionVO2.setCalendarActionName("MakeTaskOverdueCalendarAction");
		calendarActionVO2.setCalendarActionData(dataVOList);		
		List<CalendarActionVO> postOccurCalendarActionList=new LinkedList<CalendarActionVO>();
		postOccurCalendarActionList.add(calendarActionVO2);		
		addTimePointCalendarEntityVO.setPostOccurCalendarActionList(postOccurCalendarActionList);			
		
		AddCalendarEntityResultVO b = CalendarOperationServiceRESTClient.addTimePointCalendarEntity(addTimePointCalendarEntityVO);
		System.out.println(b.isAddCalendarEntityResult());	
		System.out.println(b.getCalendarEntityId());	
	}
	
	public static void addTimeRangeCalendarEntity(){		
		AddTimeRangeCalendarEntityVO addTimeRangeCalendarEntityVO=new AddTimeRangeCalendarEntityVO();
		TimeRangeEntityVO timeRangeEntityVO=new TimeRangeEntityVO();			
		timeRangeEntityVO.setCalendarEntityUserId("wangychu");
		timeRangeEntityVO.setCalendarScope("viewfunction.inc");	
		timeRangeEntityVO.setStartTime(500);
		timeRangeEntityVO.setEndTime(10000);		
		timeRangeEntityVO.setRepeatCount(50);
		timeRangeEntityVO.setRepeatInterval(150);			
		
		DataObjectVO dataObjectVO1=new DataObjectVO();
		dataObjectVO1.setDataKey("param1Key_timerange");
		dataObjectVO1.setDataValue("param1Value_timerange");		
		dataObjectVO1.setDataType(CalendarDataType.CalendarDataType_STRING);		
		List<DataObjectVO> dataVOList=new ArrayList<DataObjectVO>();	
		dataVOList.add(dataObjectVO1);
		timeRangeEntityVO.setCalendarEntityData(dataVOList);
		
		addTimeRangeCalendarEntityVO.setTimeRangeEntity(timeRangeEntityVO);		
		
		CalendarActionVO calendarActionVO=new CalendarActionVO();
		calendarActionVO.setCalendarActionName("SendNotificationCalendarAction");
		calendarActionVO.setCalendarActionData(dataVOList);		
		List<CalendarActionVO> perOccurCalendarActionList=new LinkedList<CalendarActionVO>();		
		perOccurCalendarActionList.add(calendarActionVO);		
		
		DataObjectVO dataObjectVO2=new DataObjectVO();
		dataObjectVO2.setDataKey("param2Key_timerange");
		dataObjectVO2.setDataValue("1500");		
		dataObjectVO2.setDataType(CalendarDataType.CalendarDataType_LONG);
		dataVOList.add(dataObjectVO2);		
		
		addTimeRangeCalendarEntityVO.setPerOccurCalendarActionList(perOccurCalendarActionList);			
		
		CalendarActionVO calendarActionVO2=new CalendarActionVO();
		calendarActionVO2.setCalendarActionName("MakeTaskOverdueCalendarAction");
		calendarActionVO2.setCalendarActionData(dataVOList);		
		List<CalendarActionVO> postOccurCalendarActionList=new LinkedList<CalendarActionVO>();
		postOccurCalendarActionList.add(calendarActionVO2);		
		addTimeRangeCalendarEntityVO.setPostOccurCalendarActionList(postOccurCalendarActionList);			
		
		AddCalendarEntityResultVO b = CalendarOperationServiceRESTClient.addTimeRangeCalendarEntity(addTimeRangeCalendarEntityVO);
		System.out.println(b.isAddCalendarEntityResult());	
		System.out.println(b.getCalendarEntityId());
	}				
	
	public static void addComplexCalendarEntity(){
		AddComplexDateCalendarEntityVO addComplexDateEntityVO=new AddComplexDateCalendarEntityVO();	
		ComplexDateEntityVO complexDateEntityVO=new ComplexDateEntityVO();
		complexDateEntityVO.setCalendarEntityUserId("wangychu");
		complexDateEntityVO.setCalendarScope("viewfunction.inc");	
		complexDateEntityVO.setCronExpression("cron XXX ***");
		
		DataObjectVO dataObjectVO1=new DataObjectVO();
		dataObjectVO1.setDataKey("param1Key_complex");
		dataObjectVO1.setDataValue("param1Value_complex");		
		dataObjectVO1.setDataType(CalendarDataType.CalendarDataType_STRING);		
		List<DataObjectVO> dataVOList=new ArrayList<DataObjectVO>();	
		dataVOList.add(dataObjectVO1);
		complexDateEntityVO.setCalendarEntityData(dataVOList);
		
		addComplexDateEntityVO.setComplexDateEntity(complexDateEntityVO);		
		
		CalendarActionVO calendarActionVO=new CalendarActionVO();
		calendarActionVO.setCalendarActionName("SendNotificationCalendarAction");
		calendarActionVO.setCalendarActionData(dataVOList);		
		List<CalendarActionVO> perOccurCalendarActionList=new LinkedList<CalendarActionVO>();		
		perOccurCalendarActionList.add(calendarActionVO);		
		
		DataObjectVO dataObjectVO2=new DataObjectVO();
		dataObjectVO2.setDataKey("param2Key_complex");
		dataObjectVO2.setDataValue("1500");		
		dataObjectVO2.setDataType(CalendarDataType.CalendarDataType_LONG);
		dataVOList.add(dataObjectVO2);		
		
		addComplexDateEntityVO.setPerOccurCalendarActionList(perOccurCalendarActionList);			
		
		CalendarActionVO calendarActionVO2=new CalendarActionVO();
		calendarActionVO2.setCalendarActionName("MakeTaskOverdueCalendarAction");
		calendarActionVO2.setCalendarActionData(dataVOList);		
		List<CalendarActionVO> postOccurCalendarActionList=new LinkedList<CalendarActionVO>();
		postOccurCalendarActionList.add(calendarActionVO2);		
		addComplexDateEntityVO.setPostOccurCalendarActionList(postOccurCalendarActionList);			
		
		AddCalendarEntityResultVO b = CalendarOperationServiceRESTClient.addComplexDateCalendarEntity(addComplexDateEntityVO);
		System.out.println(b.isAddCalendarEntityResult());	
		System.out.println(b.getCalendarEntityId());		
	}	
	
	public static void queryUserCalendar(String userId){
		CalendarEntityMetaInfoListVO  calendarEntityMetaInfoListVO=CalendarOperationServiceRESTClient.getUserCalendarEntityList(userId);
		List<CalendarEntityMetaInfo> CalendarEntityMetaInfoList=calendarEntityMetaInfoListVO.getCalendarEntityMetaInfoList();
		for(CalendarEntityMetaInfo calendarEntityMetaInfo:CalendarEntityMetaInfoList){			
			System.out.println(calendarEntityMetaInfo.getCalendarEntityId());
			System.out.println(calendarEntityMetaInfo.getCalendarEntityUserId());
			System.out.println(calendarEntityMetaInfo.getCalendarEntityType());			
			System.out.println(calendarEntityMetaInfo.getCalendarActionMetaInfoList());
			System.out.println(calendarEntityMetaInfo.getCalendarEntityDataList());			
		}		
	}
	
	
	public static void main(String[] args){
		//addTimePointCalendarEntity();
		//addTimeRangeCalendarEntity();
		//addComplexCalendarEntity();
		queryUserCalendar("wangychu");
	}
}