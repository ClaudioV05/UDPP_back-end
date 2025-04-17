package com.udpp.app.domain.service;

import com.udpp.app.port.input.DatabaseEngineerServicePort;
import com.udpp.app.port.input.UnicodeServicePort;
import com.udpp.app.domain.type.DatabaseEngineer;
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
    public LinkedHashSet<com.udpp.app.domain.entity.DatabaseEngineer> getData() {
        final int[] index = {0};
        LinkedHashSet<com.udpp.app.domain.entity.DatabaseEngineer> lstItem = new LinkedHashSet<>();

        Arrays.stream(DatabaseEngineer.values()).forEach(item -> {
            lstItem.add(new com.udpp.app.domain.entity.DatabaseEngineer(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}