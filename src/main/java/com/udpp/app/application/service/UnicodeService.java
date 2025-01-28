package com.udpp.app.application.service;

import com.udpp.app.application.port.UnicodeServicePort;
import org.springframework.stereotype.Service;

@Service
public class UnicodeService implements UnicodeServicePort {

    @Override
    public String setToUpper(String content) {
        return content.toUpperCase();
    }
}