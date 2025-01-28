package com.udpp.app.application.service;

import com.udpp.app.application.port.DatabaseServicePort;
import com.udpp.app.core.constant.DatabaseConst;
import com.udpp.app.core.domain.Database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseService implements DatabaseServicePort {
    @Override
    public List<Database> getDatabasesDescription() {
        final int[] index = {0};
        List<Database> lstItem = new ArrayList<>();

        Arrays.stream(DatabaseConst.values()).forEach(item -> {
            lstItem.add(new Database(index[0], item.getDescription()));
            index[0]++;
        });

        return lstItem;
    }
}