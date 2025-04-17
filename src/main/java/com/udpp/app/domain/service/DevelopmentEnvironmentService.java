package com.udpp.app.domain.service;

import com.udpp.app.port.input.DevelopmentEnvironmentServicePort;
import com.udpp.app.port.input.UnicodeServicePort;
import com.udpp.app.domain.type.DevelopmentEnvironment;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Service
public class DevelopmentEnvironmentService implements DevelopmentEnvironmentServicePort {

    private final UnicodeServicePort _unicodeService;

    public DevelopmentEnvironmentService(UnicodeServicePort _unicodeService) {
        this._unicodeService = _unicodeService;
    }

    @Override
    public LinkedHashSet<com.udpp.app.domain.entity.DevelopmentEnvironment> getData() {
        final int[] index = {0};
        LinkedHashSet<com.udpp.app.domain.entity.DevelopmentEnvironment> lstItem = new LinkedHashSet<>();

        Arrays.stream(DevelopmentEnvironment.values()).forEach(item -> {
            lstItem.add(new com.udpp.app.domain.entity.DevelopmentEnvironment(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}