package com.udpp.app.adapter.generator.output.udppparameter;

import com.udpp.app.adapter.generator.input.mapper.Embedded;
import com.udpp.app.domain.constant.Api.Action;
import com.udpp.app.domain.constant.Api.Controller;
import com.udpp.app.port.output.MetadataServicePort;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashSet;

/// Unified Development Power Platform parameters controller.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@RestController
@RequestMapping(value = Controller.UDPP_PARAMETER)
public class UdppParametersController implements UdppParametersApi {

    private final MetadataServicePort _metadataService;
    private static final Logger _log = LoggerFactory.getLogger(UdppParametersController.class);

    @Autowired
    UdppParametersController(MetadataServicePort metadataService) {
        _metadataService = metadataService;
    }

    @PostConstruct
    public void call() {
        // ...
    }

    @PreDestroy
    public void destroy() {
        // ...
    }

    @GetMapping(value = {Action.TITLE})
    public ResponseEntity<Embedded> title() {
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getTitle());
    }

    @GetMapping(value = {Action.DESCRIPTION})
    public ResponseEntity<Embedded> description() {
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getDescription());
    }

    @GetMapping(value = {Action.ARCHITECTURE})
    public ResponseEntity<LinkedHashSet<Embedded>> architecture() {
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getArchitectureData());
    }

    @GetMapping(value = {Action.DATABASE})
    public ResponseEntity<LinkedHashSet<Embedded>> database() {
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getDatabasesData());
    }

    @GetMapping(value = {Action.DATABASES_ENGINEER})
    public ResponseEntity<LinkedHashSet<Embedded>> databaseEngineer() {
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getDatabasesEngineerData());
    }

    @GetMapping(value = {Action.DEVELOPMENT_ENVIRONMENT})
    public ResponseEntity<LinkedHashSet<Embedded>> developmentEnvironment() {
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getDevelopmentEnvironmentData());
    }

    @GetMapping(value = {Action.FORM})
    public ResponseEntity<LinkedHashSet<Embedded>> form() {
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getFormData());
    }
}