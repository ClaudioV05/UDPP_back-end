package com.udpp.app.application.service;

import com.udpp.app.application.port.DevelopmentEnvironmentServicePort;
import com.udpp.app.core.constant.DevelopmentEnvironmentConst;
import com.udpp.app.core.domain.DevelopmentEnvironment;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DevelopmentEnvironmentService implements DevelopmentEnvironmentServicePort {
    @Override
    public LinkedHashSet<DevelopmentEnvironment> getDevelopmentEnvironmentDescription() {
        final int[] index = {0};
        LinkedHashSet<DevelopmentEnvironment> lstItem = new LinkedHashSet<>();

        Arrays.stream(DevelopmentEnvironmentConst.values()).forEach(item -> {
            lstItem.add(new DevelopmentEnvironment(index[0], item.getDescription()));
            index[0]++;
        });

        return lstItem;
    }
}