package com.udpp.app.application.service;

import com.udpp.app.application.port.DatabaseServicePort;
import com.udpp.app.core.constant.DatabaseConst;
import com.udpp.app.core.domain.Database;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DatabaseService implements DatabaseServicePort {
    @Override
    public List<Database> getDatabasesDescription() {
        final int[] index = {0};
        List<Database> lstDatabase = new ArrayList<>();

        Arrays.stream(DatabaseConst.values()).forEach(item -> {
            lstDatabase.add(new Database(index[0], item.getDescription()));
            index[0]++;
        });

        return lstDatabase;
    }
}