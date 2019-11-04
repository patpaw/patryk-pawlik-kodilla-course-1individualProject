package com.kodilla;

import com.kodilla.board.Board;
import com.kodilla.board.FigureColours;
import com.kodilla.board.Pawn;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Game {

    private Image pawnRed = new Image("pawnRed.png",90,90,false,false);
    private Image pawnGreen = new Image("pawnGreen.png",90,90,false,false);

    private Board board;
    private GridPane gridPane;

    public Game(Board board, GridPane gridPane) {
        this.board = board;
        this.gridPane = gridPane;
    }


    public void showBoard() {

        for(int x = 0; x < 8; x++) {
            for(int y=0; y < 8; y++) {
                if (board.getFigure(x, y) instanceof Pawn) {
                    if(board.getFigure(x, y).getColor().equals(FigureColours.GREEN)) {
                        gridPane.add(new ImageView(pawnGreen), x, y);
                    } else {
                        gridPane.add(new ImageView(pawnRed), x, y);
                    }
                }
            }
        }

    }
}
