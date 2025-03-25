package com.udpp.app.infrastructure.adapter.in.api.controller;

import com.udpp.app.infrastructure.adapter.in.api.mapper.Embedded;
import com.udpp.app.application.ports.MetadataServicePort;
import com.udpp.app.application.core.constant.ControllerConst;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashSet;

/// Unified Development Power Platform parameters - UDPP controller.
/// --
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@RestController
@RequestMapping(value = ControllerConst.UDPP_PARAMETER_PATH)
public final class UdppParametersController {
    private final MetadataServicePort _metadataService;

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

    /// The application title.
    ///
    /// @return MetaDataDto.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @GetMapping(value = {ControllerConst.TITLE_ENDPOINT_PATH})
    public ResponseEntity<Embedded> applicationTitle() {
        return new ResponseEntity<>(_metadataService.getTitle(), HttpStatus.OK);
    }

    /// The application description.
    ///
    /// @return MetaDataDto.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @GetMapping(value = {ControllerConst.DESCRIPTION_ENDPOINT_PATH})
    public ResponseEntity<Embedded> applicationDescription() throws Exception {
        return new ResponseEntity<>(_metadataService.getDescription(), HttpStatus.OK);
    }

    /// The architecture description.
    ///
    /// @return List of Architecture.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @GetMapping(value = {ControllerConst.ARCHITECTURES_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> architectures() {
        return new ResponseEntity<>(_metadataService.getArchitectureData(), HttpStatus.OK);
    }

    /// The database description.
    ///
    /// @return List of Database.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @GetMapping(value = {ControllerConst.DATABASES_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> databases() {
        return new ResponseEntity<>(_metadataService.getDatabasesData(), HttpStatus.OK);
    }

    /// The database engineer description.
    ///
    /// @return List of Database engineer.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @GetMapping(value = {ControllerConst.DATABASES_ENGINEER_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> databasesEngineer() {
        return new ResponseEntity<>(_metadataService.getDatabasesEngineerData(), HttpStatus.OK);
    }

    /// The development environment description.
    ///
    /// @return List of Development environment.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @GetMapping(value = {ControllerConst.DEVELOPMENT_ENVIRONMENT_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> developmentEnvironment() {
        return new ResponseEntity<>(_metadataService.getDevelopmentEnvironmentData(), HttpStatus.OK);
    }

    /// The development environment description.
    ///
    /// @return List of Development environment.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @GetMapping(value = {ControllerConst.FORM_ENDPOINT_PATH})
    public ResponseEntity<LinkedHashSet<Embedded>> form() {
        return new ResponseEntity<>(_metadataService.getFormData(), HttpStatus.OK);
    }
}