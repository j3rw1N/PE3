package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    ChessBoard chessBoard = new ChessBoard();

    @Test
    public void generateBoard() {
        String[][] exp = {{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};

        assertArrayEquals("Invalid array",exp, chessBoard.generateBoard());
    }

    @Test
    public void generateBoardFailures() {
        assertNotNull("Cant be null", chessBoard.generateBoard());
    }
}