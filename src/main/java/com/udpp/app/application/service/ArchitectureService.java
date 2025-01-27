package com.udpp.app.application.service;

import com.udpp.app.application.port.ArchitectureServicePort;
import com.udpp.app.core.constant.Architecture;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArchitectureService implements ArchitectureServicePort {

    @Override
    public List<Architecture> getArchitecturesDescription() {
        return Arrays.asList(Architecture.values());
    }
}