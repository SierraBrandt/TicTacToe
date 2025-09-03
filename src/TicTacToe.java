import java.util.Scanner;

public class TicTacToe {

    private final int BOARDSIZE = 3;
    char[][] board = new char[BOARDSIZE][BOARDSIZE]; //Creates board array

    Scanner input = new Scanner(System.in); //creates user terminal input

    private enum Status {
        WON,
        DRAW,
        CONTINUE
    }

    private boolean firstPlayer;
    private boolean gameOver;



    private void printStatus(int player){

    }

    private Status gameStatus(){

        return null;
    }

    public void printBoard(){

    }

    private void printSymbol(int column, char value){

    }

    private boolean validMove(int row, int column){

        return false;
    }

    public void play(){
        System.out.println("In play method");
    }

    public static void main(String[] args){
        System.out.println("Welcome to Tic Tac Toe");
        TicTacToe game = new TicTacToe();
        game.play();

    }
}