package com.udpp.app.application.services;

import org.springframework.stereotype.Service;

import com.udpp.app.application.interfaces.UdppService;

/** Unified Development Power Platform. Service implementation . */
@Service
public class UdppServiceImpl implements UdppService {

	@Override
	public String getUdppInformation() {
		return "Unified Development Power Platform - UDPP";
	}
}