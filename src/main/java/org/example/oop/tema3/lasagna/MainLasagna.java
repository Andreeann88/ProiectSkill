package org.example.oop.tema3.lasagna;

public class MainLasagna {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        int expectedOvenTime = lasagna.expectedMinutesInOven();
        System.out.println("Expected oven time: " + expectedOvenTime + " minutes");

        int remainingOvenTime = lasagna.remainingMinutesInOven(30);
        System.out.println("Remaining oven time: " + remainingOvenTime + " minutes");

        int preparationTime = lasagna.preparationTimeInMinutes(2);
        System.out.println("Preparation time: " + preparationTime + " minutes");

        int totalTime = lasagna.totalTimeInMinutes(20 , 3);
        System.out.println("Total working time: " + totalTime + " minutes");

    }
}
