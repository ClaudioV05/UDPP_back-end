package com.udpp.app.application.service;

import com.udpp.app.application.port.DatabaseEngineerServicePort;
import com.udpp.app.core.constant.DatabaseEngineerConst;
import com.udpp.app.core.domain.DatabaseEngineer;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DatabaseEngineerService implements DatabaseEngineerServicePort {
    @Override
    public LinkedHashSet<DatabaseEngineer> getDatabasesEngineerDescription() {
        final int[] index = {0};
        LinkedHashSet<DatabaseEngineer> lstItem = new LinkedHashSet<>();

        Arrays.stream(DatabaseEngineerConst.values()).forEach(item -> {
            lstItem.add(new DatabaseEngineer(index[0], item.getDescription()));
            index[0]++;
        });

        return lstItem;
    }
}