package com.udpp.app.application.service;

import com.udpp.app.application.port.FormServicePort;
import com.udpp.app.application.port.UnicodeServicePort;
import com.udpp.app.core.constant.FormConst;
import com.udpp.app.core.domain.Form;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FormService implements FormServicePort {

    private final UnicodeServicePort _unicodeService;

    public FormService(UnicodeServicePort unicodeService) {
        this._unicodeService = unicodeService;
    }

    @Override
    public LinkedHashSet<Form> getData() {
        final int[] index = {0};
        LinkedHashSet<Form> lstItem = new LinkedHashSet<>();

        Arrays.stream(FormConst.values()).forEach(item -> {
            lstItem.add(new Form(index[0], _unicodeService.setToUpper(item.getData())));
            index[0]++;
        });

        return lstItem;
    }
}