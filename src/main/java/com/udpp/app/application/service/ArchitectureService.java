package com.udpp.app.application.service;

import com.udpp.app.application.port.ArchitectureServicePort;
import com.udpp.app.application.port.UnicodeServicePort;
import com.udpp.app.core.constant.ArchitectureConst;
import com.udpp.app.core.domain.Architecture;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArchitectureService implements ArchitectureServicePort {

    private final UnicodeServicePort _unicodeService;

    public ArchitectureService(UnicodeServicePort unicodeService) {
        this._unicodeService = unicodeService;
    }

    @Override
    public LinkedHashSet<Architecture> getData() {
        final int[] index = {0};
        LinkedHashSet<Architecture> lstItem = new LinkedHashSet<>();

        Arrays.stream(ArchitectureConst.values()).forEach(item -> {
            lstItem.add(new Architecture(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}