package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;

public class BattleshipBoard {

    String brett;
    String activePlayer = "player 1";
    String player1_brett;
    String player2_brett;

    public BattleshipBoard(String brett) {
        this.brett = brett;
    }


}
