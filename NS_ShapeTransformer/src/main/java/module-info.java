module com.example.ns_shapetransformer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ns_shapetransformer to javafx.fxml;
    exports com.example.ns_shapetransformer;
}