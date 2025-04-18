package com.udpp.app.adapter.generator.output.udppparameter;

import com.udpp.app.adapter.generator.input.mapper.Embedded;
import com.udpp.app.domain.constant.Controller;
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
@RequestMapping(value = Controller.UDPP_PARAMETER_PATH)
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

    @GetMapping(value = {Controller.TITLE_ENDPOINT_PATH})
    public ResponseEntity<Embedded> title() {
        _log.info("Request to {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getTitle());
    }

    @GetMapping(value = {Controller.DESCRIPTION_ENDPOINT_PATH})
    public ResponseEntity<Embedded> description() {
        _log.info("Request to {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getDescription());
    }

    @GetMapping(value = {Controller.ARCHITECTURES_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> architecture() {
        _log.info("Request to {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getArchitectureData());
    }

    @GetMapping(value = {Controller.DATABASES_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> database() {
        _log.info("Request to {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getDatabasesData());
    }

    @GetMapping(value = {Controller.DATABASES_ENGINEER_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> databaseEngineer() {
        _log.info("Request to {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getDatabasesEngineerData());
    }

    @GetMapping(value = {Controller.DEVELOPMENT_ENVIRONMENT_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> developmentEnvironment() {
        _log.info("Request to {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getDevelopmentEnvironmentData());
    }

    @GetMapping(value = {Controller.FORM_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> form() {
        _log.info("Request to {}", Thread.currentThread().getStackTrace()[1].getMethodName());
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.getFormData());
    }
}