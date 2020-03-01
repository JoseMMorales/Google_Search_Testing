package google_Search_JUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TC1GoogleSearchChrome.class, TC2GoogleSearchFirefox.class })
public class GoogleSearchTestSuite {

}
