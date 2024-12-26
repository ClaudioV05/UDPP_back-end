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

import io.swagger.v3.oas.annotations.parameters.RequestBody;

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
	@ResponseBody
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
	@ResponseBody
	@RequestMapping(value = "/tablesdata", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Void> tablesdata(@RequestBody(required = true) DtoTablesdata dtoTablesdata) {
		try {
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}