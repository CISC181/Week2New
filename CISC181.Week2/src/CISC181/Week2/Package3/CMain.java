package CISC181.Week2.Package3;

/**
 * @category - Chapter 9 (Strings)
 * @author Dad
 *
 */

/*
 * Notes - Strings
 * 
 * Things to note:
 * 
 * The String class is not a primitive class.  Consider Strings an array of characters.  The String class comes with a bunch of very helpful methods...  
 * to find length... to concatenate (stick together).  The last method shows the basics in how to format a string with values.
 * 
 * 
 * Things to consider:
 * 
 * Why do you have to use the 'new' keyword to create a string?
 * 
 */
public class CMain {

	public static void main(String[] args) {

		StringMethod1();
		StringMethod2();
		StringMethod3();
		StringMethod4();
	}

	private static void StringMethod1() {
		System.out.println("Start of StringMethod1");

		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);

		System.out.println("End of StringMethod1");
		System.out.println("\n");
	}

	private static void StringMethod2() {

		System.out.println("Start of StringMethod2");

		String helloString = new String("Hello String");
		int len = helloString.length();
		System.out.println("The length of the string is: " + len);

		System.out.println("End of StringMethod2");
		System.out.println("\n");
	}

	private static void StringMethod3() {
		System.out.println("Start of StringMethod3");

		String strString1 = new String("First String");
		String strString2 = new String("Second String");
		String strString3;
		String strString4;

		strString3 = strString1 + strString2;

		strString4 = strString1.concat(strString2);

		System.out.println(strString3);
		System.out.println(strString4);

		System.out.println("End of StringMethod3");
		System.out.println("\n");
	}

	private static void StringMethod4() {
		System.out.println("Start of StringMethod4");

		float fVar = (float) 1.25;
		int iVar = 4;
		String sVar = new String("This String");

		String fs;
		fs = String
				.format("The value of the float variable is "
						+ "%f, while the value of the integer "
						+ "variable is %d, and the string " + "is %s", fVar,
						iVar, sVar);
		System.out.println(fs);

		System.out.println("End of StringMethod4");
		System.out.println("\n");

	}
}
