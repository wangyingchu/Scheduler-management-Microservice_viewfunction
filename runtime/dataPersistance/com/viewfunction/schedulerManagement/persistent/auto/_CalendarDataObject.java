package com.viewfunction.schedulerManagement.persistent.auto;

import org.apache.cayenne.CayenneDataObject;

import com.viewfunction.schedulerManagement.persistent.CalendarEntity;

/**
 * Class _CalendarDataObject was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CalendarDataObject extends CayenneDataObject {

    public static final String DATA_KEY_PROPERTY = "dataKey";
    public static final String DATA_TYPE_PROPERTY = "dataType";
    public static final String DATA_VALUE_PROPERTY = "dataValue";
    public static final String CALENDAR_ENTITY_PROPERTY = "calendarEntity";

    public static final String CALENDAR_DATA_ID_PK_COLUMN = "calendarDataId";

    public void setDataKey(String dataKey) {
        writeProperty("dataKey", dataKey);
    }
    public String getDataKey() {
        return (String)readProperty("dataKey");
    }

    public void setDataType(String dataType) {
        writeProperty("dataType", dataType);
    }
    public String getDataType() {
        return (String)readProperty("dataType");
    }

    public void setDataValue(String dataValue) {
        writeProperty("dataValue", dataValue);
    }
    public String getDataValue() {
        return (String)readProperty("dataValue");
    }

    public void setCalendarEntity(CalendarEntity calendarEntity) {
        setToOneTarget("calendarEntity", calendarEntity, true);
    }

    public CalendarEntity getCalendarEntity() {
        return (CalendarEntity)readProperty("calendarEntity");
    }


}
