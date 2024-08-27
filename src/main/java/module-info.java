module com.example.ratrapage {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.ratrapage to javafx.fxml;
    exports com.example.ratrapage;
}