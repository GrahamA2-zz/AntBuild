package uk.co.crowderconsult.sch;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class VatCalcTest {

	VatCalc vc;

	@Before
	public void setUp() throws Exception {
		vc = new VatCalc(.2);
	}

	@Test
	public void test1() {
		assertThat(vc.calcualteVAT(100d), is(120d));
	}

	@Test
	public void test2() {
		assertThat(vc.calcualteVAT(200d), is(240d));
	}
	@Test
	public void test0() {
		assertThat(vc.calcualteVAT(0), is(0d));
	}
	@Test
	public void test4() {
		assertThat(vc.calcualteVAT(10), is(12d));
	}


}
