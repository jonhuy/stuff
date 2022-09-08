package src;

import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.Location;

import java.awt.event.KeyEvent;
import java.util.Random;

public class MovementController implements Movement {
    TetrisPiece t = null;

    Difficulty gameDifficulty;


    public MovementController(TetrisPiece TetrisPiece, Difficulty difficulty){
        this.t = TetrisPiece;
        this.gameDifficulty = difficulty;
    }

    public void move(int keyEvent){

        switch (keyEvent) {
            case KeyEvent.VK_UP:
                if (gameDifficulty == Difficulty.Madness) {
                    break;
                } else {
                    this.t.rotate();
                    break;
                }

            case KeyEvent.VK_LEFT:
                this.t.left();
                break;
            case KeyEvent.VK_RIGHT:
                this.t.right();
                break;
            case KeyEvent.VK_DOWN:
                this.t.drop();
                break;
            default:
                return;
        }
    }
}
