package com.udpp.app.application.core.service;

import com.udpp.app.application.ports.DatabaseServicePort;
import com.udpp.app.application.ports.UnicodeServicePort;
import com.udpp.app.application.core.constant.DatabaseConst;
import com.udpp.app.application.core.domain.Database;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DatabaseService implements DatabaseServicePort {

    private final UnicodeServicePort _unicodeService;

    public DatabaseService(UnicodeServicePort _unicodeService) {
        this._unicodeService = _unicodeService;
    }

    @Override
    public LinkedHashSet<Database> getData() {
        final int[] index = {0};
        LinkedHashSet<Database> lstItem = new LinkedHashSet<>();

        Arrays.stream(DatabaseConst.values()).forEach(item -> {
            lstItem.add(new Database(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}