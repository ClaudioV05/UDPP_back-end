package com.udpp.app.domain.usecase;

import com.udpp.app.port.input.DatabaseEngineerUseCasePort;
import com.udpp.app.port.input.UnicodeUseCasePort;
import com.udpp.app.domain.type.DatabaseEngineer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Service
public class DatabaseEngineerUseCase implements DatabaseEngineerUseCasePort {

    private final UnicodeUseCasePort _unicodeService;

    public DatabaseEngineerUseCase(UnicodeUseCasePort _unicodeService) {
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