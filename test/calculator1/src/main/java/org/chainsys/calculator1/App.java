package org.chainsys.calculator1;

import org.chainsys.calculator.Calcu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		Calcu c = new Calcu();
		int addition = c.addition(45, 10);
		System.out.println(addition);

    }
}
