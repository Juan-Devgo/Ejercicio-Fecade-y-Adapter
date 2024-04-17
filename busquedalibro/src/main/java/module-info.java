module co.uniquindio.ejercicioclase {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.ejercicioclase to javafx.fxml;
    exports co.uniquindio.ejercicioclase;
}
