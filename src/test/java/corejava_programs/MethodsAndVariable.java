package corejava_programs;

public class MethodsAndVariable {

	public static void add() {
		int a = 100;
		int b = 20;
		int c = a+b;
		System.out.println("Add result is: " +c);
		
	}
	public static void add (int a,int b) {
		int c = a+b;
		System.out.println("Add result is:" +c);
	}
public static void sub() {
	int a = 50;
	int b = 20;
	int c = a-b;
	System.out.println("sub result is =" + (a-b));
}
public static void main(String[] args) {
	add();
	sub();
	add(45,20);
}
}