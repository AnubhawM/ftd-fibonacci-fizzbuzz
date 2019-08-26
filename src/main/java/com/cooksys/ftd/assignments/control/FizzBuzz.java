package com.cooksys.ftd.assignments.control;

import java.util.ArrayList;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * FizzBuzz is an old programming exercise.
 * The goal is to iterate over a range of numbers and print a message about each number's divisibility.
 * <p>
 * The message is generated the following way:
 * *) if the number is divisible by three, the message is `Fizz`
 * *) if the number is divisible by five, the message is `Buzz`
 * *) if the number is divisible by both three and five, the message is `FizzBuzz`
 * *) otherwise, no message is produced
 * <p>
 * The exact message format for this assignment is specified in the `message(n)` method.
 */
public class FizzBuzz {

    /**
     * Checks whether a given int `a` is evenly divisible by a given int `b` or not.
     * For example, `divides(4, 2)` returns `true` and `divides(4, 3)` returns `false`.
     *
     * @param a the number to be divided
     * @param b the number to divide by
     * @return `true` if a is evenly divisible by b, `false` otherwise
     * @throws IllegalArgumentException if b is zero
     */
    public static boolean divides(int a, int b) throws IllegalArgumentException {
        //throw new NotImplementedException();
    	if (b == 0) {
    		throw new IllegalArgumentException();
    	}
    	return true ? (a % b == 0) : (a % b != 0);
    }

    /**
     * Generates a divisibility message for a given number. Returns null if the given number is not divisible by 3 or 5.
     * Message formatting examples:
     * 1 -> null // not divisible by 3 or 5
     * 3 -> "3: Fizz" // divisible by only 3
     * 5 -> "5: Buzz" // divisible by only 5
     * 15 -> "15: FizzBuzz" // divisible by both three and five
     *
     * @param n the number to generate a message for
     * @return a message according to the format above, or null if n is not divisible by either 3 or 5
     */
    public static String message(int n) {
        //throw new NotImplementedException();
    	if (divides(n, 3) && divides(n, 5)) {
    		return Integer.toString(n) + ": FizzBuzz";
    	}
    	else if (divides(n, 3) == true) {
    		return Integer.toString(n) + ": Fizz";
    	}
    	else if (divides(n, 5)) {
    		return Integer.toString(n) + ": Buzz";
    	}
    	else if (n == 1) {
    		return null;
    	}
    	else {
    		return "null";
    	}
    }

    /**
     * Generates an array of messages to print for a given range of numbers.
     * If there is no message for an individual number (i.e., `message(n)` returns null),
     * it should be excluded from the resulting array.
     *
     * @param start the number to start with (inclusive)
     * @param end the number to end with (exclusive)
     * @return an array of divisibility messages
     * @throws IllegalArgumentException if the given end is less than the given start
     */
    public static String[] messages(int start, int end) throws IllegalArgumentException {
        //throw new NotImplementedException();
    	if (end < start) {
    		throw new IllegalArgumentException();
    	}
    	if (start == end) {
    		String[] fizzBuzzMessages = new String[0];
    		return fizzBuzzMessages;
    	}
    	/*
    	else if (start == end && !message(start).equals("null")) {
    		String[] fizzBuzzMessages = new String[1];
    		fizzBuzzMessages[0] = message(start);
    		return fizzBuzzMessages;
    	}
    	*/
    	else {

	    	String[] fizzBuzzMessages = new String[(end - start)];
	    	//System.out.println(fizzBuzzMessages.length);
	    	
	    	int fizzBuzzIndex = 0;
	    	int nullCounter = 0;
	
	
	    	for (int i = start; i < end; i++) {

	    		if (message(i).equals("null")) {
	    			nullCounter++;
	    		}
				fizzBuzzMessages[fizzBuzzIndex] = message(i);
				if (end - start > 1 && end - i > 1) {
					fizzBuzzIndex++;
				}
				System.out.println(fizzBuzzIndex);
	    	}
	    	
	    	String[] finalMessages = new String[(fizzBuzzIndex + 1) - nullCounter];
	    	int ind = 0;
	    	for (int k = 0; k < fizzBuzzMessages.length; k++) {
	    		if (!fizzBuzzMessages[k].equals("null")) {
	    			finalMessages[ind] = fizzBuzzMessages[k];
	    			ind++;
	    		}
	    	}
    		return finalMessages;

    	}
    }

    
    
    /**
     * For this main method, iterate over the numbers 1 through 115 and print
     * the relevant messages to sysout
     */
    public static void main(String[] args) {
        //throw new NotImplementedException();
    	for (int i = 2; i <= 115; i++) {
    		System.out.println(message(i));
    	}
    }

}
