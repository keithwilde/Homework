//

import java.applet.Applet;
import java.math.*;

public class MyBigFactorial extends Applet {

	public String bigfactorial (int n) {
		BigInteger one = BigInteger.ONE;
		BigInteger counter = BigInteger.ZERO;
		BigInteger value = one;

		for (int i = 1; i <= n; i++) {
			counter = counter.add(one);
			value = value.multiply(counter);
		}
		return value.toString();
		
	}
}
