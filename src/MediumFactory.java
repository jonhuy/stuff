package src;

import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.Location;

import java.util.Random;

public class MediumFactory implements Factory {
    Actor t = null;
    Actor blockPreview = null;
    public void setRandomBlock(int bound, boolean isAuto, Tetris tetrisGame, int slowDown, String currentBlockMove){

        Random random = new Random();
        int rnd = random.nextInt(bound);
        switch (rnd) {
            case 0:
                this.t = new I(tetrisGame);
                if (isAuto) {
                    ((I) this.t).setAutoBlockMove(currentBlockMove);
                }

                I previewI = new I(tetrisGame);
                previewI.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewI;
                break;
            case 1:
                this.t = new J(tetrisGame);
                if (isAuto) {
                    ((J) this.t).setAutoBlockMove(currentBlockMove);
                }
                J previewJ = new J(tetrisGame);
                previewJ.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewJ;
                break;
            case 2:
                this.t = new L(tetrisGame);
                if (isAuto) {
                    ((L) this.t).setAutoBlockMove(currentBlockMove);
                }
                L previewL = new L(tetrisGame);
                previewL.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewL;
                break;
            case 3:
                this.t = new O(tetrisGame);
                if (isAuto) {
                    ((O) this.t).setAutoBlockMove(currentBlockMove);
                }
                O previewO = new O(tetrisGame);
                previewO.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewO;
                break;
            case 4:
                this.t = new S(tetrisGame);
                if (isAuto) {
                    ((S) this.t).setAutoBlockMove(currentBlockMove);
                }
                S previewS = new S(tetrisGame);
                previewS.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewS;
                break;
            case 5:
                this.t = new T(tetrisGame);
                if (isAuto) {
                    ((T) this.t).setAutoBlockMove(currentBlockMove);
                }
                T previewT = new T(tetrisGame);
                previewT.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewT;
                break;
            case 6:
                this.t = new Z(tetrisGame);
                if (isAuto) {
                    ((Z) this.t).setAutoBlockMove(currentBlockMove);
                }
                Z previewZ = new Z(tetrisGame);
                previewZ.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewZ;
                break;
            case 7:
                this.t = new P(tetrisGame);
                if (isAuto) {
                    ((P) this.t).setAutoBlockMove(currentBlockMove);
                }
                P previewP = new P(tetrisGame);
                previewP.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewP;
                break;
            case 8:
                this.t = new Q(tetrisGame);
                if (isAuto) {
                    ((Q) this.t).setAutoBlockMove(currentBlockMove);
                }
                Q previewQ = new Q(tetrisGame);
                previewQ.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewQ;
                break;
            case 9:
                this.t = new Plus(tetrisGame);
                if (isAuto) {
                    ((Plus) this.t).setAutoBlockMove(currentBlockMove);
                }
                Plus previewPlus = new Plus(tetrisGame);
                previewPlus.display(tetrisGame.gameGrid2, new Location(2, 1));
                blockPreview = previewPlus;
                break;
        }
        switch (slowDown){
            case 5:
                slowDown = 4;
                break;
            case 4:
                slowDown = 3;
                break;
            case 3:
                slowDown = 2;
                break;
            case 2:
                slowDown = 1;
                break;
            case 1:
                slowDown = 0;
                break;
            case 0:
                slowDown = -1;
                break;
        }
        this.t.setSlowDown(slowDown);
    }

    public Actor getT(){
        return this.t;
    }
    public Actor getPreview(){return this.blockPreview;}
}