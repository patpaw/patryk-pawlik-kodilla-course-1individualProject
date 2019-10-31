package com.kodilla.board;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for(int row = 0; row < 8; row++) {
            rows.add(new BoardRow());
        }
    }

    public Figure getFigure(int col, int row) {
        return rows.get(row).getCols().get(col);
    }

    public void setFigure(int col, int row, Figure figure) {
        rows.get(row).getCols().add(col, figure);
        rows.get(row).getCols().remove(col + 1);
    }

    public void initBoard() {
        setFigure(0,0, new Pawn(FigureColours.GREEN));
        setFigure(0,2, new Pawn(FigureColours.GREEN));
        setFigure(1,1, new Pawn(FigureColours.GREEN));
        setFigure(2,0, new Pawn(FigureColours.GREEN ));
        setFigure(2,2, new Pawn(FigureColours.GREEN ));
        setFigure(3,1, new Pawn(FigureColours.GREEN ));
        setFigure(4,0, new Pawn(FigureColours.GREEN ));
        setFigure(4,2, new Pawn(FigureColours.GREEN ));
        setFigure(5,1, new Pawn(FigureColours.GREEN ));
        setFigure(6,0, new Pawn(FigureColours.GREEN ));
        setFigure(6,2, new Pawn(FigureColours.GREEN ));
        setFigure(7,1, new Pawn(FigureColours.GREEN ));

        setFigure(0,6, new Pawn(FigureColours.RED ));
        setFigure(1,5, new Pawn(FigureColours.RED ));
        setFigure(1,7, new Pawn(FigureColours.RED ));
        setFigure(2,6, new Pawn(FigureColours.RED ));
        setFigure(3,5, new Pawn(FigureColours.RED ));
        setFigure(3,7, new Pawn(FigureColours.RED ));
        setFigure(4,6, new Pawn(FigureColours.RED ));
        setFigure(5,5, new Pawn(FigureColours.RED ));
        setFigure(5,7, new Pawn(FigureColours.RED ));
        setFigure(6,6, new Pawn(FigureColours.RED ));
        setFigure(7,5, new Pawn(FigureColours.RED ));
        setFigure(7,7, new Pawn(FigureColours.RED ));

    }
}
