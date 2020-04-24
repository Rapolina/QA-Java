package entity;


import worker.AutomationEngineer;
import worker.Engineer;
import worker.TestEngineer;

import java.util.function.Function;

public abstract class Test implements Function<Engineer, Result> {

    private int comlexity;
    private int instability;


    public int getComlexity() {
        return comlexity;
    }

    public void setComlexity(int comlexity) {
        this.comlexity = comlexity;
    }

    public int getInstability() {
        return instability;
    }

    public void setInstability(int instability) {
        if (instability <= 0) {
            this.instability = 1;
        } else if (instability > 10) {
            this.instability = 10;
        } else {
            this.instability = instability;
        }
    }


    public Test(TestLevel testLevel, int instability) {
        this.comlexity = testLevel.COMLEXITY;
        this.setInstability(instability);
    }


    @Override
    public Result apply(Engineer engineer) {
        int anxiety;
        if ((this instanceof ManualTest && engineer instanceof AutomationEngineer) || (this instanceof AutomatedTest && engineer instanceof TestEngineer)) {
            anxiety = engineer.getAnxiety();
        } else {
            anxiety = 1;
        }
        if (comlexity * instability * anxiety / engineer.getSkill() > 30) {
            return Result.FAILED;
        } else
            return Result.PASSED;
    }
}
