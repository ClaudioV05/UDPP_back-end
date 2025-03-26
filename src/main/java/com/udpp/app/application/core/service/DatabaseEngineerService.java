package com.udpp.app.application.core.service;

import com.udpp.app.application.ports.DatabaseEngineerServicePort;
import com.udpp.app.application.ports.UnicodeServicePort;
import com.udpp.app.application.core.constant.DatabaseEngineerConst;
import com.udpp.app.application.core.domain.DatabaseEngineer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Service
public class DatabaseEngineerService implements DatabaseEngineerServicePort {

    private final UnicodeServicePort _unicodeService;

    public DatabaseEngineerService(UnicodeServicePort _unicodeService) {
        this._unicodeService = _unicodeService;
    }

    @Override
    public LinkedHashSet<DatabaseEngineer> getData() {
        final int[] index = {0};
        LinkedHashSet<DatabaseEngineer> lstItem = new LinkedHashSet<>();

        Arrays.stream(DatabaseEngineerConst.values()).forEach(item -> {
            lstItem.add(new DatabaseEngineer(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}