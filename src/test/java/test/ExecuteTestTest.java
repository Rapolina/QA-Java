package test;

import entity.*;
import worker.AutomationEngineer;
import worker.Engineer;
import worker.TestEngineer;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ExecuteTestTest {
    private Engineer engineer;
    private int skill;
    private entity.Test test;
    private Result expected;

    public ExecuteTestTest(Engineer engineer, int skill, entity.Test test, Result expected) {
        this.engineer = engineer;
        this.skill = skill;
        this.test = test;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new TestEngineer(), 1, new AutomatedTest(TestLevel.API, 1), Result.FAILED},
                {new AutomationEngineer(), 10, new ManualTest(TestLevel.GUI, 10), Result.PASSED},
                {new TestEngineer(), 1, new AutomatedTest(TestLevel.UNIT, 1), Result.PASSED},

                {new AutomationEngineer(), 10, new ManualTest(TestLevel.API, 10), Result.PASSED},
                {new TestEngineer(), 1, new AutomatedTest(TestLevel.GUI, 1), Result.PASSED},
                {new AutomationEngineer(), 10, new ManualTest(TestLevel.UNIT, 10), Result.PASSED},

                {new TestEngineer(), 10, new AutomatedTest(TestLevel.API, 10), Result.PASSED},
                {new AutomationEngineer(), 1, new ManualTest(TestLevel.GUI, 1), Result.PASSED},
                {new TestEngineer(), 10, new AutomatedTest(TestLevel.UNIT, 10), Result.PASSED},

                {new AutomationEngineer(), 10, new ManualTest(TestLevel.API, 1), Result.PASSED},
                {new TestEngineer(), 1, new AutomatedTest(TestLevel.GUI, 10), Result.FAILED},
                {new AutomationEngineer(), 10, new ManualTest(TestLevel.UNIT, 1), Result.PASSED},

                {new TestEngineer(), 1, new ManualTest(TestLevel.API, 10), Result.PASSED},
                {new TestEngineer(), 10, new AutomatedTest(TestLevel.GUI, 1), Result.PASSED},
                {new AutomationEngineer(), 1, new ManualTest(TestLevel.UNIT, 10), Result.PASSED}
        });
    }
}