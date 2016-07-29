package java_hw1;

import java.text.NumberFormat;

public class Rational {
private int numerator, denominator;
	
	public Rational(){   //构造函数
		this.numerator = 0;
		this.denominator = 0;
	}
	public Rational(int numerator, int denominator){  //构造函数
		
		
		int commonDivisor = gcd(numerator, denominator);  //调用函数
		this.numerator = numerator / commonDivisor;
		this.denominator = denominator / commonDivisor;
		
	}
	
	private int gcd(int a, int b){
		
		if(a == 0 || b == 0){
			return a+b;
		}
		return gcd(b,a%b);
	}   //通过最大公约数辗转相除
	//定义addition方法
	 static void addition(Rational a, Rational b,int point){
		Rational result =new Rational();//
		if(a.denominator == b.denominator){
			result = new Rational((a.numerator+b.numerator), (a.denominator));
		}else{
			result = new Rational(((a.numerator*b.denominator)+(b.numerator*a.denominator)), (a.denominator*b.denominator));
		}
		System.out.println(result);
		float temp_numerator=(float)result.numerator;
		float temp_denominator=(float)result.denominator;
		float temp=temp_numerator/temp_denominator;
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(point);    //小數後幾位
		System.out.println(nf.format(temp) );
		
	}
	 static void subtraction(Rational a, Rational b,int point){
		 Rational result ;//
			if(a.denominator == b.denominator){
				result = new Rational((a.numerator-b.numerator), (a.denominator));
			}else{
				result = new Rational(((a.numerator*b.denominator)-(b.numerator*a.denominator)), (a.denominator*b.denominator));
			}
			System.out.println(result);
			float temp_numerator=(float)result.numerator;
			float temp_denominator=(float)result.denominator;
			float temp=temp_numerator/temp_denominator;
			
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(point);    //小數後兩位
			System.out.println(nf.format(temp) );
	 }
	 static void multiplication(Rational a, Rational b,int point){
		 Rational result ;//
			
		 result = new Rational((a.numerator*b.numerator),(a.denominator*b.denominator));
		 System.out.println(result);
			float temp_numerator=(float)result.numerator;
			float temp_denominator=(float)result.denominator;
			float temp=temp_numerator/temp_denominator;
			
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(point);    //小數後兩位
			System.out.println(nf.format(temp) );	
			
	 }
	 static void division(Rational a, Rational b,int point){
		 Rational result ;//
			
		  result = new Rational((a.numerator*b.denominator),(a.denominator*b.numerator));
		 System.out.println(result);
			float temp_numerator=(float)result.numerator;
			float temp_denominator=(float)result.denominator;
			float temp=temp_numerator/temp_denominator;
			
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(point);    //小數後兩位
			System.out.println(nf.format(temp) );		
			
	 }
	 public String toString(){
			return this.numerator + "/" + this.denominator;
		}


}
