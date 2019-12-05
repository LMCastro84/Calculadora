import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestCalculadora {

	@Test
	public void testDivisao() {
		assertThrows(ArithmeticException.class, () -> calc.divide(2, 0));
	}


}
