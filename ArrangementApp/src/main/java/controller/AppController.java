package controller;


import javafx.event.ActionEvent;

import javafx.event.*;
import javafx.scene.control.Button;
import javafx.util.*;
import javafx.fxml.FXML;

public class AppController {

    @FXML
    private Button arrangement;

    @FXML
    private void initialize() {

        arrangement.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                arrangement.setText("we did it reddit");
            }
        });

    }

}
