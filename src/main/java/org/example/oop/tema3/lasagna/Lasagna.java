package org.example.oop.tema3.lasagna;

public class Lasagna {
    public static int expectedMinutesInOven(){
        return 40;

    }

    public static int remainingMinutesInOven(int minuteInCuptor) {
        return Math.max(0,expectedMinutesInOven()-minuteInCuptor);
    }

    public static int preparationTimeInMinutes(int layers){
        return layers*2;
    }

    public static int totalTimeInMinutes(int minute, int layers){
        return preparationTimeInMinutes(layers) + minute;
    }
}

