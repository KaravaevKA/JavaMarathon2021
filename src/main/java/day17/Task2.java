package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece kingWhite = ChessPiece.KING_WHITE;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;
        ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
        ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;
        ChessPiece knightWhite = ChessPiece.KNIGHT_WHITE;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece empty = ChessPiece.EMPTY;
        ChessPiece[][] board = new ChessPiece[][]{{rookBlack,empty,empty,empty,empty,rookBlack,kingBlack,empty},
                                                    {empty,rookWhite,empty,empty,pawnBlack,pawnBlack,empty,pawnBlack},
                                                    {pawnBlack,empty,knightBlack,empty,empty,empty,rookBlack,empty},
                                                    {queenBlack,empty,empty,bishopWhite,empty,empty,empty,empty},
                                                    {empty,empty,empty,bishopBlack,pawnWhite,empty,empty,empty},
                                                    {empty,empty,empty,empty,bishopWhite,pawnWhite,empty,empty},
                                                    {pawnWhite,empty,empty,queenWhite,empty,pawnWhite,empty,pawnWhite},
                                                    {empty,empty,empty,empty,empty,rookWhite,kingWhite,empty}};
        ChessBoard chessBoard = new ChessBoard(board);
        chessBoard.print();
    }
}
