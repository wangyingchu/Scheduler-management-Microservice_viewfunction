package com.viewfunction.schedulerManagement.restfulClient;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

import com.viewfunction.schedulerManagement.restful.AddCalendarEntityResultVO;
import com.viewfunction.schedulerManagement.restful.AddComplexDateCalendarEntityVO;
import com.viewfunction.schedulerManagement.restful.AddTimePointCalendarEntityVO;
import com.viewfunction.schedulerManagement.restful.AddTimeRangeCalendarEntityVO;
import com.viewfunction.schedulerManagement.restful.CalendarEntityMetaInfoListVO;

public class CalendarOperationServiceRESTClient {		
	public static AddCalendarEntityResultVO addTimePointCalendarEntity(AddTimePointCalendarEntityVO addCalendarEntityVO){
		WebClient client = WebClient.create(RESTClientConfigUtil.getREST_baseURLValue());
		client.path("calendarOperationService/addTimePointCalendarEntity");		
		client.type("application/xml").accept("application/xml");
		Response response = client.post(addCalendarEntityVO);
		AddCalendarEntityResultVO addCalendarEntityResultVO = response.readEntity(AddCalendarEntityResultVO.class);
		return addCalendarEntityResultVO;
	}
	
	public static AddCalendarEntityResultVO addTimeRangeCalendarEntity(AddTimeRangeCalendarEntityVO addCalendarEntityVO){
		WebClient client = WebClient.create(RESTClientConfigUtil.getREST_baseURLValue());
		client.path("calendarOperationService/addTimeRangeCalendarEntity");		
		client.type("application/xml").accept("application/xml");
		Response response = client.post(addCalendarEntityVO);
		AddCalendarEntityResultVO addCalendarEntityResultVO = response.readEntity(AddCalendarEntityResultVO.class);
		return addCalendarEntityResultVO;
	}
	
	public static AddCalendarEntityResultVO addComplexDateCalendarEntity(AddComplexDateCalendarEntityVO addCalendarEntityVO){
		WebClient client = WebClient.create(RESTClientConfigUtil.getREST_baseURLValue());
		client.path("calendarOperationService/addComplexDateCalendarEntity");		
		client.type("application/xml").accept("application/xml");
		Response response = client.post(addCalendarEntityVO);
		AddCalendarEntityResultVO addCalendarEntityResultVO = response.readEntity(AddCalendarEntityResultVO.class);
		return addCalendarEntityResultVO;		
	}
	
	public static CalendarEntityMetaInfoListVO getUserCalendarEntityList(String userId){		
		WebClient client = WebClient.create(RESTClientConfigUtil.getREST_baseURLValue());
		client.type("application/xml").accept("application/xml");
		String basicPath="calendarOperationService/getUserCalendarEntities/";		
		client.path(basicPath+userId);				
		Response response =client.get();		
		CalendarEntityMetaInfoListVO calendarEntityMetaInfoListVO=response.readEntity(CalendarEntityMetaInfoListVO.class);		
		return calendarEntityMetaInfoListVO;
	}
}