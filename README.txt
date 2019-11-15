Suche: "Erweiterte Systemeinstellungen anzeigen" > Erweitert > Umgebungsvariablen > Systemvariablen >
    (Neu > Name der Variablen: "JAVA_HOME" + Verzeichnis suchen: jdk<version>)
    (Path > Bearbeiten > Neu > %JAVA_HOME%\bin

File > Settings ... > Build, Execution, Deployment > Compiler > Java Compiler
--module-path "C:\Program Files\Java\javafx-sdk-11.0.2\lib" --add-modules=javafx.controls,javafx.fxml

Run > Edit Configurations ... > Configuration > VM options
--module-path "C:\Program Files\Java\javafx-sdk-11.0.2\lib" --add-modules=javafx.controls,javafx.fxml
