package org.example.oop.tema3.birdwatcher;

import java.util.Arrays;

public class MainBirdWatcher {
    public static void main(String[] args) {
        // Example usage
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        // Task 1: Check what the counts were last week
        int[] lastWeekCounts = birdCount.getLastWeek();
        System.out.println("Last week's counts: " + Arrays.toString(lastWeekCounts));

        // Task 2: Check how many birds visited today
        int todayCount = birdCount.getToday();
        System.out.println("Birds visited today: " + todayCount);

        // Task 3: Increment today's count
        birdCount.incrementTodaysCount();
        System.out.println("Updated birds visited today: " + birdCount.getToday());

        // Task 4: Check if there was a day with no visiting birds
        boolean hasDayWithoutBirds = birdCount.hasDayWithoutBirds();
        System.out.println("Has a day without birds: " + hasDayWithoutBirds);

        // Task 5: Calculate the number of visiting birds for the first number of days
        int countForFirstDays = birdCount.getCountForFirstDays(4);
        System.out.println("Count for the first 4 days: " + countForFirstDays);

        // Task 6: Calculate the number of busy days
        int busyDays = birdCount.getBusyDays();
        System.out.println("Number of busy days: " + busyDays);
    }
}


