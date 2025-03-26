package com.udpp.app.application.core.service;

import com.udpp.app.application.ports.LogServicePort;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class LogService implements LogServicePort {

    @Override
    public void registerLog(String object, String message) {
        Logger logger = Logger.getLogger(object);
        logger.log(Level.WARNING, message);
    }
}