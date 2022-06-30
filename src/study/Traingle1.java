package study;

public class Traingle1 {
public static void main(String[]args) {
	int a;//row
	int b;//Column
	for(a=1;a<=5;a++)// 
	{
		for(b=1;b<=a;b++) {
			System.out.print("* ");
		}System.out.println();
	}
	for(a=1;a<=5;a++) {
		for(b=5;b>=a;b--) {
			System.out.print("* ");
			
		}System.out.println();
	}
}
}
