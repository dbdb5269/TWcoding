package java_hw1;
import java.util.Scanner;
public class Rationaltest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first Rational ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Rational a = new Rational (x,y);
		System.out.println("secend Rational ");
		Scanner sc2 = new Scanner(System.in);
		int x2 = sc2.nextInt();
		int y2 = sc2.nextInt();
		Rational b = new Rational (x2,y2);
		System.out.println("請輸入保留小數位");
		Scanner sc3 = new Scanner(System.in);
		int point = sc3.nextInt();
		
		System.out.print("addition result is ");
		Rational add = new Rational();
		add.addition(a, b,point);
		
		
		System.out.print("subtraction result is ");
		Rational subtraction = new Rational();
		subtraction.subtraction(a, b,point);
		
		
		System.out.print("multiplication result is ");
		Rational multiplication = new Rational();
		multiplication.multiplication(a, b,point);
		
		System.out.print("division result is ");
		Rational division = new Rational();
		division.division(a, b,point);
		


		
		
		
		
		
		
		
		
	}
}
