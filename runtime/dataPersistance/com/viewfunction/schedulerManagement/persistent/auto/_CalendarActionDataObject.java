package com.viewfunction.schedulerManagement.persistent.auto;

import org.apache.cayenne.CayenneDataObject;

import com.viewfunction.schedulerManagement.persistent.CalendarAction;

/**
 * Class _CalendarActionDataObject was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _CalendarActionDataObject extends CayenneDataObject {

    public static final String DATA_KEY_PROPERTY = "dataKey";
    public static final String DATA_TYPE_PROPERTY = "dataType";
    public static final String DATA_VALUE_PROPERTY = "dataValue";
    public static final String CALENDAR_ACTION_PROPERTY = "calendarAction";

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

    public void setCalendarAction(CalendarAction calendarAction) {
        setToOneTarget("calendarAction", calendarAction, true);
    }

    public CalendarAction getCalendarAction() {
        return (CalendarAction)readProperty("calendarAction");
    }


}