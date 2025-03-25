package com.udpp.app.infrastructure.adapter.in.api.controller;

import com.udpp.app.infrastructure.adapter.in.api.mapper.MetaDataDto;
import com.udpp.app.infrastructure.adapter.in.api.dto.MetaTableDto;
import com.udpp.app.application.ports.MetadataServicePort;
import com.udpp.app.application.core.constant.ControllerConst;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/// Unified Development Power Platform - UDPP controller.
/// --
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@RestController
@RequestMapping(value = ControllerConst.UDPP_PATH)
public final class UdppController {
    private final MetadataServicePort _metadataService;

    @Autowired
    UdppController(MetadataServicePort metadataService) {
        _metadataService = metadataService;
    }

    /// To receive the schema of database and do the creation of the tables with their fields.
    ///
    /// @param metaData
    /// @return List<MetaDataDto>
    /// @throws Exception
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @PostMapping(value = {ControllerConst.METADATA_ENDPOINT_PATH})
    public ResponseEntity<List<MetaDataDto>> metaData(@Valid @RequestBody final List<com.udpp.app.infrastructure.adapter.in.api.dto.MetaDataDto> lstMetaData, final BindingResult bindingResult) throws Exception {
        return new ResponseEntity<>(_metadataService.generateMetaData(lstMetaData, bindingResult), HttpStatus.OK);
    }

    /// To receive the table(s) with their field(s) that will generate the magic solution - UDPP.
    ///
    /// @param metaTable
    /// @return List<MetaTableDto>
    /// @throws Exception
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @PostMapping(value = {ControllerConst.METATABLE_ENDPOINT_PATH})
    public ResponseEntity<List<MetaTableDto>> metaTable(@Valid @RequestBody final List<MetaTableDto> lstMetaTable) throws Exception {
        return new ResponseEntity<>(_metadataService.generateMetaTable(lstMetaTable), HttpStatus.OK);
    }
}