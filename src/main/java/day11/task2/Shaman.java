package day11.task2;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Shaman extends Warrior implements MagicAttack, Healer {

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicAtt = 15;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + 50 > 100) {
            health = 100;
        }
        health += 50;
    }

    @Override
    public void healTeammate(Hero h) {
        if (h.health + 30 > 100) {
            h.health = 100;
        } else {
            h.health += 30;
        }
    }

    @Override
    public void physicalAttack(Hero h) {
        super.physicalAttack(h);
    }

    @Override
    public void magicalAttack(Hero h) {
        double attackScore = magicAtt * (1 - h.magicDef);
        if (h.health - attackScore < 0) {
            h.health = 0;
        } else {
            h.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
