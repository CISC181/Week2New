package CISC181.Week2.Package1;

/**
 * @category - Chapter 4 (Loops)
 * @author Dad
 *
 */

/**
 * Notes - Introduction While loop
 * 
 * Things to note: Method - WhileLoop - This method executes while variable "x"
 * is < 20... note that the value starts at 10
 * 
 * Method - DoWhileLoop - This method is similar, except the condition is
 * checked AFTER the loop is complete. This kind of loop executed at least one
 * time
 * 
 * Method - ForLoop - The 'For' syntax has three parts... the first part stuff
 * you want to happen BEFORE the code starts, the second part is the condition
 * you want to check, the third part is the stuff you want to do AFTER EACH
 * ITERATION of the loop
 * 
 * Method - EnhancedForLoop for(declaration : expression) { //Statements }
 * Declaration: The newly declared block variable, which is of a type compatible
 * with the elements of the array you are accessing. The variable will be
 * available within the for block and its value would be the same as the current
 * array element. Expression: This evaluates to the array you need to loop
 * through. The expression can be an array variable or method call that returns
 * an array.
 *
 * 
 * Method - ForWithBreak - The break keyword is used to stop the entire loop.
 * The break keyword must be used inside any loop or a switch statement. The
 * break keyword will stop the execution of the innermost loop and start
 * executing the next line of code after the block.
 * 
 * Method - ForWithContinue - The continue keyword can be used in any of the
 * loop control structures. It causes the loop to immediately jump to the next
 * iteration of the loop. In a for loop, the continue keyword causes flow of
 * control to immediately jump to the update statement. In a while loop or
 * do/while loop, flow of control immediately jumps to the Boolean expression.
 * 
 * 
 * 
 * Things to consider:
 * 
 * What does int[] numbers = { 10, 20, 30, 40, 50 }; mean? What does x++; do?
 * 
 */

public class CMain {

	public static void main(String[] args) {

		SwitchStatement();
		WhileLoop();
		DoWhileLoop();
		ForLoop();
		EnhancedForLoop();
		ForWithBreak();
		ForWithContinue();

	}

	private static void SwitchStatement() {
		char ch = 'c';

		switch (ch) {
		case 'a':
		case 'A':
			System.out.print(ch);
			break;
		case 'b':
		case 'B':
			System.out.print(ch);
			break;
		case 'c':
		case 'C':
			System.out.print(ch);
			break;
		case 'd':
		case 'D':
			System.out.print(ch);
		}
	}

	private static void WhileLoop() {
		int x = 10;

		System.out.println("Begin of WhileLoop");
		while (x < 20) {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		}
		System.out.println("End of WhileLoop");
		System.out.println("\n");
	}

	private static void DoWhileLoop() {
		int x = 10;
		System.out.println("Begin of DoWhileLoop");
		do {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		} while (x < 20);

		System.out.println("End of DoWhileLoop");
		System.out.println("\n");
	}

	private static void ForLoop() {
		System.out.println("Begin of ForLoop");

		for (int x = 10; x < 20; x = x + 1) {
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}

		System.out.println("End of ForLoop");
		System.out.println("\n");

	}

	private static void EnhancedForLoop() {
		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println("Begin of EnhancedForLoop");

		for (int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");

		String[] names = { "James", "Larry", "Tom", "Lacy" };
		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
		}
		System.out.println("\n");
		System.out.println("End of EnhancedForLoop");
		System.out.println("\n");
	}

	private static void ForWithBreak() {
		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println("Begin of ForWithBreak");
		for (int x : numbers) {
			if (x == 30) {
				break;
			}
			System.out.print(x);
			System.out.print("\n");
		}

		System.out.println("End of ForWithBreak");
		System.out.println("\n");
	}

	private static void ForWithContinue() {
		int[] numbers = { 10, 20, 30, 40, 50 };
		System.out.println("Begin of ForWithBreak");
		for (int x : numbers) {
			if (x == 30) {
				continue;
			}
			System.out.print(x);
			System.out.print("\n");
		}
		System.out.println("End of ForWithContinue");
		System.out.println("\n");

	}
}
