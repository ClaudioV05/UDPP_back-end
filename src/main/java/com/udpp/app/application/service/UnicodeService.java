package com.udpp.app.application.service;

import com.udpp.app.application.port.UnicodeServicePort;

public class UnicodeService implements UnicodeServicePort {

    public String setToUpper(String content) {
        return content.toUpperCase();
    }
}