package com.example.client;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    @FXML
    protected void onSendButtonClick() {
        String message = textField.getText();
        textField.clear();
        textArea.appendText(message + "\n");
        textField.requestFocus();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(()->{
            textField.requestFocus();
        });
    }
}