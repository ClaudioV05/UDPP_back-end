package com.udpp.app.application.core.service;

import com.udpp.app.application.ports.ArchitectureServicePort;
import com.udpp.app.application.ports.UnicodeServicePort;
import com.udpp.app.application.core.constant.ArchitectureConst;
import com.udpp.app.application.core.domain.Architecture;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Service
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