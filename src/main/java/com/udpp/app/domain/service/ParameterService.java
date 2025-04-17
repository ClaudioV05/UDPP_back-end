package com.udpp.app.domain.service;

import com.udpp.app.port.input.ParameterServicePort;
import com.udpp.app.port.input.UnicodeServicePort;
import com.udpp.app.domain.constant.Application;
import org.springframework.stereotype.Service;

@Service
public class ParameterService implements ParameterServicePort {
    private final UnicodeServicePort _unicodeService;

    public ParameterService(UnicodeServicePort unicodeService) {
        this._unicodeService = unicodeService;
    }

    @Override
    public String getTitle() {
        return _unicodeService.setToUpper(Application.TITLE);
    }

    @Override
    public String getDescription() {
        return Application.DESCRIPTION;
    }
}