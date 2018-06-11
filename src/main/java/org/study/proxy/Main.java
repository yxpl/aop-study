package org.study.proxy;

import org.junit.Test;

public class Main {
	@Test
	public void test1() {
		ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorLoggingImpl();
		arithmeticCalculator.add(2, 3);
		arithmeticCalculator.sub(5, 2);
		arithmeticCalculator.mul(6, 3);
		arithmeticCalculator.div(9, 3);
	}
	
	@Test
	public void test2() {
		ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculatorImpl();
		arithmeticCalculator = new ArithmeticCalculatorLoggingProxy(arithmeticCalculator).getLoggingProxy();
		arithmeticCalculator.add(2, 3);
		arithmeticCalculator.sub(5, 2);
		arithmeticCalculator.mul(6, 3);
		arithmeticCalculator.div(9, 3);
	}
}
