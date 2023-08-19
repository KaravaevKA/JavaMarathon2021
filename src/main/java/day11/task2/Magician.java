package day11.task2;

import day11.task2.Interfaces.Healer;
import day11.task2.Interfaces.MagicAttack;

public class Magician extends Warrior implements  MagicAttack {

    public Magician(){
        physAtt = 5;
        physDef = 0.0;
        magicAtt = 20;
        magicDef = 0.8;
    }

    @Override
    public void physicalAttack(Hero h) {
        super.physicalAttack(h);
    }

    @Override
    public void magicalAttack(Hero h) {
        double attackScore = magicAtt * (1-h.magicDef);
        if(h.health - attackScore < 0){
            h.health = 0;
        }else {
            h.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
