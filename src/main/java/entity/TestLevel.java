package entity;

public enum TestLevel {

    UNIT(1),
    API(3),
    GUI(9);


    TestLevel(int COMLEXITY) {
        this.COMLEXITY = COMLEXITY;
    }

    public int COMLEXITY;


}