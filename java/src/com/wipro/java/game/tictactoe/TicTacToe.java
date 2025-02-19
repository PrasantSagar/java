package com.wipro.java.game.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    // Initialize the board with empty spaces
    private static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    // Set the initial player to 'X'
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;

        // Game loop
        while (!gameEnded) {
            printBoard();
            playerMove(scanner);
            gameEnded = checkWinner();

            // Switch player only if the game hasn't ended
            if (!gameEnded) {
                switchPlayer();
            }
        }

        scanner.close();
        System.out.println("Game Over!");
    }

    // Prints the current state of the board with index references
    private static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n---------");
        }
        // Print index references
        System.out.println("Indexes for your reference: ");
        System.out.println("[0][0] [0][1] [0][2]");
        System.out.println("[1][0] [1][1] [1][2]");
        System.out.println("[2][0] [2][1] [2][2]");
    }

    // Handles the player's move
    private static void playerMove(Scanner scanner) {
        int row = -1, col = -1;
        // Ensure a valid move
        while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column) using indexes (e.g., 0 0, 1 1): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
        }
        // Place the player's move on the board
        board[row][col] = currentPlayer;
    }

    // Checks if there is a winner or a tie
    private static boolean checkWinner() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                return true;
            }
        }
        // Check main diagonal
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            printBoard();
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }
        // Check anti-diagonal
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            printBoard();
            System.out.println("Player " + currentPlayer + " wins!");
            return true;
        }
        
        // Check for a tie
        boolean tie = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    tie = false;
                    break;
                }
            }
        }
        if (tie) {
            printBoard();
            System.out.println("It's a tie!");
            return true;
        }

        return false;
    }

    // Switches the current player between 'X' and 'O'
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
