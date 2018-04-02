package com.viewfunction.schedulerManagement.calendarEntity;

public interface ComplexDateEntity extends BaseCalendarEntity{
	public void setCronExpression(String cronExpression);
	public String getCronExpression();
}
