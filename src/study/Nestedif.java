package study;

public class Nestedif {
public static void main(String[]args) {
	//marks=90 A grade
	//marks=80 B grade
	//marks =70 C grade
	//marks =60 D grade
	//marks<50 fail
	int marks =-10;
	if (marks>=0 && marks<=100) 
	{
	if(marks>=90) {
		System.out.println("A grade");
	}else 
	{if (marks>=80) {
		System.out.println("B grade");
	}else {
		if(marks>=70) {
			System.out.println("C grade");
		}else {
			if( marks>=60) {
				System.out.println("D grade");
			}if(marks<50) {
				System.out.println("fail");
			}
		}
	}
		
	}
}else {
	System.out.println("enter valid marks");
}
}
}