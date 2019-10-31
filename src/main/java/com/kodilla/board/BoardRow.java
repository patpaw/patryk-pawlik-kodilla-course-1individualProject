package com.kodilla.board;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {

    private List<Figure> cols = new ArrayList<>();

    public BoardRow() {
        for(int col = 0; col < 8; col++) {
            cols.add(new None());
        }
    }

    public List<Figure> getCols() {
        return cols;
    }
}
