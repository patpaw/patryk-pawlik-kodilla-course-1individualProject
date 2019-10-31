package com.kodilla.FXtesty;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class FxScene extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        myStage.setTitle("Obaszar roboczy scena");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);


        Scene myScene = new Scene(rootNode, 300, 100);

        myStage.setScene(myScene);
        response = new Label("Kliknij przycisk");

        Button btnAlpha = new Button("Alfa");
        Button btnBeta = new Button("Beta");

        btnAlpha.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Kliknięto przycisk Alfa.");
            }
        });

        btnBeta.setOnAction( (ae) -> response.setText("Kliknieto przycisk Beta"));

        rootNode.getChildren().addAll(btnAlpha,btnBeta,response);


        myStage.show();
    }


}
