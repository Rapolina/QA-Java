package worker;

import entity.Result;
import entity.Test;


public abstract class Engineer {
    private int a = 1;
    private int b = 11;
    private int anxiety = 3;
    private int skill;

    public void setSkill(int skill) {
        this.skill = skill;
    }


    public int getSkill() {
        return skill;
    }

    public void setAnxiety(int anxiety) {
        this.anxiety = anxiety;
    }

    public int getAnxiety() {
        return anxiety;
    }


    public Result executeTest(Test test) {
        return test.apply(this);
    }

    public void setSkillRandom() {
        this.skill = a + (int) (Math.random() * (b - a));
    }
}
