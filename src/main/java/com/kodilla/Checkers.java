package com.kodilla;

import com.kodilla.board.Board;
import com.kodilla.board.Pawn;
import com.sun.rowset.internal.Row;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Checkers extends Application {

    private Image imageback = new Image("checkersBoard.png");
    private Image pawnRed = new Image("pawnRed.png",90,90,false,false);
    private Image pawnGreen = new Image("pawnGreen.png",90,90,false,false);
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


        // USTAWIENIE KRATOWNIC + GRAFIKA
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(22, 12.5, 10.5, 182));
        grid.setHgap(0.5);
        grid.setVgap(0.5);
        grid.setBackground(background);



        ImageView imgPawnGreen0 = new ImageView(pawnGreen);
        ImageView imgPawnGreen1 = new ImageView(pawnGreen);
        ImageView imgPawnGreen2 = new ImageView(pawnGreen);
        ImageView imgPawnGreen3 = new ImageView(pawnGreen);
        ImageView imgPawnGreen4 = new ImageView(pawnGreen);
        ImageView imgPawnGreen5 = new ImageView(pawnGreen);
        ImageView imgPawnGreen6 = new ImageView(pawnGreen);
        ImageView imgPawnGreen7 = new ImageView(pawnGreen);
        ImageView imgPawnGreen8 = new ImageView(pawnGreen);
        ImageView imgPawnGreen9 = new ImageView(pawnGreen);
        ImageView imgPawnGreen10 = new ImageView(pawnGreen);
        ImageView imgPawnGreen11 = new ImageView(pawnGreen);

        ImageView imgPawnRed0 = new ImageView(pawnRed);
        ImageView imgPawnRed1 = new ImageView(pawnRed);
        ImageView imgPawnRed2 = new ImageView(pawnRed);
        ImageView imgPawnRed3 = new ImageView(pawnRed);
        ImageView imgPawnRed4 = new ImageView(pawnRed);
        ImageView imgPawnRed5 = new ImageView(pawnRed);
        ImageView imgPawnRed6 = new ImageView(pawnRed);
        ImageView imgPawnRed7 = new ImageView(pawnRed);
        ImageView imgPawnRed8 = new ImageView(pawnRed);
        ImageView imgPawnRed9 = new ImageView(pawnRed);
        ImageView imgPawnRed10 = new ImageView(pawnRed);
        ImageView imgPawnRed11 = new ImageView(pawnRed);


        pawns.getChildren().add(imgPawnGreen0);
        pawns.getChildren().add(imgPawnGreen1);
        pawns.getChildren().add(imgPawnGreen3);
        pawns.getChildren().add(imgPawnGreen4);
        pawns.getChildren().add(imgPawnGreen5);
        pawns.getChildren().add(imgPawnGreen6);
        pawns.getChildren().add(imgPawnGreen7);
        pawns.getChildren().add(imgPawnGreen8);
        pawns.getChildren().add(imgPawnGreen9);
        pawns.getChildren().add(imgPawnGreen10);
        pawns.getChildren().add(imgPawnGreen11);

        pawns.getChildren().add(imgPawnRed0);
        pawns.getChildren().add(imgPawnRed1);
        pawns.getChildren().add(imgPawnRed2);
        pawns.getChildren().add(imgPawnRed3);
        pawns.getChildren().add(imgPawnRed4);
        pawns.getChildren().add(imgPawnRed5);
        pawns.getChildren().add(imgPawnRed6);
        pawns.getChildren().add(imgPawnRed7);
        pawns.getChildren().add(imgPawnRed8);
        pawns.getChildren().add(imgPawnRed9);
        pawns.getChildren().add(imgPawnRed10);
        pawns.getChildren().add(imgPawnRed11);


        imgPawnGreen0.setFitHeight(90);
        imgPawnGreen0.setFitWidth(90);
        imgPawnGreen1.setFitHeight(90);
        imgPawnGreen1.setFitWidth(90);
        imgPawnGreen2.setFitHeight(90);
        imgPawnGreen2.setFitWidth(90);
        imgPawnGreen3.setFitHeight(90);
        imgPawnGreen3.setFitWidth(90);
        imgPawnGreen4.setFitHeight(90);
        imgPawnGreen4.setFitWidth(90);
        imgPawnGreen5.setFitHeight(90);
        imgPawnGreen5.setFitWidth(90);
        imgPawnGreen6.setFitHeight(90);
        imgPawnGreen6.setFitWidth(90);
        imgPawnGreen7.setFitHeight(90);
        imgPawnGreen7.setFitWidth(90);
        imgPawnGreen8.setFitHeight(90);
        imgPawnGreen8.setFitWidth(90);
        imgPawnGreen9.setFitHeight(90);
        imgPawnGreen9.setFitWidth(90);
        imgPawnGreen10.setFitHeight(90);
        imgPawnGreen10.setFitWidth(90);
        imgPawnGreen11.setFitHeight(90);
        imgPawnGreen11.setFitWidth(90);

        imgPawnRed0.setFitHeight(90);
        imgPawnRed0.setFitWidth(90);
        imgPawnRed1.setFitHeight(90);
        imgPawnRed1.setFitWidth(90);
        imgPawnRed2.setFitHeight(90);
        imgPawnRed2.setFitWidth(90);
        imgPawnRed3.setFitHeight(90);
        imgPawnRed3.setFitWidth(90);
        imgPawnRed4.setFitHeight(90);
        imgPawnRed4.setFitWidth(90);
        imgPawnRed5.setFitHeight(90);
        imgPawnRed5.setFitWidth(90);
        imgPawnRed6.setFitHeight(90);
        imgPawnRed6.setFitWidth(90);
        imgPawnRed7.setFitHeight(90);
        imgPawnRed7.setFitWidth(90);
        imgPawnRed8.setFitHeight(90);
        imgPawnRed8.setFitWidth(90);
        imgPawnRed9.setFitHeight(90);
        imgPawnRed9.setFitWidth(90);
        imgPawnRed10.setFitHeight(90);
        imgPawnRed10.setFitWidth(90);
        imgPawnRed11.setFitHeight(90);
        imgPawnRed11.setFitWidth(90);


        grid.getChildren().addAll(imgPawnGreen0, imgPawnGreen1, imgPawnGreen2, imgPawnRed0);

  //    DODAWANIE WIDOCZNYCH PIONKÓW DLA WYBRANEJ POZYCJI X Y
        grid.add(new ImageView(pawnGreen),0,6);
        grid.add(new ImageView(pawnGreen),1,5);
        grid.add(new ImageView(pawnGreen),1,7);
        grid.add(new ImageView(pawnGreen),2,6);
        grid.add(new ImageView(pawnGreen),3,5);
        grid.add(new ImageView(pawnGreen),3,7);
        grid.add(new ImageView(pawnGreen),4,6);
        grid.add(new ImageView(pawnGreen),5,5);
        grid.add(new ImageView(pawnGreen),5,7);
        grid.add(new ImageView(pawnGreen),6,6);
        grid.add(new ImageView(pawnGreen),7,5);
        grid.add(new ImageView(pawnGreen),7,7);

        grid.add(new ImageView(pawnRed),0,0);
        grid.add(new ImageView(pawnRed),0,2);
        grid.add(new ImageView(pawnRed),1,1);
        grid.add(new ImageView(pawnRed),2,0);
        grid.add(new ImageView(pawnRed),2,2);
        grid.add(new ImageView(pawnRed),3,1);
        grid.add(new ImageView(pawnRed),4,0);
        grid.add(new ImageView(pawnRed),4,2);
        grid.add(new ImageView(pawnRed),5,1);
        grid.add(new ImageView(pawnRed),6,0);
        grid.add(new ImageView(pawnRed),6,2);
        grid.add(new ImageView(pawnRed),7,1);


        grid.setGridLinesVisible(true);  //WIDOCZNOŚĆ SIATKI

        grid.getColumnConstraints().add(new ColumnConstraints(104));
        grid.getColumnConstraints().add(new ColumnConstraints(104));
        grid.getColumnConstraints().add(new ColumnConstraints(103));
        grid.getColumnConstraints().add(new ColumnConstraints(103));
        grid.getColumnConstraints().add(new ColumnConstraints(104));
        grid.getColumnConstraints().add(new ColumnConstraints(103));
        grid.getColumnConstraints().add(new ColumnConstraints(104));
        grid.getColumnConstraints().add(new ColumnConstraints(104));

        grid.getRowConstraints().add(new RowConstraints(104));
        grid.getRowConstraints().add(new RowConstraints(103));
        grid.getRowConstraints().add(new RowConstraints(103));
        grid.getRowConstraints().add(new RowConstraints(103));
        grid.getRowConstraints().add(new RowConstraints(103));
        grid.getRowConstraints().add(new RowConstraints(104));
        grid.getRowConstraints().add(new RowConstraints(104));
        grid.getRowConstraints().add(new RowConstraints(105));

//        ColumnConstraints column0 = new ColumnConstraints(110);
//        column0.setHalignment(HPos.LEFT);
//        grid.getColumnConstraints().add(column0);
//
//        ColumnConstraints column1 = new ColumnConstraints(110);
//        grid.getColumnConstraints().add(column1);
//
//        ColumnConstraints column2 = new ColumnConstraints(110);
//        column0.setMaxWidth(110);
//        grid.getColumnConstraints().add(column2);
//
//        ColumnConstraints column3 = new ColumnConstraints(110);
//        column0.setMaxWidth(110);
//        grid.getColumnConstraints().add(column3);
//
//        ColumnConstraints column4 = new ColumnConstraints(110);
//        column0.setMaxWidth(110);
//        grid.getColumnConstraints().add(column4);
//
//        ColumnConstraints column5 = new ColumnConstraints(110);
//        column0.setMaxWidth(110);
//        grid.getColumnConstraints().add(column5);
//
//        ColumnConstraints column6 = new ColumnConstraints(110);
//        column0.setMaxWidth(110);
//        grid.getColumnConstraints().add(column6);
//
//        ColumnConstraints column7 = new ColumnConstraints(110);
//        column0.setMaxWidth(110);
//        grid.getColumnConstraints().add(column7);
//
//
//        RowConstraints row0 = new RowConstraints(100);
//        row0.setMaxHeight(100);
//        row0.setValignment(VPos.BASELINE);
//        grid.getRowConstraints().add(row0);

        Scene scene = new Scene(grid, 1200, 900, Color.BLACK);

        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);

        Board board = new Board();
        board.initBoard();

        Game game = new Game(board, grid);
        game.showBoard();

        primaryStage.show();
    }

    public void addPawns(GridPane grid, Image image) {
        for (int i = 0; i < 13; i++) {
            grid.getChildren().add(new ImageView(image));
        }
    }


}
