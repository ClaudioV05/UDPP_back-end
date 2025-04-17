package com.udpp.app.domain.service;

import com.udpp.app.port.input.FormServicePort;
import com.udpp.app.port.input.UnicodeServicePort;
import com.udpp.app.domain.type.Form;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedHashSet;

@Service
public class FormService implements FormServicePort {

    private final UnicodeServicePort _unicodeService;

    public FormService(UnicodeServicePort unicodeService) {
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