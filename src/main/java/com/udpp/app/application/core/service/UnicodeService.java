package com.udpp.app.application.core.service;

import com.udpp.app.application.ports.UnicodeServicePort;

public class UnicodeService implements UnicodeServicePort {
    @Override
    public String setToUpper(String content) {
        return content.toUpperCase();
    }

    @Override
    public String setToLower(String content) {
        return content.toLowerCase();
    }

    public String setStringEmpty() {
        return "";
    }
}