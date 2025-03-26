package com.udpp.app.application.core.service;

import com.udpp.app.application.ports.DevelopmentEnvironmentServicePort;
import com.udpp.app.application.ports.UnicodeServicePort;
import com.udpp.app.application.core.constant.DevelopmentEnvironmentConst;
import com.udpp.app.application.core.domain.DevelopmentEnvironment;
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
    public LinkedHashSet<DevelopmentEnvironment> getData() {
        final int[] index = {0};
        LinkedHashSet<DevelopmentEnvironment> lstItem = new LinkedHashSet<>();

        Arrays.stream(DevelopmentEnvironmentConst.values()).forEach(item -> {
            lstItem.add(new DevelopmentEnvironment(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}