import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.input.PickResult;

public class FXMLStringUtilityController {

    @FXML private TextField inputField;
    @FXML private TextField outputField;

    @FXML
    protected void countLettersAction(ActionEvent event) {
        String inp = inputField.getText();
        outputField.setText("" + inp.length());
    }
    @FXML
    protected void reverseLettersAction(ActionEvent event) {
        String inp = inputField.getText();
        outputField.setText(new StringBuilder(inp).reverse().toString());
    }
    @FXML
    protected void removeDuplicatesAction(ActionEvent event) {
        String inp = inputField.getText();
        String res = new String();

        int len = inp.length(); 

        for (int i = 0; i < len; i++) {
            char c = inp.charAt(i); 

            if (res.indexOf(c) < 0) {
                res += c; 
            }
        }

        outputField.setText(res);
    }
}