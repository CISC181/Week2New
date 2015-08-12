package CISC181.Week2.Package6;

/**
 * @category - Chapter 6 (Arrays)
 * @author Dad
 *
 */

public class CMain {

	/**
	 * Entry point for class
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProcessArray1();
		ForEachArray1();
		
		int[] myArray = {1, 3, 5, 11};
		PassArray1(myArray);
		
		int[] ReturnArray;
		ReturnArray = PassArray2(myArray);
	}
	
	/**
	 * Print all the elements in an array...  Sum all the elements in an array...  Find the max instance of an array...
	 */
	private static void ProcessArray1()
	{
		double[] myList = {1.9, 2.9, 3.4, 3.5};

	      // Print all the array elements
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " ");
	      }
	      // Summing all elements
	      double total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is " + total);
	      // Finding the largest element
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is " + max);

	}

	/**
	 * This method shows how to iterate (loop) through an array of doubles
	 */
	private static void ForEachArray1()
	{
	      double[] myList = {1.9, 2.9, 3.4, 3.5};

	      // Print all the array elements
	      for (double element: myList) {
	         System.out.println(element);
	      }
	}
	
	/**
	 * This method shows how to pass an array of integers (check out calling method)
	 * @param myArray
	 */
	private static void PassArray1(int[] myArray)
	{
		  for (int i = 0; i < myArray.length; i++) {
			    System.out.print(myArray[i] + " ");
			  }
	}
	
	/**
	 * This method doesn't do much... the point is to show you how to pass in an array and return an array
	 * 
	 * @param list - Pass in an array of integers
	 * @return - Return a list of integers
	 */
	public static int[] PassArray2(int[] list) 
	{
		  int[] result = new int[list.length];

		  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		    result[j] = list[i];
		  }
		  return result;
	}
}
