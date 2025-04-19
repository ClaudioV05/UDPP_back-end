package com.udpp.app.domain.usecase;

import com.udpp.app.port.input.ParameterUseCasePort;
import com.udpp.app.port.input.UnicodeUseCasePort;
import com.udpp.app.domain.constant.Application;
import org.springframework.stereotype.Service;

@Service
public class ParameterUseCase implements ParameterUseCasePort {
    private final UnicodeUseCasePort _unicodeService;

    public ParameterUseCase(UnicodeUseCasePort unicodeService) {
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