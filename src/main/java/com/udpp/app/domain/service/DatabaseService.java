package com.udpp.app.domain.service;

import com.udpp.app.port.input.DatabaseServicePort;
import com.udpp.app.port.input.UnicodeServicePort;
import com.udpp.app.domain.type.Database;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Service
public class DatabaseService implements DatabaseServicePort {

    private final UnicodeServicePort _unicodeService;

    public DatabaseService(UnicodeServicePort _unicodeService) {
        this._unicodeService = _unicodeService;
    }

    @Override
    public LinkedHashSet<com.udpp.app.domain.entity.Database> getData() {
        final int[] index = {0};
        LinkedHashSet<com.udpp.app.domain.entity.Database> lstItem = new LinkedHashSet<>();

        Arrays.stream(Database.values()).forEach(item -> {
            lstItem.add(new com.udpp.app.domain.entity.Database(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}