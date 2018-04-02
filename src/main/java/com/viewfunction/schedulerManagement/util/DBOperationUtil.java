package com.viewfunction.schedulerManagement.util;

import java.util.List;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.access.DataContext;
import org.apache.cayenne.exp.Expression;
import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.query.SelectQuery;

import com.viewfunction.schedulerManagement.persistent.CalendarEntity;

public class DBOperationUtil {	
	public static List<CalendarEntity> getUserCalendar(String userId){		
		ObjectContext context = ServiceResourceHolder.getCayenneServerRuntime().getContext();;
		Expression queryExpression = ExpressionFactory.matchExp(CalendarEntity.CALENDAR_ENTITY_USER_ID_PROPERTY, userId);
		SelectQuery query = new SelectQuery(CalendarEntity.class,queryExpression);		
		List<CalendarEntity> calendarEntityRows = context.performQuery(query);		
		return calendarEntityRows;
	}
}
