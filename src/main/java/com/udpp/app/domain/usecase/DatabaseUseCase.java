package com.udpp.app.domain.usecase;

import com.udpp.app.port.input.DatabaseUseCasePort;
import com.udpp.app.port.input.UnicodeUseCasePort;
import com.udpp.app.domain.type.Database;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Service
public class DatabaseUseCase implements DatabaseUseCasePort {

    private final UnicodeUseCasePort _unicodeService;

    public DatabaseUseCase(UnicodeUseCasePort _unicodeService) {
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