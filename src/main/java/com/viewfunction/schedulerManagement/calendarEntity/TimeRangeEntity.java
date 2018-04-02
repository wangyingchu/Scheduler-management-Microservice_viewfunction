package com.viewfunction.schedulerManagement.calendarEntity;

public interface TimeRangeEntity extends BaseCalendarEntity {	
	public long getStartTime() ;
	public void setStartTime(long startTime);
	public long getEndTime();
	public void setEndTime(long endTime);	
	public int getRepeatCount();
	public void setRepeatCount(int repeatCount);	
	public long getRepeatInterval();
	public void setRepeatInterval(long repeatInterval);
}