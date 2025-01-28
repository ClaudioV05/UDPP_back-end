package com.udpp.app.application.service;

import com.udpp.app.application.port.DatabaseEngineerServicePort;
import com.udpp.app.core.constant.DatabaseEngineerConst;
import com.udpp.app.core.domain.DatabaseEngineer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DatabaseEngineerService implements DatabaseEngineerServicePort {
    @Override
    public List<DatabaseEngineer> getDatabasesEngineerDescription() {
        final int[] index = {0};
        List<DatabaseEngineer> lstItem = new ArrayList<>();

        Arrays.stream(DatabaseEngineerConst.values()).forEach(item -> {
            lstItem.add(new DatabaseEngineer(index[0], item.getDescription()));
            index[0]++;
        });

        return lstItem;
    }
}