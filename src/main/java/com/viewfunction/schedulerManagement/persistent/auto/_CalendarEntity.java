package com.viewfunction.schedulerManagement.persistent.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import com.viewfunction.schedulerManagement.persistent.CalendarAction;
import com.viewfunction.schedulerManagement.persistent.CalendarDataObject;

/**
 * Class _CalendarEntity was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CalendarEntity extends CayenneDataObject {

    public static final String CALENDAR_ENTITY_ID_PROPERTY = "calendarEntityId";
    public static final String CALENDAR_ENTITY_TYPE_PROPERTY = "calendarEntityType";
    public static final String CALENDAR_ENTITY_USER_ID_PROPERTY = "calendarEntityUserId";
    public static final String CALENDAR_SCOPE_PROPERTY = "calendarScope";
    public static final String ENTITY_OCCUR_CRON_EXPRESSION_PROPERTY = "entityOccurCronExpression";
    public static final String ENTITY_OCCUR_END_TIME_PROPERTY = "entityOccurEndTime";
    public static final String ENTITY_OCCUR_START_TIME_PROPERTY = "entityOccurStartTime";
    public static final String ENTITY_OCCUR_TIME_PROPERTY = "entityOccurTime";
    public static final String ENTITY_REPEAT_COUNT_PROPERTY = "entityRepeatCount";
    public static final String ENTITY_REPEAT_INTERVAL_PROPERTY = "entityRepeatInterval";
    public static final String CALENDAR_ACTION_LIST_PROPERTY = "calendarActionList";
    public static final String CALENDAR_ENTITY_DATA_LIST_PROPERTY = "calendarEntityDataList";

    public static final String CALENDAR_ENTITY_ID_PK_COLUMN = "calendarEntityId";

    public void setCalendarEntityId(String calendarEntityId) {
        writeProperty("calendarEntityId", calendarEntityId);
    }
    public String getCalendarEntityId() {
        return (String)readProperty("calendarEntityId");
    }

    public void setCalendarEntityType(String calendarEntityType) {
        writeProperty("calendarEntityType", calendarEntityType);
    }
    public String getCalendarEntityType() {
        return (String)readProperty("calendarEntityType");
    }

    public void setCalendarEntityUserId(String calendarEntityUserId) {
        writeProperty("calendarEntityUserId", calendarEntityUserId);
    }
    public String getCalendarEntityUserId() {
        return (String)readProperty("calendarEntityUserId");
    }

    public void setCalendarScope(String calendarScope) {
        writeProperty("calendarScope", calendarScope);
    }
    public String getCalendarScope() {
        return (String)readProperty("calendarScope");
    }

    public void setEntityOccurCronExpression(String entityOccurCronExpression) {
        writeProperty("entityOccurCronExpression", entityOccurCronExpression);
    }
    public String getEntityOccurCronExpression() {
        return (String)readProperty("entityOccurCronExpression");
    }

    public void setEntityOccurEndTime(Long entityOccurEndTime) {
        writeProperty("entityOccurEndTime", entityOccurEndTime);
    }
    public Long getEntityOccurEndTime() {
        return (Long)readProperty("entityOccurEndTime");
    }

    public void setEntityOccurStartTime(Long entityOccurStartTime) {
        writeProperty("entityOccurStartTime", entityOccurStartTime);
    }
    public Long getEntityOccurStartTime() {
        return (Long)readProperty("entityOccurStartTime");
    }

    public void setEntityOccurTime(Long entityOccurTime) {
        writeProperty("entityOccurTime", entityOccurTime);
    }
    public Long getEntityOccurTime() {
        return (Long)readProperty("entityOccurTime");
    }

    public void setEntityRepeatCount(Integer entityRepeatCount) {
        writeProperty("entityRepeatCount", entityRepeatCount);
    }
    public Integer getEntityRepeatCount() {
        return (Integer)readProperty("entityRepeatCount");
    }

    public void setEntityRepeatInterval(Long entityRepeatInterval) {
        writeProperty("entityRepeatInterval", entityRepeatInterval);
    }
    public Long getEntityRepeatInterval() {
        return (Long)readProperty("entityRepeatInterval");
    }

    public void addToCalendarActionList(CalendarAction obj) {
        addToManyTarget("calendarActionList", obj, true);
    }
    public void removeFromCalendarActionList(CalendarAction obj) {
        removeToManyTarget("calendarActionList", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CalendarAction> getCalendarActionList() {
        return (List<CalendarAction>)readProperty("calendarActionList");
    }


    public void addToCalendarEntityDataList(CalendarDataObject obj) {
        addToManyTarget("calendarEntityDataList", obj, true);
    }
    public void removeFromCalendarEntityDataList(CalendarDataObject obj) {
        removeToManyTarget("calendarEntityDataList", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<CalendarDataObject> getCalendarEntityDataList() {
        return (List<CalendarDataObject>)readProperty("calendarEntityDataList");
    }


}