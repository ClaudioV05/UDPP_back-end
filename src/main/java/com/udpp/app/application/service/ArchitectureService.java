package com.udpp.app.application.service;

import com.udpp.app.application.port.ArchitectureServicePort;
import com.udpp.app.core.constant.ArchitectureConst;
import com.udpp.app.core.domain.Architecture;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArchitectureService implements ArchitectureServicePort {
    @Override
    public LinkedHashSet<Architecture> getArchitecturesDescription() {
        final int[] index = {0};
        LinkedHashSet<Architecture> lstItem = new LinkedHashSet<>();

        Arrays.stream(ArchitectureConst.values()).forEach(item -> {
            lstItem.add(new Architecture(index[0], item.getDescription()));
            index[0]++;
        });

        return lstItem;
    }
}