package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TitledPane;

public class storageController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TitledPane TitledPane;

    @FXML
    private TableView<?> Table;

    @FXML
    private TableColumn<?, ?> TableProd;

    @FXML
    private TableColumn<?, ?> TableCount;

    @FXML
    void initialize() {
        assert TitledPane != null : "fx:id=\"TitledPane\" was not injected: check your FXML file 'storage.fxml'.";
        assert Table != null : "fx:id=\"Table\" was not injected: check your FXML file 'storage.fxml'.";
        assert TableProd != null : "fx:id=\"TableProd\" was not injected: check your FXML file 'storage.fxml'.";
        assert TableCount != null : "fx:id=\"TableCount\" was not injected: check your FXML file 'storage.fxml'.";

    }
}
