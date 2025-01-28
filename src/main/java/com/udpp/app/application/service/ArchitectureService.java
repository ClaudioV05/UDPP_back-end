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
        int index = 0;
        List<Architecture> lstArchitecture = new ArrayList<>();

        for (ArchitectureConst architecture : ArchitectureConst.values()){
            lstArchitecture.add(new Architecture(index, architecture.getKey()));
            index++;
        }

        return lstArchitecture;
    }
}