package com.udpp.app.application.port;

import com.udpp.app.adapter.inbound.api.mapper.Embedded;
import com.udpp.app.core.domain.*;

import java.util.LinkedHashSet;

/// The Mapper service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface MapperServicePort {
    /// Convert application title.
    ///
    /// @param title title.
    /// @return Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    Embedded getTitle(String title);

    /// Convert application description.
    ///
    /// @param description description.
    /// @return Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    Embedded getDescription(String description);

    ///  Convert to set of architecture.
    ///
    /// @param lstArchitecture lstArchitecture.
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> convertLstArchitecture(LinkedHashSet<Architecture> lstArchitecture);

    ///  Convert to set of database.
    ///
    /// @param lstDatabase lstDatabase.
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> convertLstDatabase(LinkedHashSet<Database> lstDatabase);

    ///  Convert to set of database engineer.
    ///
    /// @param lstDatabaseEngineer lstDatabaseEngineer.
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> convertLstDatabaseEngineer(LinkedHashSet<DatabaseEngineer> lstDatabaseEngineer);

    /// Convert to set of development environment.
    ///
    /// @param lstDevelopmentEnvironment lstDevelopmentEnvironment.
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> convertLstDevelopmentEnvironment(LinkedHashSet<DevelopmentEnvironment> lstDevelopmentEnvironment);

    /// Convert to set of form.
    ///
    /// @param lstForm lstForm.
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> convertLstForm(LinkedHashSet<Form> lstForm);
}