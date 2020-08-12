package com.Frontend;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("PROJECT_REDEMPTION");
        StackPane sp = new StackPane();
        Scene scene = new Scene(sp, 250,360);

        stage.setScene(scene);
        stage.show();
    }


}
