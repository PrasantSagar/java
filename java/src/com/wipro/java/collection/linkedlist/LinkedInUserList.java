package com.wipro.java.collection.linkedlist;

import java.sql.*;
import java.util.Scanner;

public class LinkedInUserList {
    private static final String URL = "jdbc:mysql://localhost:3306/linkedin_db";
    private static final String USER = "root"; // 
    private static final String PASSWORD = "MYsql@123"; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to MySQL Database!");

            while (true) {
                System.out.println("\n1. Add User Profile");
                System.out.println("2. Display All Profiles");
                System.out.println("3. Search Profile by Name");
                System.out.println("4. Delete Profile by Name");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        addUser(conn, scanner);
                        break;
                    case 2:
                        displayUsers(conn);
                        break;
                    case 3:
                        searchUser(conn, scanner);
                        break;
                    case 4:
                        deleteUser(conn, scanner);
                        break;
                    case 5:
                        System.out.println("Exiting LinkedIn User List. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static void addUser(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Job Title: ");
        String jobTitle = scanner.nextLine();
        System.out.print("Enter Company: ");
        String company = scanner.nextLine();
        System.out.print("Enter Location: ");
        String location = scanner.nextLine();
        System.out.print("Enter Skills (comma-separated): ");
        String skills = scanner.nextLine();

        String query = "INSERT INTO users (name, job_title, company, location, skills) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, jobTitle);
            stmt.setString(3, company);
            stmt.setString(4, location);
            stmt.setString(5, skills);
            stmt.executeUpdate();
            System.out.println("Profile added successfully!");
        }
    }

    private static void displayUsers(Connection conn) throws SQLException {
        String query = "SELECT * FROM users";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("\nLinkedIn User Profiles:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + 
                                   ", Name: " + rs.getString("name") +
                                   ", Job Title: " + rs.getString("job_title") +
                                   ", Company: " + rs.getString("company") +
                                   ", Location: " + rs.getString("location") +
                                   ", Skills: " + rs.getString("skills"));
            }
        }
    }

    private static void searchUser(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Name to Search: ");
        String name = scanner.nextLine();

        String query = "SELECT * FROM users WHERE name = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Profile Found: ID: " + rs.getInt("id") +
                                       ", Name: " + rs.getString("name") +
                                       ", Job Title: " + rs.getString("job_title") +
                                       ", Company: " + rs.getString("company") +
                                       ", Location: " + rs.getString("location") +
                                       ", Skills: " + rs.getString("skills"));
                } else {
                    System.out.println("Profile not found.");
                }
            }
        }
    }

    private static void deleteUser(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Name to Delete: ");
        String name = scanner.nextLine();

        String query = "DELETE FROM users WHERE name = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Profile deleted successfully!");
            } else {
                System.out.println("Profile not found.");
            }
        }
    }
}
