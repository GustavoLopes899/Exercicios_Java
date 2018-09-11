package aula01_matriz;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int player = 1, row, column;
        boolean win = false;
        boolean finish = false;
        int board[][] = new int[3][3];
        int plays = 0;
        while (!win && !finish) {
            if (player == 1) {
                System.out.printf("---- Player 1 (X) ----\n");
            } else {
                System.out.printf("---- Player 2 (0) ----\n");
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] != 1 && board[i][j] != 2) {
                        System.out.print(" ");
                    } else {
                        switch (board[i][j]) {
                            case 1:
                                System.out.print("X");
                                break;
                            case 2:
                                System.out.print("0");
                                break;
                        }
                    }
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
            }
            System.out.println("\nChoose the cell: ");
            do {
                System.out.printf("Row: ");
                row = input.nextInt();
                System.out.printf("Column: ");
                column = input.nextInt();
                System.out.println();
                if (row < 0 || row > 2 || column < 0 || column > 2 || board[row][column] != 0) {
                    System.out.println("Invalid cell... Try again...");
                    continue;
                }
                if (player == 1) {
                    board[row][column] = 1;
                    player = 2;
                } else {
                    board[row][column] = 2;
                    player = 1;
                }
                plays++;
                break;
            } while (true);
            if ((board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != 0)
                    || (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != 0)
                    || (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != 0)
                    || (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != 0)
                    || (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != 0)
                    || (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != 0)
                    || (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != 0)
                    || (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0)
                    || (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0)) {
                System.out.printf("The player %d wins!!\n", player-1);
                win = true;
            } else {
                if (plays == 9) {
                    System.out.println("Draw game.");
                    finish = true;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 1 && board[i][j] != 2) {
                    System.out.print(" ");
                } else {
                    switch (board[i][j]) {
                        case 1:
                            System.out.print("X");
                            break;
                        case 2:
                            System.out.print("0");
                            break;
                    }
                }
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

}
