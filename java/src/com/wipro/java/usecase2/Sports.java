package com.wipro.java.usecase2;

import java.util.*;
import java.util.stream.Collectors;

// Abstract class demonstrating Abstraction
abstract class Sport {
    private String name;
    private String type;

    public Sport(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public abstract void showDetails(); // Abstract method for Polymorphism

    public int getPlayers() {
        return 0; // Default 0 players for non-Cricket sports
    }

    public static Comparator<Sport> byName() {
        return Comparator.comparing(Sport::getName);
    }
}

// Cricket class demonstrating Inheritance and Polymorphism
class Cricket extends Sport {
    private int players;

    public Cricket(String name, String type, int players) {
        super(name, type);
        this.players = players;
    }

    @Override
    public int getPlayers() {
        return players;
    }

    @Override
    public void showDetails() {
        System.out.println("Sport: " + getName() + ", Type: " + getType() + ", Players: " + players);
    }
}

// Football class demonstrating Inheritance and Polymorphism
class Football extends Sport {
    private int duration;

    public Football(String name, String type, int duration) {
        super(name, type);
        this.duration = duration;
    }

    @Override
    public void showDetails() {
        System.out.println("Sport: " + getName() + ", Type: " + getType() + ", Duration: " + duration + " mins");
    }
}

// SportsManager demonstrating Collections and Exception Handling
class SportsManager {
    private List<Sport> sportsList = new ArrayList<>();
    private Map<String, Sport> sportsMap = new HashMap<>();

    // Add a sport to both List and Map
    public void addSport(Sport sport) {
        if (sportsMap.containsKey(sport.getName())) {
            throw new IllegalArgumentException("Error: Sport '" + sport.getName() + "' already exists.");
        }
        sportsList.add(sport);
        sportsMap.put(sport.getName(), sport);
    }

    // Remove a sport by name
    public void removeSport(String name) {
        if (!sportsMap.containsKey(name)) {
            System.out.println("Warning: Sport '" + name + "' not found.");
            return;
        }
        sportsList.removeIf(sport -> sport.getName().equalsIgnoreCase(name));
        sportsMap.remove(name);
        System.out.println("Sport '" + name + "' removed successfully.");
    }

    // Display all sports
    public void displayAllSports() {
        if (sportsList.isEmpty()) {
            System.out.println("No sports available.");
            return;
        }
        sportsList.forEach(Sport::showDetails);
    }

    // Get a sport by name
    public Sport getSport(String name) {
        if (!sportsMap.containsKey(name)) {
            System.out.println("Error: Sport '" + name + "' not found.");
            return null;
        }
        return sportsMap.get(name);
    }

    // Filter sports using Java 8 Streams
    public List<Sport> filterSportsByType(String type) {
        List<Sport> filteredList = sportsList.stream()
                .filter(sport -> sport.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());

        if (filteredList.isEmpty()) {
            System.out.println("No sports found for type: " + type);
        }
        return filteredList;
    }

    // Sort sports by name
    public void sortSportsByName() {
        if (sportsList.isEmpty()) {
            System.out.println("Sorting not possible. No sports available.");
            return;
        }
        sportsList.sort(Sport.byName());
        System.out.println("Sports sorted successfully.");
    }

    // Find the sport with the most players
    public Optional<Sport> findSportWithMostPlayers() {
        if (sportsList.isEmpty()) {
            System.out.println("No sports available to find the one with the most players.");
            return Optional.empty();
        }
        return sportsList.stream().max(Comparator.comparingInt(Sport::getPlayers));
    }

    // Count sports by type
    public Map<String, Long> countSportsByType() {
        if (sportsList.isEmpty()) {
            System.out.println("No sports available to count.");
            return Collections.emptyMap();
        }
        return sportsList.stream()
                .collect(Collectors.groupingBy(Sport::getType, Collectors.counting()));
    }

    //  Get total number of players in all sports**
    public int getTotalPlayers() {
        if (sportsList.isEmpty()) {
            System.out.println("No sports available to calculate total players.");
            return 0;
        }
        return sportsList.stream().mapToInt(Sport::getPlayers).sum();
    }
}

// Main class to test the implementation with Exception Handling
public class Sports {
    public static void main(String[] args) {
        SportsManager manager = new SportsManager();

        try {
            // Adding sports
            manager.addSport(new Cricket("Cricket", "Outdoor", 11));
            manager.addSport(new Football("Football", "Outdoor", 90));
            manager.addSport(new Cricket("Baseball", "Outdoor", 9));
            manager.addSport(new Football("Rugby", "Outdoor", 80));
            manager.addSport(new Cricket("Table Tennis", "Indoor", 2));

            // Attempting to add a duplicate sport (should throw exception)
            manager.addSport(new Cricket("Cricket", "Outdoor", 11));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Display all sports
        System.out.println("\nAll Sports:");
        manager.displayAllSports();

        // Fetch and display a specific sport
        System.out.println("\nFetching Cricket details:");
        Sport cricket = manager.getSport("Cricket");
        if (cricket != null) cricket.showDetails();

        // Fetching a non-existent sport
        System.out.println("\nFetching Unknown Sport:");
        manager.getSport("Hockey");

        // Removing a sport
        manager.removeSport("Football");

        // Removing a non-existing sport
        manager.removeSport("Basketball");

        // Displaying all sports after removal
        System.out.println("\nAfter removing Football:");
        manager.displayAllSports();

        // Filtering sports by type
        System.out.println("\nFiltering Outdoor Sports:");
        List<Sport> outdoorSports = manager.filterSportsByType("Outdoor");
        outdoorSports.forEach(Sport::showDetails);

        // Filtering sports with an invalid type
        System.out.println("\nFiltering Water Sports:");
        manager.filterSportsByType("Water");

        // Sorting sports by name
        System.out.println("\nSorting Sports by Name:");
        manager.sortSportsByName();
        manager.displayAllSports();

        // Finding the sport with the most players
        Optional<Sport> mostPlayersSport = manager.findSportWithMostPlayers();
        mostPlayersSport.ifPresent(sport ->
                System.out.println("\nSport with the Most Players: " + sport.getName() + " (Players: " + sport.getPlayers() + ")"));

        // Counting sports by type
        System.out.println("\nCounting Sports by Type:");
        Map<String, Long> sportCounts = manager.countSportsByType();
        sportCounts.forEach((type, count) -> System.out.println(type + ": " + count));

        // **New Feature: Display total number of players**
        System.out.println("\nTotal Number of Players in All Sports: " + manager.getTotalPlayers());
    }
}
