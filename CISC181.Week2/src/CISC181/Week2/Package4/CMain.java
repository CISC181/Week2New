package CISC181.Week2.Package4;

/**
 * @category - Chapter 2 (Elementary Programming)
 * @author Dad
 *
 */

/*
 * Notes - Operators
 * 
 * Things to note:
 * 
 * Crash course on operators...  Arithmetic, Relational, Bitwise, Logical, Assignment and Misc.  One stop shopping.
 * 
 * 
 * Things to consider:
 * 
 * Take a look at the conditional operator.  What does this operation replace?
 * 
 */

public class CMain {

	public static void main(String[] args) {

		ArithmeticOperators();
		RelationalOperators();
		BitwiseOperators();
		LogicalOperators();
		AssignmentOperators();
		MiscOperators();
	}

	private static void ArithmeticOperators() {
		System.out.println("Start of ArithmeticOperators");

		int a = 10;
		int b = 20;
		int c;

		// Addition
		c = a + b;
		System.out.println("a + b = " + c);

		// Subtraction
		c = b - a;
		System.out.println("b - a = " + c);

		// Multiplication
		c = a * b;
		System.out.println("a multiply b = " + c);

		// Division
		c = b / a;
		System.out.println("b divided by a = " + c);

		// Modulus
		c = b % a;
		System.out.println("b modulus a = " + c);

		// Increment
		System.out.println("Value of a before " + a);
		a++;
		System.out.println("Value of a after " + a);

		// Decrement
		System.out.println("Value of a before " + a);
		a--;
		System.out.println("Value of a after " + a);

		System.out.println("End of ArithmeticOperators");
		System.out.println("\n");

	}

	private static void RelationalOperators() {

		System.out.println("Start of RelationalOperators");
		int a = 1;
		int b = 2;

		// Check Equality
		if (a == b) {
			System.out.println("a is equal to b");

		} else {
			System.out.println("a is not equal to b");
		}

		// Check Inequality
		if (a != b) {
			System.out.println("a is not equal to b");

		} else {
			System.out.println("a is equal to b");
		}

		// Check Less Than
		if (a < b) {
			System.out.println("a is less than b");

		} else {
			System.out.println("a is not less than  b");
		}

		// Check Less EqualTo Than
		if (a <= b) {
			System.out.println("a is less or equal to b");

		} else {
			System.out.println("a is not less or equal to b");
		}

		// Check Greater Than
		if (a > b) {
			System.out.println("a is greater than b");

		} else {
			System.out.println("a is not greater than  b");
		}

		// Check Greater Equal to
		if (a >= b) {
			System.out.println("a is greater than or equal to b");

		} else {
			System.out.println("a is not greater than or equal to  b");
		}

		System.out.println("End of RelationalOperators");
		System.out.println("\n");
	}

	private static void BitwiseOperators() {

		System.out.println("Start of BitwiseOperators");
		int a = 60;
		int b = 13;
		int c;

		System.out.println("Logical And operation");

		System.out.println(String.format("%8s", Integer.toBinaryString(a))
				.replace(' ', '0'));
		System.out.println(String.format("%8s", Integer.toBinaryString(b))
				.replace(' ', '0'));
		System.out.println("--------");
		c = a & b;
		System.out.println(String.format("%8s", Integer.toBinaryString(c))
				.replace(' ', '0'));
		System.out.println("\n");

		System.out.println("Logical Or operation");
		System.out.println(String.format("%8s", Integer.toBinaryString(a))
				.replace(' ', '0'));
		System.out.println(String.format("%8s", Integer.toBinaryString(b))
				.replace(' ', '0'));
		System.out.println("--------");
		c = a | b;
		System.out.println(String.format("%8s", Integer.toBinaryString(c))
				.replace(' ', '0'));
		System.out.println("\n");

		System.out.println("Logical XOr operation");
		System.out.println(String.format("%8s", Integer.toBinaryString(a))
				.replace(' ', '0'));
		System.out.println(String.format("%8s", Integer.toBinaryString(b))
				.replace(' ', '0'));
		System.out.println("--------");
		c = a ^ b;
		System.out.println(String.format("%8s", Integer.toBinaryString(c))
				.replace(' ', '0'));
		System.out.println("\n");

		System.out.println("Logical Left Shift");
		System.out.println(String.format("%8s", Integer.toBinaryString(a))
				.replace(' ', '0'));
		System.out.println("--------");
		c = a << 2;
		System.out.println(String.format("%8s", Integer.toBinaryString(c))
				.replace(' ', '0'));
		System.out.println("\n");

		System.out.println("Logical Right Shift");
		System.out.println(String.format("%8s", Integer.toBinaryString(a))
				.replace(' ', '0'));
		System.out.println("--------");
		c = a >> 2;
		System.out.println(String.format("%8s", Integer.toBinaryString(c))
				.replace(' ', '0'));
		System.out.println("\n");

		System.out.println("End of BitwiseOperators");
		System.out.println("\n");

	}

	private static void LogicalOperators() {

		System.out.println("Start of LogicalOperators");

		boolean b1 = false;
		boolean b2 = true;
		boolean b3;

		System.out.println("Value of b1: " + b1 + "   Value of b2: " + b2);
		b3 = b1 && b2;
		System.out.println("Value of b1 && b2: " + b3);
		System.out.println("\n");

		System.out.println("Value of b1: " + b1 + "   Value of b2: " + b2);
		b3 = b1 || b2;
		System.out.println("Value of b1 || b2: " + b3);
		System.out.println("\n");

		System.out.println("Value of b1: " + b1 + "   Value of b2: " + b2);
		b3 = !(b1 || b2);
		System.out.println("Value of !(b1 || b2): " + b3);
		System.out.println("\n");

		System.out.println("Value of b1: " + b1 + "   Value of b2: " + b2);
		b3 = !b1;
		System.out.println("Value of !(b1): " + b3);
		System.out.println("\n");

		System.out.println("End of LogicalOperators");
		System.out.println("\n");

	}

	private static void AssignmentOperators() {

		System.out.println("Start of AssignmentOperators");
		
		int a = 10;
		int b = 20;
		int c = 0;
		
		System.out.println("Value Before of a, b, c " + a + ',' +  b + ',' + c);
		c = a + b;
		System.out.println("Value After of a, b, c " + a + ',' + b + ',' + c);
		
		a = 1; b = 2; c = 3;
		System.out.println("Value Before of a, b, c " + a + ',' +  b + ',' + c);
		c += a;
		System.out.println("Value After of a, b, c " + a + ',' + b + ',' + c);

		a = 1; b = 2; c = 3;
		System.out.println("Value Before of a, b, c " + a + ',' +  b + ',' + c);
		c -= a;
		System.out.println("Value After of a, b, c " + a + ',' + b + ',' + c);

		
		a = 1; b = 2; c = 3;
		System.out.println("Value Before of a, b, c " + a + ',' +  b + ',' + c);
		c *= b;
		System.out.println("Value After of a, b, c " + a + ',' + b + ',' + c);				
		
		System.out.println("End of AssignmentOperators");
		System.out.println("\n");

		
	}

	private static void MiscOperators() {

		System.out.println("Start of MiscOperators");

		// Conditional Operator
		// Syntax of conditional operator.  Simplifies a boolean if/else assignment.
		// variable x = (expression) ? value if true : value if false
		int a, b;
		a = 10;
		b = (a == 1) ? 20 : 30;
		System.out.println("Value of b is : " + b);

		b = (a == 10) ? 20 : 30;
		System.out.println("Value of b is : " + b);

		System.out.println("End of MiscOperators");
		System.out.println("\n");
	}

}
