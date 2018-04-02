package com.viewfunction.schedulerManagement.calendarEntity;

public class CalendarData {
	private String dataKey;
	private String dataValue;
	private String dataType;	
	public CalendarData(){};
	public CalendarData(String dataKey,String dataValue,String dataType){
		this.setDataKey(dataKey);
		this.setDataValue(dataValue);
		this.setDataType(dataType);
	};	
	public String getDataKey() {
		return dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}
	public String getDataValue() {
		return dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
}