package org.example.oop.tema3.warriors;


    class Warrior extends Fighter {

        @Override
        public String toString() {
            return "Fighter is a Warrior";
        }
        @Override
        int demgePoint(Fighter opponent) {
            return 0;
        }

        @Override
        int damagePoints(Fighter wizard) {
            return wizard.isVulnerable() ? 10 : 6;
        }
    }

