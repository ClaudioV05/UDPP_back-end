package com.udpp.app.domain.service;

import com.udpp.app.port.input.ArchitectureServicePort;
import com.udpp.app.port.input.UnicodeServicePort;
import com.udpp.app.domain.type.Architecture;
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
    public LinkedHashSet<com.udpp.app.domain.entity.Architecture> getData() {
        final int[] index = {0};
        LinkedHashSet<com.udpp.app.domain.entity.Architecture> lstItem = new LinkedHashSet<>();

        Arrays.stream(Architecture.values()).forEach(item -> {
            lstItem.add(new com.udpp.app.domain.entity.Architecture(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}