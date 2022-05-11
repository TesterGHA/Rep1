package UdemySeleniumPractice;

public class Methods {

	public static void main(String[] args) {
		// why method? to organize lines of codes that are used frequently
		//do NOT create methods inside the main method b/c main method is reserved for execution
		//in order to use the method of any class first you have to create the object of the class and access  the methods through the object
		Methods m=new Methods();
		//tp use its methods use the class object ref.name
		m.getData();
// to store the returning value of method returnData
		String s=m.returnData();
		System.out.println(s);
		//to access methods from another class within the same package first create the object of that class:
		MethodsDemo md=new MethodsDemo();
		//then access its methods:
		md.loveData();
		System.out.println(md);
		
		Eshgh();
		
	}

	
	//outside the main method codes and methods will not be executed unless they are called in the main method whenever they are needed
	//methods can be used in any other class
	//to declare a method:
	
	public void getData() {
		System.out.println("You Rock");
		
	}
	
	public String returnData() {
		//if the method returns any values use 'return' keyword and change the return type of the method from void to your data return type
				
		return "Peace";
		//you can store the returned value in a variable(line 13)
		
	}
	
	//in order to access methods in the main method directly without using the object of the class must declare the method as static line 21
	//this way the method will belong to the class
	
	public static void Eshgh() {
		System.out.println("Eshgh");
	}
	
}
