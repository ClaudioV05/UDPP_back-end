package com.udpp.app.application.core.constant;

/// The Application const.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public enum ApplicationConst {
    ;
    public static final String TITLE = "Unified Development Power Platform";

    public static final String DESCRIPTION = "This program generates 'MVC' standard class files for the 'Delphi', 'Lazarus' and '.NET' Development Ide, from a text file containing the metadata of one or more tables.\n" +
            "It is based on GeraClasseDelphi version 6.0. The difference is that it generates the files according to the 'MVC' project pattern,\n" +
            "generating the Dao, Model, Controller and View files in corresponding folders.Views, Normal and Mdi style forms are created.\n\n" +

            "Important:\n\n" +

            "01. Font formatting obeys Delphi's automatic formatter with default values, except:\n" +
            "Right margin = 135\n" +
            "Indent case contents = True\n\n" +

            "02. For Views, there is a problem with accentuation in the display of dialog messages in Lazarus\n" +
            "Adjust the Encoding of the code editor.\n" +
            "Right click in code editor > File Settings > Encoding > select UTF-8 with BOM\n\n" +

            "03. Visual Studio version 07/30/2022\n\n" +

            "04. Web version 10/12/2022\n\n" +

            "05. Spring/Angular version 12/01/2024";
}