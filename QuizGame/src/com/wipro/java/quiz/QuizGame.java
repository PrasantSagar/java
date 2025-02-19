package com.wipro.java.quiz;

import java.sql.*;
import java.util.Scanner;

public class QuizGame {
	private static final String URL = "jdbc:mysql://localhost:3306/QuizGameDB?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; 
    private static final String PASSWORD = "MYsql@123"; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.println("\nWelcome, " + playerName + "! Let's start the quiz. 🎯");

        // Array of questions
        String[][] questions = {
            {"What is the capital of France?", "A. Berlin", "B. Madrid", "C. Paris", "D. Rome", "C"},
            {"Who wrote 'Hamlet'?", "A. Charles Dickens", "B. William Shakespeare", "C. Mark Twain", "D. Jane Austen", "B"},
            {"What is 5 + 7?", "A. 10", "B. 11", "C. 12", "D. 13", "C"},
            {"Which planet is known as the Red Planet?", "A. Earth", "B. Mars", "C. Jupiter", "D. Venus", "B"},
            {"Which is the largest ocean on Earth?", "A. Atlantic", "B. Indian", "C. Arctic", "D. Pacific", "D"}
        };

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.println(questions[i][2]);
            System.out.println(questions[i][3]);
            System.out.println(questions[i][4]);
            System.out.print("Your answer (A/B/C/D): ");
            
            String answer = scanner.next().toUpperCase();

            // Check if the answer is correct
            if (answer.equals(questions[i][5])) {
                System.out.println("✅ Correct!");
                score += 10;
            } else {
                System.out.println("❌ Wrong! The correct answer was: " + questions[i][5]);
            }
        }

        System.out.println("\n🎉 Quiz completed! Your final score: " + score);
        
        // Store the result in the database
        saveScoreToDatabase(playerName, score);
        
        // Show the leaderboard
        showLeaderboard();

        scanner.close();
    }

    // Method to save player's score in MySQL database
    private static void saveScoreToDatabase(String playerName, int score) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO PlayerScores (player_name, score) VALUES (?, ?)")) {
            
            stmt.setString(1, playerName);
            stmt.setInt(2, score);
            stmt.executeUpdate();

            System.out.println("\n📊 Your score has been saved to the leaderboard!");

        } catch (SQLException e) {
            System.out.println("❌ Error saving score: " + e.getMessage());
        }
    }

    // Method to display the top scores
    private static void showLeaderboard() {
        System.out.println("\n🏆 Leaderboard 🏆");

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT player_name, score FROM PlayerScores ORDER BY score DESC LIMIT 5")) {
            
            int rank = 1;
            while (rs.next()) {
                System.out.println(rank + ". " + rs.getString("player_name") + " - " + rs.getInt("score") + " points");
                rank++;
            }

        } catch (SQLException e) {
            System.out.println("❌ Error retrieving leaderboard: " + e.getMessage());
        }
    }
}
