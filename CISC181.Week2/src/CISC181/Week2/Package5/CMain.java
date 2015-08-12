package CISC181.Week2.Package5;

/**
 * @category - Chapter 10 (Thinking in Objects) and Chapter 5 (Methods)
 * @author Dad
 *
 */

public class CMain {

	public static void main(String[] args) {

		PrivateMethod();
		NoModifierMethod();
		ProtectedMethod();
		PublicMethod();
		
	}

	private static void PrivateMethod()
	{
		/*
		 * This static method is only available in this class.  An outside class cannot even see this method's signature
		 */
	}
	
	static void NoModifierMethod()
	{
		/*
		 * This static method is only available in this package.  If there's another class in this package, the other class can see this method.
		 */
	}
	
	protected static void ProtectedMethod()
	{
		/*
		 * Variables, methods and constructors which are declared protected in a superclass can be accessed only by the subclasses in other 
		 * package or any class within the package of the protected members' class.  The protected access modifier cannot be applied to class and 
		 * interfaces. Methods, fields can be declared protected, however methods and fields in a interface cannot be declared protected.
		 * Protected access gives the subclass a chance to use the helper method or variable, while preventing a nonrelated class from trying to use it.
		 */		
	}
	
	public static void PublicMethod()
	{
		/*
		 * This method can be see from any outside class that can see this class.
		 */
	}
	
}
