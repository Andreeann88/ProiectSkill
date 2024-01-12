package org.example.oop.tema3.birdwatcher;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int  [] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    // Task 1: Check what the counts were last week
    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    // Task 2: Check how many birds visited today
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    // Task 3: Increment today's count
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    // Task 4: Check if there was a day with no visiting birds
    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    // Task 5: Calculate the number of visiting birds for the first number of days
    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    // Task 6: Calculate the number of busy days
    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

}
