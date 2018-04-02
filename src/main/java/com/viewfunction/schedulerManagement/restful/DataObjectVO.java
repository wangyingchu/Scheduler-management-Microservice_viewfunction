package com.viewfunction.schedulerManagement.restful;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DataObjectVO")
public class DataObjectVO {
	private String dataKey;
	private String dataValue;
	private String dataType;
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