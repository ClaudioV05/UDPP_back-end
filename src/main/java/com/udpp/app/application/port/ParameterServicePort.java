package com.udpp.app.application.port;

/// The Parameter service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface ParameterServicePort {

	/// To get the application title.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return String.
	String getTitle();

	/// To get the application description.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return String.
	String getDescription();
}