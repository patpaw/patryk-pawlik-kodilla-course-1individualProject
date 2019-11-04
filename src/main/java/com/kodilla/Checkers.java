package com.kodilla;

import com.kodilla.board.Board;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Checkers extends Application {

    private Image imageback = new Image("checkersBoard.png");
    private Image pawnRed = new Image("pawnRed.png",90,90,false,false);
    private Image pawnGreen = new Image("pawnGreen.png",90,90,false,false);

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


        // USTAWIENIE SIATKI + GRAFIKA
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(16, 12.5, 10.5, 184));
        grid.setHgap(0.0);
        grid.setVgap(0.0);
        grid.setBackground(background);



//
//
//        ImageView imgPawnGreen0 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen1 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen2 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen3 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen4 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen5 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen6 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen7 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen8 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen9 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen10 = new ImageView(pawnGreen);
//        ImageView imgPawnGreen11 = new ImageView(pawnGreen);
//
//        ImageView imgPawnRed0 = new ImageView(pawnRed);
//        ImageView imgPawnRed1 = new ImageView(pawnRed);
//        ImageView imgPawnRed2 = new ImageView(pawnRed);
//        ImageView imgPawnRed3 = new ImageView(pawnRed);
//        ImageView imgPawnRed4 = new ImageView(pawnRed);
//        ImageView imgPawnRed5 = new ImageView(pawnRed);
//        ImageView imgPawnRed6 = new ImageView(pawnRed);
//        ImageView imgPawnRed7 = new ImageView(pawnRed);
//        ImageView imgPawnRed8 = new ImageView(pawnRed);
//        ImageView imgPawnRed9 = new ImageView(pawnRed);
//        ImageView imgPawnRed10 = new ImageView(pawnRed);
//        ImageView imgPawnRed11 = new ImageView(pawnRed);
//
//
//        pawns.getChildren().add(imgPawnGreen0);
//        pawns.getChildren().add(imgPawnGreen1);
//        pawns.getChildren().add(imgPawnGreen3);
//        pawns.getChildren().add(imgPawnGreen4);
//        pawns.getChildren().add(imgPawnGreen5);
//        pawns.getChildren().add(imgPawnGreen6);
//        pawns.getChildren().add(imgPawnGreen7);
//        pawns.getChildren().add(imgPawnGreen8);
//        pawns.getChildren().add(imgPawnGreen9);
//        pawns.getChildren().add(imgPawnGreen10);
//        pawns.getChildren().add(imgPawnGreen11);
//
//        pawns.getChildren().add(imgPawnRed0);
//        pawns.getChildren().add(imgPawnRed1);
//        pawns.getChildren().add(imgPawnRed2);
//        pawns.getChildren().add(imgPawnRed3);
//        pawns.getChildren().add(imgPawnRed4);
//        pawns.getChildren().add(imgPawnRed5);
//        pawns.getChildren().add(imgPawnRed6);
//        pawns.getChildren().add(imgPawnRed7);
//        pawns.getChildren().add(imgPawnRed8);
//        pawns.getChildren().add(imgPawnRed9);
//        pawns.getChildren().add(imgPawnRed10);
//        pawns.getChildren().add(imgPawnRed11);




  //      grid.getChildren().addAll(imgPawnGreen0, imgPawnGreen1, imgPawnGreen2, imgPawnRed0,);


        for(int i = 1; i < 8;) {
            grid.add(new ImageView(pawnGreen),i,0);
            i += 2;
        }

        for(int i = 0; i < 8;) {
            grid.add(new ImageView(pawnGreen),i,1);
            i += 2;
        }

        for(int i = 1; i < 8;) {
            grid.add(new ImageView(pawnGreen),i,2);
            i += 2;
        }

        for(int i = 0; i < 8;) {
            grid.add(new ImageView(pawnRed),i,5);
            i += 2;
        }

        for(int i = 1; i < 8;) {
            grid.add(new ImageView(pawnRed),i,6);
            i += 2;
        }

        for(int i = 0; i < 8;) {
            grid.add(new ImageView(pawnRed),i,7);
            i += 2;
        }




  //    DODAWANIE WIDOCZNYCH PIONKÓW DLA WYBRANEJ POZYCJI X Y
//        grid.add(new ImageView(pawnGreen),0,6);
//        grid.add(new ImageView(pawnGreen),1,5);
//        grid.add(new ImageView(pawnGreen),1,7);
//        grid.add(new ImageView(pawnGreen),2,6);
//        grid.add(new ImageView(pawnGreen),3,5);
//        grid.add(new ImageView(pawnGreen),3,7);
//        grid.add(new ImageView(pawnGreen),4,6);
//        grid.add(new ImageView(pawnGreen),5,5);
//        grid.add(new ImageView(pawnGreen),5,7);
//        grid.add(new ImageView(pawnGreen),6,6);
//        grid.add(new ImageView(pawnGreen),7,5);
//        grid.add(new ImageView(pawnGreen),7,7);
//
//        grid.add(new ImageView(pawnRed),0,0);
//        grid.add(new ImageView(pawnRed),0,2);
//        grid.add(new ImageView(pawnRed),1,1);
//        grid.add(new ImageView(pawnRed),2,0);
//        grid.add(new ImageView(pawnRed),2,2);
//        grid.add(new ImageView(pawnRed),3,1);
//        grid.add(new ImageView(pawnRed),4,0);
//        grid.add(new ImageView(pawnRed),4,2);
//        grid.add(new ImageView(pawnRed),5,1);
//        grid.add(new ImageView(pawnRed),6,0);
//        grid.add(new ImageView(pawnRed),6,2);
//        grid.add(new ImageView(pawnRed),7,1);

        //WIDOCZNOŚĆ SIATKI
        grid.setGridLinesVisible(true);

        // DODAWANIE WYBRANEJ ILOSCI KOLUMN I WIERSZY
        for(int i = 0; i < 8; i++) {
            grid.getColumnConstraints().add((new ColumnConstraints(105)));
        }

        for(int i = 0; i < 8; i++) {
            grid.getRowConstraints().add(new RowConstraints(105));
        }


        Scene scene = new Scene(grid, 1200, 900, Color.BLACK);

        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);

        // BLOKADA ZMIANY WIELKOSCI OKNA
        primaryStage.setResizable(false);

        Board board = new Board();
        board.initBoard();

        Game game = new Game(board, grid);
        game.showBoard();

        primaryStage.show();
    }

    public static void addPawns(GridPane grid, Image image) {
        for (int i = 0; i < 13; i++) {
            grid.getChildren().add(new ImageView(image));
        }
    }


}
