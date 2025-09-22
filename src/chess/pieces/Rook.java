package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
// Rook -> Torre (R)
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        // acima da peça
        p.setValues(position.getRow()-1, position.getColumn());
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() -1);
        }
        if (getBoard().positionExistis(p) && isThereOpoonetPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // esquerda da peça
        p.setValues(position.getRow(), position.getColumn() -1);
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() -1);
        }
        if (getBoard().positionExistis(p) && isThereOpoonetPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // direita da peça
        p.setValues(position.getRow(), position.getColumn() +1);
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() +1);
        }
        if (getBoard().positionExistis(p) && isThereOpoonetPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        // abaixo da peça
        p.setValues(position.getRow() +1, position.getColumn());
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() +1);
        }
        if (getBoard().positionExistis(p) && isThereOpoonetPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
