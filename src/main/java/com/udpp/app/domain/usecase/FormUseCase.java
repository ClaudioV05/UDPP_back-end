package com.udpp.app.domain.usecase;

import com.udpp.app.port.input.FormUseCasePort;
import com.udpp.app.port.input.UnicodeUseCasePort;
import com.udpp.app.domain.type.Form;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Service
public class FormUseCase implements FormUseCasePort {

    private final UnicodeUseCasePort _unicodeService;

    public FormUseCase(UnicodeUseCasePort unicodeService) {
        this._unicodeService = unicodeService;
    }

    @Override
    public LinkedHashSet<com.udpp.app.domain.entity.Form> getData() {
        final int[] index = {0};
        LinkedHashSet<com.udpp.app.domain.entity.Form> lstItem = new LinkedHashSet<>();

        Arrays.stream(Form.values()).forEach(item -> {
            lstItem.add(new com.udpp.app.domain.entity.Form(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}