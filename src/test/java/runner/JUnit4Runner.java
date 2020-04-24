package runner;

import test.ExecuteTestTest;
import test.BaseEngineerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ExecuteTestTest.class, BaseEngineerTest.class})
public class JUnit4Runner {
}
