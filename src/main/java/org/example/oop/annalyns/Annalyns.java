package org.example.oop.annalyns;


public class Annalyns {
    public  boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
        // ! - opusul obiectului
    }

    public boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake  || archerIsAwake || prisonerIsAwake;
    }

    public boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {

        return !knightIsAwake && !archerIsAwake && prisonerIsAwake;


        //return (prisonerIsAwake && !knightIsAwake && !archerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
    }

