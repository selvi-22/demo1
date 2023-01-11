package org.chainsys.calculator;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World! in Calculator ");
		Calcu c = new Calcu();
		int sum = c.addition(13, 10);
		System.out.println(sum);
		int diff = c.difference(20, 35);
		System.out.println(diff);

	}
}
