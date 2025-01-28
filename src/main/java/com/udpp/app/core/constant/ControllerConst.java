package com.udpp.app.core.constant;

/// The Controller const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum ControllerConst {;
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
    /// Database endpoint path.
    public static final String DATABASES_ENDPOINT_PATH = "/databases";
    /// Database engineer endpoint path.
    public static final String DATABASES_ENGINEER_ENDPOINT_PATH = "/databasesEngineer";
}
