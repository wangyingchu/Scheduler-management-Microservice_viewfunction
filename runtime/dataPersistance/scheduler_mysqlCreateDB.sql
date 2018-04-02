use schedulerdb;
CREATE TABLE CalendarEntity (calendarEntityId VARCHAR(100) NOT NULL, calendarEntityType VARCHAR(100) NOT NULL, calendarEntityUserId VARCHAR(100) NULL, calendarScope VARCHAR(100) NULL, entityOccurCronExpression VARCHAR(400) NULL, entityOccurEndTime BIGINT NULL, entityOccurStartTime BIGINT NULL, entityOccurTime BIGINT NULL, entityRepeatCount INT NULL, entityRepeatInterval BIGINT NULL, PRIMARY KEY (calendarEntityId)) ENGINE=InnoDB
;

CREATE TABLE CalendarEntityDataObject (calendarDataId VARCHAR(100) NOT NULL, calendarEntityId VARCHAR(100) NOT NULL, dataKey VARCHAR(300) NULL, dataType VARCHAR(20) NULL, dataValue LONGTEXT NULL, PRIMARY KEY (calendarDataId)) ENGINE=InnoDB
;

CREATE TABLE CalendarAction (calendarActionId VARCHAR(100) NOT NULL, calendarActionName VARCHAR(400) NULL, calendarActionType VARCHAR(50) NULL, calendarEntityId VARCHAR(100) NULL, PRIMARY KEY (calendarActionId)) ENGINE=InnoDB
;

CREATE TABLE CalendarActionDataObject (calendarActionId VARCHAR(100) NULL, calendarDataId VARCHAR(100) NOT NULL, dataKey VARCHAR(300) NULL, dataType VARCHAR(20) NULL, dataValue LONGTEXT NULL, PRIMARY KEY (calendarDataId)) ENGINE=InnoDB
;

ALTER TABLE CalendarEntityDataObject ADD FOREIGN KEY (calendarEntityId) REFERENCES CalendarEntity (calendarEntityId)
;

ALTER TABLE CalendarAction ADD FOREIGN KEY (calendarEntityId) REFERENCES CalendarEntity (calendarEntityId)
;

ALTER TABLE CalendarActionDataObject ADD FOREIGN KEY (calendarActionId) REFERENCES CalendarAction (calendarActionId)
;

CREATE TABLE AUTO_PK_SUPPORT (  TABLE_NAME CHAR(100) NOT NULL,  NEXT_ID BIGINT NOT NULL, UNIQUE (TABLE_NAME))
;

DELETE FROM AUTO_PK_SUPPORT WHERE TABLE_NAME IN ('CalendarAction', 'CalendarActionDataObject', 'CalendarEntity', 'CalendarEntityDataObject')
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('CalendarAction', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('CalendarActionDataObject', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('CalendarEntity', 200)
;

INSERT INTO AUTO_PK_SUPPORT (TABLE_NAME, NEXT_ID) VALUES ('CalendarEntityDataObject', 200)
;

