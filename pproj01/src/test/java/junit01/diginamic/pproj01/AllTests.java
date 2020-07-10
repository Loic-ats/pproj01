package junit01.diginamic.pproj01;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, PersonneTest.class, StringUtilsTest.class })
public class AllTests {

}
