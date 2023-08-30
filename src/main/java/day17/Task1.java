package day17;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite1 = ChessPiece.PAWN_WHITE;
        ChessPiece pawnWhite2 = ChessPiece.PAWN_WHITE;
        ChessPiece pawnWhite3 = ChessPiece.PAWN_WHITE;
        ChessPiece pawnWhite4 = ChessPiece.PAWN_WHITE;
        ChessPiece rookBlack1 = ChessPiece.ROOK_BLACK;
        ChessPiece rookBlack2 = ChessPiece.ROOK_BLACK;
        ChessPiece rookBlack3 = ChessPiece.ROOK_BLACK;
        ChessPiece rookBlack4 = ChessPiece.ROOK_BLACK;
        ArrayList<ChessPiece> pieces = new ArrayList();
        pieces.add(pawnWhite1);
        pieces.add(pawnWhite2);
        pieces.add(pawnWhite3);
        pieces.add(pawnWhite4);
        pieces.add(rookBlack1);
        pieces.add(rookBlack2);
        pieces.add(rookBlack3);
        pieces.add(rookBlack4);
        System.out.println(pieces);
    }
}