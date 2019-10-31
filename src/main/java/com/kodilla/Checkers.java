package com.kodilla;

import com.kodilla.board.Board;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

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
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(11.5,12.5,13.5,14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView imgPawnGreen = new ImageView(pawnGreen);
        ImageView imgPawnRed = new ImageView(pawnRed);
        pawns.getChildren().add(imgPawnGreen);
        pawns.getChildren().add(imgPawnRed);

        grid.add(pawns, 0, 0, 3,1);

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
