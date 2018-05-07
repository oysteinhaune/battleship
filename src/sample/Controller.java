package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    javafx.scene.control.TextArea boardTextArea;
    @FXML
    TextField coordinateTextField;
    @FXML
    Label activePlayerLabel;

    @FXML
    public void handleBombButton() {
        String playerInput = coordinateTextField.getText();
        boardTextArea.setText(playerInput);
        activePlayerLabel.setText("Player 2!");
    }
}
