package com.udpp.app.core.constant;

public enum Architecture {
    DDD("Not Defined"),
    HEXAGONAL("Hexagonal"),
    MEDIATRCQRS("Domain Driven Design"),
    MVC("Model view controller");

    Architecture(String architecture) {
    }
}