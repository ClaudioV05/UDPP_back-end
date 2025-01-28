package com.udpp.app.application.service;

import com.udpp.app.application.port.ArchitectureServicePort;
import com.udpp.app.core.constant.ArchitectureConst;
import com.udpp.app.core.domain.Architecture;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ArchitectureService implements ArchitectureServicePort {
    @Override
    public List<Architecture> getArchitecturesDescription() {
        final int[] index = {0};
        List<Architecture> lstArchitecture = new ArrayList<>();

        Arrays.stream(ArchitectureConst.values()).forEach(architecture -> {
            lstArchitecture.add(new Architecture(index[0], architecture.getDescription()));
            index[0]++;
        });

        return lstArchitecture;
    }
}