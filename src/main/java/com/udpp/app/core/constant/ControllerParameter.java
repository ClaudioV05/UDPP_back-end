package com.udpp.app.core.constant;

/// The Controller parameter.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum ControllerParameter {;
    /// Base path.
    private static final String BASE_PATH = "/api/";
    /// UDPP path.
    public static final String UDPP_PATH = BASE_PATH + "udpp";
    /// UDPP parameters path.
    public static final String UDPP_PARAMETER_PATH = BASE_PATH + "udppparameters";
    /// Metadata endpoint path.
    public static final String METADATA_ENDPOINT_PATH = "/metadata";
    /// Metatable endpoint path.
    public static final String METATABLE_ENDPOINT_PATH = "/metatable";
    /// Title application endpoint path.
    public static final String TITLE_ENDPOINT_PATH = "/applicationTitle";
    /// Description application endpoint path.
    public static final String DESCRIPTION_ENDPOINT_PATH = "/applicationDescription";
    /// Architectures endpoint path.
    public static final String ARCHITECTURES_ENDPOINT_PATH = "/architectures";
}
