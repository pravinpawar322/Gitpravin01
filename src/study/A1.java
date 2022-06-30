package study;

public class A1 {
int a;int b;int c;

void add() {
	a=10;b=20;
	c=a+b;
	System.out.println("sum of two numbers=" + c);
}
void sub() {
	a=100;b=200;
	c=b-a;
	System.out.println("sub of two numbers=" + c);
} public static void main(String[] args)
{
	C obj = new C ();
	obj.add();
	obj.sub();
	obj.multi();
	obj.div();
	obj.rem();
}
}
 class B extends A1{
	 void multi() {
			a=10;b=20;
			c=a*b;
			System.out.println("multi of two numbers=" + c);}
	 void div() {
			a=10;b=2;
			c=a/b;
			System.out.println("div of two numbers=" + c);}
}
 class  C extends B {
	 void rem() {
			a=10;b=3;
			c=a%b;
			System.out.println("rem of two numbers=" + c);}
	 class Result {
		 
	 }
	 }
