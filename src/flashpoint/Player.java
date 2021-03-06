package flashpoint;

import java.awt.Color;
import java.awt.Graphics2D;
import java.lang.Math;

public class Player {

    private int actionPoints;
    int currentRow;
    int currentColumn;
    int previousRow;
    int previousColumn;
    private Color color;
    private Board board[][];
    private boolean isTurn;

    Player(Color _color) {
        actionPoints = 0;
        color = _color;
        while (currentColumn == 0 || currentColumn == Board.numColumns - 1)
        {
        currentColumn = (int) (Math.random() * Board.numColumns);
        }
        while (currentRow == 0 || currentRow == Board.numRows - 1)
        {
        currentRow = (int) (Math.random() * Board.numRows);
        }
    }

    public int getActionPoints() {
        return (actionPoints);
    }

    public int setActionPoints() {
        actionPoints = 4;
        return (actionPoints);
    }

    public int addActionPoints() {
        int morePoints = 4;
        actionPoints += morePoints;

        if (this.getActionPoints() > 8) {
            actionPoints = 8;
        }
        return (actionPoints);
    }

    public int loseAllActionPoints() {
        actionPoints = 0;
        return (actionPoints);
    }
     
    public void playerLoseActionPoint() {
        actionPoints -= 1;
    }

    public Color getColor() {
        return (color);
    }

    public int getCurrentRow() {
        return (currentRow);
    }

    public int getCurrentColumn() {
        return (currentColumn);
    }

    public int getPreviousRow() {
        return (previousRow);
    }

    public int getPreviousColumn() {
        return (previousColumn);
    }

    public void setPreviousRow(int _row) {
        previousRow = _row;
    }

    public void setPreviousColumn(int _column) {
        previousColumn = _column;
    }

    public Board getCurrentBoardLocation() {
        return (board[this.currentRow][this.currentColumn]);
    }

    public void setCurrentRow(int _currentRow) {
        currentRow = _currentRow;
    }

    public void setCurrentColumn(int _currentColumn) {
        currentColumn = _currentColumn;
    }

    public boolean getisTurn() {
        return (isTurn);
    }

    public void setisTurn(boolean _temp) {
        isTurn = _temp;
    }

    public void skipTurn() {
        this.setisTurn(false);
    }
}
