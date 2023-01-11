package com.chainsys.datatype;

public class DatatypeEx {

	public static void main(String[] args) {
/*
 * byte
 * Minimum value is -128 (-2^7), 
 * Maximum value is 127 (inclusive)(2^7 -1),
 * short 
 * Minimum value is -32,768 (-2^15)
 * Maximum value is 32,767 (inclusive) (2^15 -1)
 * int
 * Minimum value is - 2,147,483,648 (-2^31)
 * Maximum value is 2,147,483,647(inclusive) (2^31 -1)
 * long
 * Minimum value is -9,223,372,036,854,775,808(-2^63)
 * Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
 * float
 * double
 * boolean
 * char
 */
		int number1=907;
		byte byteVariable=50;
		short shortVariable=17856;
		char charVariable='s';
		float floatVariable=456789f;
		double doubleVariable=9876543;
		boolean booleanValue;
		long longVariable=5678843678876345l;
		System.out.println(number1+"\n"+byteVariable+"\n"+shortVariable);
	}

}
