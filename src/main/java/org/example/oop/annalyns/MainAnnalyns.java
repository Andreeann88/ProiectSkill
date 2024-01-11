package org.example.oop.annalyns;

public class MainAnnalyns {
    public static void main(String[] args) {
        Annalyns annalyns = new Annalyns();

        System.out.println(annalyns.canFastAttack(false));
        System.out.println(annalyns.canSpy(false,true,true));
        System.out.println(annalyns.canSignalPrisoner(false, true));
        System.out.println(annalyns.canFreePrisoner(false, true, false, false));
    }
    // in teste - validari
    // in main - nu ai validari

}
