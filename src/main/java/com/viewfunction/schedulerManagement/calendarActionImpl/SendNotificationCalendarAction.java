package com.viewfunction.schedulerManagement.calendarActionImpl;

import java.util.Map;

import com.viewfunction.schedulerManagement.calendarAction.BaseCalendarAction;
import com.viewfunction.schedulerManagement.calendarEntity.CalendarData;

public class SendNotificationCalendarAction implements BaseCalendarAction{
	private Map<String, CalendarData> entityMap;
	private Map<String, CalendarData> actionMap;
	@Override
	public void executeCalendarAction() {
		System.out.println("executeCalendarAction-SendNotificationCalendarAction");
		System.out.println(this.actionMap);
		
		/* 
		  mockNotificationItemData["notificationType"] ="TYPE1";
                mockNotificationItemData["notificationStatus"] ="INFO";
               
                mockNotificationItemData["notificationSender"] ="王建伟A";
                mockNotificationItemData["notificationSentDate"]=new Date();                 
                mockNotificationItemData["notificationReceivers"]=["王颖初A","VFMA系统部A"];
                mockNotificationItemData["notificationSubject"] ="通知类型"+i;
                mockNotificationItemData["notificationContent"] ="通知类型content : /home/wangychu/Applications/tools/WebStorm-129.664/bin/webstorm.sh balabalabalabalabalabalabnalabnbalabalabal"+i;
                mockNotificationItemData["notificationObjectId"] ="notificationObjectId_"+i;
                mockNotificationItemData["notificationHandleable"] =true;
        */
		/*
		 String notificationType=getCalendarActionData().get("notificationType").getDataValue();
		 String notificationStatus=getCalendarActionData().get("notificationStatus").getDataValue();
		 String notificationSender=getCalendarActionData().get("notificationSender").getDataValue();
		 String notificationSentDate=getCalendarActionData().get("notificationSentDate").getDataValue();
		 String notificationReceivers=getCalendarActionData().get("notificationReceivers").getDataValue();
		 String notificationSubject=getCalendarActionData().get("notificationSubject").getDataValue();
		 String notificationContent=getCalendarActionData().get("notificationContent").getDataValue();
		 String notificationHandleable=getCalendarActionData().get("notificationHandleable").getDataValue();
		 
		
		
		
		if(notificationType.equals("ACTIVITY_TASK")){};
		if(notificationType.equals("EXTERNAL_RESOURCE")){
			
			
			
		};
		*/
		
		
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
		return "SendNotificationCalendarAction";
	}
}