package com.udpp.app.adapter.output.udppparameter;

import com.udpp.app.adapter.input.mapper.Embedded;
import com.udpp.app.domain.constant.Controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.LinkedHashSet;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Tag(name = "UdppController")
public interface UdppParametersApi {

    /// The application title.
    ///
    /// @return MetaDataDto.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The application title", description= "")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @PostMapping(value = {Controller.METADATA_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<Embedded> applicationTitle();

    /// The application description.
    ///
    /// @return MetaDataDto.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The application description", description= "")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @PostMapping(value = {Controller.METADATA_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<Embedded> applicationDescription();

    /// The architecture description.
    ///
    /// @return List of Architecture.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The architecture description", description= "")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @PostMapping(value = {Controller.METADATA_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> architectures();

    /// The database description.
    ///
    /// @return List of Database.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The database description", description= "")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @PostMapping(value = {Controller.METADATA_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> databases();

    /// The database engineer description.
    ///
    /// @return List of Database engineer.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The database engineer description", description= "")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @PostMapping(value = {Controller.METADATA_ENDPOINT_PATH},
            produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> databasesEngineer();

    /// The development environment description.
    ///
    /// @return List of Development environment.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The development environment description", description= "")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @PostMapping(value = {Controller.METADATA_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> developmentEnvironment();

    /// The form description.
    ///
    /// @return List of form.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The form description", description= "To receive the schema of database and do the creation of the tables with their fields.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @PostMapping(value = {Controller.METADATA_ENDPOINT_PATH}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> form();
}
