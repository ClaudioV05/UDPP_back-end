package com.udpp.app.application.core.service;

import com.udpp.app.application.ports.ParameterServicePort;
import com.udpp.app.application.ports.UnicodeServicePort;
import com.udpp.app.application.core.constant.ApplicationConst;

public class ParameterService implements ParameterServicePort {
    private final UnicodeServicePort _unicodeService;

    public ParameterService(UnicodeServicePort unicodeService) {
        this._unicodeService = unicodeService;
    }

    @Override
    public String getTitle() {
        return _unicodeService.setToUpper(ApplicationConst.TITLE);
    }

    @Override
    public String getDescription() {
        return ApplicationConst.DESCRIPTION;
    }
}