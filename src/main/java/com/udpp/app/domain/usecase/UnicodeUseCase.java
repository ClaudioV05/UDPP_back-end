package com.udpp.app.domain.usecase;

import com.udpp.app.port.input.UnicodeUseCasePort;
import org.springframework.stereotype.Service;

@Service
public class UnicodeUseCase implements UnicodeUseCasePort {
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