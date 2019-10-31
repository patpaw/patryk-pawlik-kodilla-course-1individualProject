package com.kodilla;

import com.kodilla.board.Board;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Checkers extends Application {

    private Image imageback = new Image("checkersBoard.png");
    private Image pawnRed = new Image("pawnRed.png");
    private Image pawnGreen = new Image("pawnGreen.png");
    private FlowPane pawns = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
//        for(int i = 0; i < 8; i++) {
//            for(int j = 0; j < 8; j++) {
//                grid.add(pawns, 0,0);
//
//            }
//        }


        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(11.5,12.5,13.5,134.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView imgPawnGreen0 = new ImageView(pawnGreen);
        ImageView imgPawnGreen1 = new ImageView(pawnGreen);
        ImageView imgPawnGreen2 = new ImageView(pawnGreen);
        ImageView imgPawnRed = new ImageView(pawnRed);
        pawns.getChildren().add(imgPawnGreen0);
        pawns.getChildren().add(imgPawnGreen1);
        pawns.getChildren().add(imgPawnGreen2);
        pawns.getChildren().add(imgPawnRed);
        imgPawnGreen0.setX(1500);
        imgPawnGreen0.setY(1100);

        imgPawnGreen0.setFitHeight(100);
        imgPawnGreen0.setFitWidth(100);
        imgPawnGreen1.setFitHeight(100);
        imgPawnGreen1.setFitWidth(100);
        imgPawnGreen2.setFitHeight(100);
        imgPawnGreen2.setFitWidth(100);
        imgPawnRed.setFitHeight(100);
        imgPawnRed.setFitWidth(100);



//        grid.getChildren().addAll(imgPawnGreen0, imgPawnGreen1, imgPawnGreen2, imgPawnRed);

        grid.addColumn(0,imgPawnGreen0, imgPawnGreen1, imgPawnGreen2);
        grid.addRow(0,imgPawnRed);
        grid.setGridLinesVisible(true);

        ColumnConstraints column0 = new ColumnConstraints(100);
        column0.setMaxWidth(100);
        grid.getColumnConstraints().add(column0);

        RowConstraints row0 = new RowConstraints(100);
        row0.setMaxHeight(100);
        row0.setValignment(VPos.BASELINE);
        grid.getRowConstraints().add(row0);

        Scene scene = new Scene(grid, 1200, 900, Color.BLACK);

        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);

        Board board = new Board();
        board.initBoard();

        Game game = new Game(board, grid);
        game.showBoard();

        primaryStage.show();
    }
}
