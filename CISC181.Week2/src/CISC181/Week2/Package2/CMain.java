package CISC181.Week2.Package2;

/**
 * @category - Chapter 9 (Strings)
 * @author Dad
 *
 */

/*
 * Notes - char Datatype and Character class
 * 
 * Things to note:
 * 
 * The 'char' datatype is pretty mundane.  It can hold one single character (char c = 'x'; works..  char c = 'xx'; does not work
 * 
 * The Character class is a wrapper class.  The Character class inherits the char class and implements a set of static methods (isLetter, isDigit, etc).
 * 
Escape Sequences:
\t	Inserts a tab in the text at this point.
\b	Inserts a backspace in the text at this point.
\n	Inserts a newline in the text at this point.
\r	Inserts a carriage return in the text at this point.
\f	Inserts a form feed in the text at this point.
\'	Inserts a single quote character in the text at this point.
\"	Inserts a double quote character in the text at this point.
\\	Inserts a backslash character in the text at this point.

 * 
 * Things to consider:
 * 
 * What does it mean when one class inherits another?
 * 
 */
public class CMain {

	public static void main(String[] args) {
		
		CharacterObject();
	}
	
	private static void CharacterObject()
	{
		Character ch = 'a';
		char c = 'x';
		
		
		System.out.println(ch);

		System.out.println(Character.toUpperCase(ch));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isDigit(ch));
		
		
		
		
		
		
	}

}
