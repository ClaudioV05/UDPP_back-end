package com.udpp.app.adapter.input.udpp;

import com.udpp.app.adapter.input.dto.MetaTableDto;
import com.udpp.app.adapter.input.mapper.MetaDataDto;
import com.udpp.app.domain.constant.Controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Tag(name = "UdppController")
public interface UdppApi {

    /// To receive the schema of database and do the creation of the tables with their fields.
    ///
    /// @param metaData
    /// @return List<MetaDataDto>
    /// @throws Exception
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "To receive the schema of database and do the creation of the tables with their fields", description= "")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @PostMapping(value = {Controller.METADATA_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<List<MetaDataDto>> metaData(@Valid @RequestBody final List<com.udpp.app.adapter.input.dto.MetaDataDto> lstMetaData, final BindingResult bindingResult) throws Exception;

    /// To receive the table(s) with their field(s) that will generate the magic solution - UDPP.
    ///
    /// @param metaTable
    /// @return List<MetaTableDto>
    /// @throws Exception
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "To receive the table(s) with their field(s) that will generate the magic solution - UDPP", description= "")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @PostMapping(value = {Controller.METATABLE_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<List<MetaTableDto>> metaTable(@Valid @RequestBody final List<MetaTableDto> lstMetaTable) throws Exception;
}
