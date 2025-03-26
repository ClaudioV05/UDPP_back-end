package com.udpp.app.application.core.service;

import com.udpp.app.application.ports.UnicodeServicePort;
import org.springframework.stereotype.Service;

@Service
public class UnicodeService implements UnicodeServicePort {
    @Override
    public String setToUpper(String content) {
        return content.toUpperCase();
    }

    @Override
    public String setToLower(String content) {
        return content.toLowerCase();
    }

    @Override
    public String setStringEmpty() {
        return "";
    }

    @Override
    public int getLastIndexOf(String content, String itemToFind) {
       return content.lastIndexOf(itemToFind);
    }

    @Override
    public String setSubstring(String content, int startPosition, int length) {
        return content.substring(startPosition, length);
    }
}