package com.udpp.app.adapter.generator.input.udpp;

import com.udpp.app.adapter.generator.dto.request.MetaData;
import com.udpp.app.adapter.generator.dto.request.MetaTable;
import com.udpp.app.adapter.generator.input.mapper.MetaDataDto;
import com.udpp.app.domain.constant.Controller;
import com.udpp.app.domain.constant.StatusCode;
import com.udpp.app.domain.constant.StatusCodeText;
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
    /// @return List<MetaData>
    /// @throws Exception
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The metaData", description= "To receive the schema of database and do the creation of the tables with their fields")
    @ApiResponses(value = {
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_OK, description = StatusCodeText.HTTP_STATUS_OK),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_BAD_REQUEST, description = StatusCodeText.HTTP_STATUS_BAD_REQUEST),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_NOT_FOUND, description = StatusCodeText.HTTP_STATUS_NOT_FOUND),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_INTERNAL_SERVE_ERROR, description = StatusCodeText.HTTP_STATUS_INTERNAL_SERVE_ERROR)})
    @PostMapping(value = {Controller.METADATA_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<List<MetaDataDto>> metaData(@Valid @RequestBody final List<MetaData> lstMetaData, final BindingResult bindingResult) throws Exception;

    /// To receive the table(s) with their field(s) that will generate the magic solution - UDPP.
    ///
    /// @param metaTable
    /// @return List<MetaTable>
    /// @throws Exception
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The metaTable", description= "To receive the table(s) with their field(s) that will generate the magic solution - UDPP")
    @ApiResponses(value = {
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_OK, description = StatusCodeText.HTTP_STATUS_OK),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_BAD_REQUEST, description = StatusCodeText.HTTP_STATUS_BAD_REQUEST),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_NOT_FOUND, description = StatusCodeText.HTTP_STATUS_NOT_FOUND),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_INTERNAL_SERVE_ERROR, description = StatusCodeText.HTTP_STATUS_INTERNAL_SERVE_ERROR)})
    @PostMapping(value = {Controller.METATABLE_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<List<MetaTable>> metaTable(@Valid @RequestBody final List<MetaTable> lstMetaTable) throws Exception;
}
