package org.example.oop.tema3.warriors;

public class MainWarr {
    public static void main(String[] args) {

        Fighter warrior = new Warrior();
        System.out.println(warrior.toString());

        System.out.println(warrior.isVulnerable());

        Fighter wizard = new Wizard();
        ((Wizard) wizard).prepareSpell();

        System.out.println(wizard.isVulnerable());
        System.out.println(((Wizard) wizard).damagePoints(warrior));
        System.out.println(((Warrior) warrior).damagePoints(wizard));
    }

}
