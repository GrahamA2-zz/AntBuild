import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import uk.co.crowderconsult.sch.IntergrationTest;
import uk.co.crowderconsult.sch.OtherInterTests;
import uk.co.crowderconsult.sch.TestWithTheWrongName;

@RunWith(Suite.class)
@SuiteClasses({ IntergrationTest.class, OtherInterTests.class,TestWithTheWrongName.class})
public class AllIntergrationTests {



}
