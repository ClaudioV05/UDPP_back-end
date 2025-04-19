package com.udpp.app.domain.usecase;

import com.udpp.app.port.input.ArchitectureUseCasePort;
import com.udpp.app.port.input.UnicodeUseCasePort;
import com.udpp.app.domain.type.Architecture;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Service
public class ArchitectureUseCase implements ArchitectureUseCasePort {

    private final UnicodeUseCasePort _unicodeService;

    public ArchitectureUseCase(UnicodeUseCasePort unicodeService) {
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