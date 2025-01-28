package com.udpp.app.application.service;

import com.udpp.app.application.port.DevelopmentEnvironmentServicePort;
import com.udpp.app.core.constant.DevelopmentEnvironmentConst;
import com.udpp.app.core.domain.DevelopmentEnvironment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DevelopmentEnvironmentService implements DevelopmentEnvironmentServicePort {
    @Override
    public List<DevelopmentEnvironment> getDevelopmentEnvironmentDescription() {
        final int[] index = {0};
        List<DevelopmentEnvironment> lstItem = new ArrayList<>();

        Arrays.stream(DevelopmentEnvironmentConst.values()).forEach(item -> {
            lstItem.add(new DevelopmentEnvironment(index[0], item.getDescription()));
            index[0]++;
        });

        return lstItem;
    }
}