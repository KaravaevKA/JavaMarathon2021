package day11.task2;

import day11.task2.Interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALTH = 0;
     int health;
     int physAtt;
     double physDef;
     double magicDef;
     int magicAtt;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero h) {
        double attackScore = physAtt * (1-h.physDef);
        if (h.health - attackScore < 0) {
            h.health = 0;
        } else {
            h.health -= attackScore;
        }
    }



}
