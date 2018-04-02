package com.viewfunction.schedulerManagement.persistent;

import com.viewfunction.schedulerManagement.persistent.auto._SchedulerManagementPersistentMap;

public class SchedulerManagementPersistentMap extends _SchedulerManagementPersistentMap {

    private static SchedulerManagementPersistentMap instance;

    private SchedulerManagementPersistentMap() {}

    public static SchedulerManagementPersistentMap getInstance() {
        if(instance == null) {
            instance = new SchedulerManagementPersistentMap();
        }

        return instance;
    }
}
