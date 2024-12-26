package com.service.unified_development_power_platform.Presentation.Api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.service.unified_development_power_platform.Application.Services.ServiceImpUnifiedDevelopmentPowerPlatform;
import com.service.unified_development_power_platform.Presentation.Api.Models.DtoMetadata;
import com.service.unified_development_power_platform.Presentation.Api.Models.DtoTablesdata;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Controller Unified Development Power Platform - UDPP.
 * <p>
 * --
 *
 * @since 1.0
 * @see
 */
@RestController
@JsonIgnoreProperties(ignoreUnknown = true)
@RequestMapping("/UnifiedDevelopmentPowerPlatformController")
public class UnifiedDevelopmentPowerPlatformController {

	/**
	 * Constructor of controller unified development power platform.
	 * <p>
	 * --
	 *
	 * @since 1.0
	 * @see
	 */
	private final ServiceImpUnifiedDevelopmentPowerPlatform _serviceImpUnifiedDevelopmentPowerPlatform;

	@Autowired
	UnifiedDevelopmentPowerPlatformController(
			ServiceImpUnifiedDevelopmentPowerPlatform serviceImpUnifiedDevelopmentPowerPlatform) {
		_serviceImpUnifiedDevelopmentPowerPlatform = serviceImpUnifiedDevelopmentPowerPlatform;
	}

	/**
	 * To receive the table(s) with their field(s) that will generate the magic
	 * solution - UDPP.
	 * <p>
	 * --
	 *
	 * @since 1.0
	 * @return
	 * @see
	 */
	@ResponseBody
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Status 200 OK", response = String.class),
			@ApiResponse(code = 201, message = "Status 201 Created"),
			@ApiResponse(code = 400, message = "Status 400 Bad Request"),
			@ApiResponse(code = 401, message = "Status 401 Unauthorized"),
			@ApiResponse(code = 403, message = "Status 403 Forbidden"),
			@ApiResponse(code = 404, message = "Status 404 Not Found"),
			@ApiResponse(code = 403, message = "Status 403 Forbidden"),
			@ApiResponse(code = 500, message = "Status 500 Internal Server Error"),
			@ApiResponse(code = 502, message = "Status 502 Bad Gateway"),
			@ApiResponse(code = 503, message = "Status 503 Service Unavailable"),
			@ApiResponse(code = 504, message = "Status 504 Gateway Timeout"), })
	@RequestMapping(value = "/UnifiedDevelopmentPowerPlatformInformation", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> UnifiedDevelopmentPowerPlatformInformation() {
		try {
			return new ResponseEntity<>(_serviceImpUnifiedDevelopmentPowerPlatform.titleInformation(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * To receive the schema of database and do the creation of the tables with
	 * their fields.
	 *
	 * @param string the string to be converted
	 *               <p>
	 *               --
	 *
	 * @since 1.0
	 * @return
	 * @see
	 */
	@ApiIgnore
	@ResponseBody
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Status 200 OK"),
			@ApiResponse(code = 201, message = "Status 201 Created"),
			@ApiResponse(code = 400, message = "Status 400 Bad Request"),
			@ApiResponse(code = 401, message = "Status 401 Unauthorized"),
			@ApiResponse(code = 403, message = "Status 403 Forbidden"),
			@ApiResponse(code = 404, message = "Status 404 Not Found"),
			@ApiResponse(code = 403, message = "Status 403 Forbidden"),
			@ApiResponse(code = 500, message = "Status 500 Internal Server Error"),
			@ApiResponse(code = 502, message = "Status 502 Bad Gateway"),
			@ApiResponse(code = 503, message = "Status 503 Service Unavailable"),
			@ApiResponse(code = 504, message = "Status 504 Gateway Timeout"), })
	@RequestMapping(value = "/metadata", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Void> metadata(@RequestBody(required = true) DtoMetadata dtoMetadata) {
		try {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * To receive the table(s) with their field(s) that will generate the magic
	 * solution - UDPP.
	 * 
	 * @param string the string to be converted
	 *               <p>
	 *               --
	 *
	 * @since 1.0
	 * @return
	 * @see
	 */
	@ApiIgnore
	@ResponseBody
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Status 200 OK"),
			@ApiResponse(code = 201, message = "Status 201 Created"),
			@ApiResponse(code = 400, message = "Status 400 Bad Request"),
			@ApiResponse(code = 401, message = "Status 401 Unauthorized"),
			@ApiResponse(code = 403, message = "Status 403 Forbidden"),
			@ApiResponse(code = 404, message = "Status 404 Not Found"),
			@ApiResponse(code = 403, message = "Status 403 Forbidden"),
			@ApiResponse(code = 500, message = "Status 500 Internal Server Error"),
			@ApiResponse(code = 502, message = "Status 502 Bad Gateway"),
			@ApiResponse(code = 503, message = "Status 503 Service Unavailable"),
			@ApiResponse(code = 504, message = "Status 504 Gateway Timeout"), })
	@RequestMapping(value = "/tablesdata", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Void> tablesdata(@RequestBody(required = true) DtoTablesdata dtoTablesdata) {
		try {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}