package uk.co.crowderconsult.sch;

import org.junit.Before;
import org.junit.Test;

public class PerformanceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test(timeout=500)
	public void test() {
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {}
	}

}
