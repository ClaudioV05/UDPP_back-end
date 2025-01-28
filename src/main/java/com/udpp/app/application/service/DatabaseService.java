package com.udpp.app.application.service;

import com.udpp.app.application.port.DatabaseServicePort;
import com.udpp.app.core.constant.DatabaseConst;
import com.udpp.app.core.domain.Database;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DatabaseService implements DatabaseServicePort {
    @Override
    public LinkedHashSet<Database> getDatabasesDescription() {
        final int[] index = {0};
        LinkedHashSet<Database> lstItem = new LinkedHashSet<>();

        Arrays.stream(DatabaseConst.values()).forEach(item -> {
            lstItem.add(new Database(index[0], item.getDescription()));
            index[0]++;
        });

        return lstItem;
    }
}