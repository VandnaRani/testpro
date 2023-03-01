package corejava_programs;

public class VariableSample_java {
	//Global variable
	public static int a = 100;
	public static int b = 50;
	

	public static void add() {
		//local variable
	//int a = 90;
	//int b = 80;
	int c = a+b;
	System.out.println("Add result is:" +c);
	
	}
public static void sub() {
	//local variable
	//int a = 20;
	//int b = 10;
	
	System.out.println("sub result is =" +(a-b));
}
	public static void main(String[] args) {
		add();
		sub();
}
}
