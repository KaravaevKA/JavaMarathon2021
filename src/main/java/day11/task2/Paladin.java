package day11.task2;

import day11.task2.Interfaces.Healer;

public class Paladin extends Hero implements Healer {
    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }




    @Override
    public void healHimself() {
        if (health + 25 > 100) {
            health = 100;
        } else {
            health += 25;
        }
    }


    @Override
    public void healTeammate(Hero h) {
        if (h.health + 25 > 100) {
            h.health = 100;
        }
        h.health += 10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
