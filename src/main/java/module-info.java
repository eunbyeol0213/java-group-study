module com.example.studyalgorithm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studyalgorithm to javafx.fxml;
    exports com.example.studyalgorithm;
}