package UdemySeleniumPractice;

import org.checkerframework.checker.index.qual.LengthOf;
import org.checkerframework.checker.units.qual.Length;

public class StringObjectAndMethods {

	public static void main(String[] args) {
		// String is an Object of class java.lang.String which represent a sequence of characters.
		//String is special in that we can assign values directly to String variables using String Literal which is text inside double quotes
		//assigning values using String Literal will store the content in the common pool of memory which allows sharing of location in case of similar content which in turn saves memory 
		//we can also assign values to String by calling a constructor using 'new' operator,
		//in which a new memory location in the heap memory will be assigned to each instance of the String and and location sharing is impossible (not recommended)
		//Strings are immutable: Strings can not be modified since sharing is possible in the common pool. in case of any change a new instace of the string will be created with the modified content.
		
		
		String s="Hello Dear World";//assigning values directly to String Variable in the common pool memory
		String s1=new String("Hello Dear World");//assigning value using a constructor in the heap memory
		
		//to split text:since it returns multiple values we will store it an String Array
		String[] SplittedStringArray=s.split(" ");
		
		//to access and print indexes of the String Array:
		System.out.println(SplittedStringArray[0]);
		System.out.println(SplittedStringArray[1]);
		System.out.println(SplittedStringArray[2]);
		
		//splitting using the middle world
		String[] SplittedStringArray1= s.split("Dear");
		System.out.println(SplittedStringArray1[0]);
		System.out.println(SplittedStringArray1[1]);
		
		//to trim the unwanted spaces use trim()
		System.out.println(SplittedStringArray1[1].trim());
		
		
		
		//to print the string value character by character:
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		
		//to print the string value character by character in reverse
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
