package com.software.gruppeoblig;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlinnlaster = new FXMLLoader();

        fxmlinnlaster.setLocation(getClass().getResource("view/Startside.fxml"));
        Parent rootnode = fxmlinnlaster.load();

        stage.setTitle("Startside");
        stage.setScene(new Scene(rootnode));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}