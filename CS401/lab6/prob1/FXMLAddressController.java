import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.input.PickResult;

public class FXMLAddressController {

    @FXML private TextField nameField;
    @FXML private TextField streetField;
    @FXML private TextField cityField;
    @FXML private TextField stateField;
    @FXML private TextField zipField;

    @FXML
    protected void submitAction(ActionEvent event) {
        System.out.println(nameField.getText());
        System.out.println(streetField.getText());
        System.out.println(cityField.getText() + ", " + stateField.getText() + " " + zipField.getText());
    }

    public void initialize() {
        
    }
}