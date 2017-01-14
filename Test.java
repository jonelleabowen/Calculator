import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class Test {
	
	Calculator calc;

	@Before
	public void setUp() throws Exception {
		
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@org.junit.Test
	public void subtract()
	{
		calc.setOperation("subtract");
		calc.setNum1("3");
		calc.setNum2("7");
		calc.calculate();
		
		assertEquals(-4, calc.getResult(), .000);
	}

}
