package com.udpp.app.adapter.input.udpp;

import com.udpp.app.adapter.input.mapper.MetaDataDto;
import com.udpp.app.adapter.input.dto.MetaTableDto;
import com.udpp.app.port.output.MetadataServicePort;
import com.udpp.app.domain.constant.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/// Unified Development Power Platform - UDPP controller.
/// --
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@RestController
@RequestMapping(value = Controller.UDPP_PATH)
@Validated
public class UdppController implements UdppApi {

    private final MetadataServicePort _metadataService;
    private static final Logger _log = LoggerFactory.getLogger(UdppController.class);

    @Autowired
    UdppController(MetadataServicePort metadataService) {
        _metadataService = metadataService;
    }

    @Override
    public ResponseEntity<List<MetaDataDto>> metaData(final List<com.udpp.app.adapter.input.dto.MetaDataDto> lstMetaData, final BindingResult bindingResult) throws Exception {
        _log.info("Request to metaData: {}", lstMetaData);
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.generateMetaData(lstMetaData, bindingResult));
    }

    @Override
    public ResponseEntity<List<MetaTableDto>> metaTable(final List<MetaTableDto> lstMetaTable) throws Exception {
        _log.info("Request to metaTable: {}", lstMetaTable);
        return ResponseEntity.status(HttpStatus.OK).body(_metadataService.generateMetaTable(lstMetaTable));
    }
}