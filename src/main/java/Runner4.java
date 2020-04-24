import entity.AutomatedTest;
import entity.ManualTest;
import entity.Test;
import entity.TestLevel;
import worker.AutomationEngineer;
import worker.Engineer;
import worker.TestEngineer;

public class Runner4 {
    public static void main(String[] args) {
        Test manualTest = new ManualTest(TestLevel.GUI, 5);
        Test automatedTest = new AutomatedTest(TestLevel.API, 3);

        Engineer testEngineer = new TestEngineer();
        Engineer automationEngineer = new AutomationEngineer();


        automationEngineer.executeTest(manualTest);
        automationEngineer.executeTest(automatedTest);

        testEngineer.executeTest(manualTest);
        testEngineer.executeTest(automatedTest);
    }
}

