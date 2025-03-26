package com.udpp.app.application.core.service;

import com.udpp.app.application.ports.FormServicePort;
import com.udpp.app.application.ports.UnicodeServicePort;
import com.udpp.app.application.core.constant.FormConst;
import com.udpp.app.application.core.domain.Form;
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