package src;

import ch.aplu.jgamegrid.*;

public interface Factory {
    public void setRandomBlock(int bound, boolean isAuto, Tetris tetrisGame, int slowDown, String currentBlockMove);
    public Actor getT();

    public Actor getPreview();

    public int getId();
}
