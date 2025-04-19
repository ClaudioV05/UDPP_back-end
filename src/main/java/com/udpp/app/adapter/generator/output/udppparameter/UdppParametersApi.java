package com.udpp.app.adapter.generator.output.udppparameter;

import com.udpp.app.adapter.generator.input.mapper.Embedded;
import com.udpp.app.domain.constant.Api.Action;
import com.udpp.app.domain.constant.StatusCode;
import com.udpp.app.domain.constant.StatusCodeText;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.LinkedHashSet;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Tag(name = "UdppParametersController")
public interface UdppParametersApi {


    /// The Unified Development Power Platform title.
    ///
    /// @return Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(operationId = "UdppParametersTitle",
            summary = "The Title",
            description = "The Unified Development Power Platform title.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_OK, description = StatusCodeText.HTTP_STATUS_OK),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_BAD_REQUEST, description = StatusCodeText.HTTP_STATUS_BAD_REQUEST),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_UNAUTHORIZED, description = StatusCodeText.HTTP_STATUS_UNAUTHORIZED),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_NOT_FOUND, description = StatusCodeText.HTTP_STATUS_NOT_FOUND),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_INTERNAL_SERVE_ERROR, description = StatusCodeText.HTTP_STATUS_INTERNAL_SERVE_ERROR)})
    @PostMapping(value = {Action.METADATA}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<Embedded> title();

    /// The Unified Development Power Platform description.
    ///
    /// @return Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The Description", description = "The Unified Development Power Platform description.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_OK, description = StatusCodeText.HTTP_STATUS_OK),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_BAD_REQUEST, description = StatusCodeText.HTTP_STATUS_BAD_REQUEST),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_UNAUTHORIZED, description = StatusCodeText.HTTP_STATUS_UNAUTHORIZED),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_NOT_FOUND, description = StatusCodeText.HTTP_STATUS_NOT_FOUND),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_INTERNAL_SERVE_ERROR, description = StatusCodeText.HTTP_STATUS_INTERNAL_SERVE_ERROR)})
    @PostMapping(value = {Action.METADATA}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<Embedded> description();

    /// The Unified Development Power Platform architecture.
    ///
    /// @return List of Architecture.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The Architecture", description = "The Unified Development Power Platform architecture.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_OK, description = StatusCodeText.HTTP_STATUS_OK),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_BAD_REQUEST, description = StatusCodeText.HTTP_STATUS_BAD_REQUEST),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_UNAUTHORIZED, description = StatusCodeText.HTTP_STATUS_UNAUTHORIZED),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_NOT_FOUND, description = StatusCodeText.HTTP_STATUS_NOT_FOUND),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_INTERNAL_SERVE_ERROR, description = StatusCodeText.HTTP_STATUS_INTERNAL_SERVE_ERROR)})
    @PostMapping(value = {Action.METADATA}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> architecture();

    /// The Unified Development Power Platform database.
    ///
    /// @return List of Database.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The Database", description = "The Unified Development Power Platform database.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_OK, description = StatusCodeText.HTTP_STATUS_OK),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_BAD_REQUEST, description = StatusCodeText.HTTP_STATUS_BAD_REQUEST),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_UNAUTHORIZED, description = StatusCodeText.HTTP_STATUS_UNAUTHORIZED),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_NOT_FOUND, description = StatusCodeText.HTTP_STATUS_NOT_FOUND),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_INTERNAL_SERVE_ERROR, description = StatusCodeText.HTTP_STATUS_INTERNAL_SERVE_ERROR)})
    @PostMapping(value = {Action.METADATA}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> database();

    /// The Unified Development Power Platform database engineer.
    ///
    /// @return List of Database engineer.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The Database Engineer", description = "The Unified Development Power Platform database engineer.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_OK, description = StatusCodeText.HTTP_STATUS_OK),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_BAD_REQUEST, description = StatusCodeText.HTTP_STATUS_BAD_REQUEST),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_UNAUTHORIZED, description = StatusCodeText.HTTP_STATUS_UNAUTHORIZED),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_NOT_FOUND, description = StatusCodeText.HTTP_STATUS_NOT_FOUND),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_INTERNAL_SERVE_ERROR, description = StatusCodeText.HTTP_STATUS_INTERNAL_SERVE_ERROR)})
    @PostMapping(value = {Action.METADATA},
            produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> databaseEngineer();

    /// The Unified Development Power Platform development environment.
    ///
    /// @return List of Development environment.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The Development Environment", description = "The Unified Development Power Platform development environment.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_OK, description = StatusCodeText.HTTP_STATUS_OK),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_BAD_REQUEST, description = StatusCodeText.HTTP_STATUS_BAD_REQUEST),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_UNAUTHORIZED, description = StatusCodeText.HTTP_STATUS_UNAUTHORIZED),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_NOT_FOUND, description = StatusCodeText.HTTP_STATUS_NOT_FOUND),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_INTERNAL_SERVE_ERROR, description = StatusCodeText.HTTP_STATUS_INTERNAL_SERVE_ERROR)})
    @PostMapping(value = {Action.METADATA}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> developmentEnvironment();

    /// The Unified Development Power Platform form.
    ///
    /// @return List of form.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @Operation(summary = "The Form", description = "The Unified Development Power Platform form.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_OK, description = StatusCodeText.HTTP_STATUS_OK),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_BAD_REQUEST, description = StatusCodeText.HTTP_STATUS_BAD_REQUEST),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_UNAUTHORIZED, description = StatusCodeText.HTTP_STATUS_UNAUTHORIZED),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_NOT_FOUND, description = StatusCodeText.HTTP_STATUS_NOT_FOUND),
            @ApiResponse(responseCode = StatusCode.HTTP_STATUS_INTERNAL_SERVE_ERROR, description = StatusCodeText.HTTP_STATUS_INTERNAL_SERVE_ERROR)})
    @PostMapping(value = {Action.METADATA}, produces = {APPLICATION_JSON_VALUE})
    ResponseEntity<LinkedHashSet<Embedded>> form();
}
