import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("請輸入第一串數字");
        Scanner Sc =new Scanner(System.in);
        String a=Sc.next();
        System.out.println("請輸入第二串數字");
        String b=Sc.next();

        HugeInteger h1 =new HugeInteger();

        h1.parse(a,b);
        System.out.println("add is ");
        h1.add();
        System.out.print("subtract is ");
        h1.subtract();
        System.out.print("multiply is ");
        h1.multiply();
        System.out.print("divide is ");
        h1.divide();
        System.out.print("mod is ");
        h1.mod();
        boolean ans=h1.isEqualTo();
        boolean ans2=h1.isNotEqualTo();
        boolean ans3=h1.isGreaterThan();
        boolean ans4=h1.isLessThan();
        boolean ans5=h1.isGreaterThanOrEqualTo();
        boolean ans6=h1.isLessThanOrEqualTo();
        System.out.println("isEqualTo "+ans);
        System.out.println("isNotEqualTo "+ans2);
        System.out.println("isGreaterThan "+ans3);
        System.out.println("isLessThan "+ans4);
        System.out.println("isGreaterThanOrEqualTo "+ans5);
        System.out.println("isLessThanOrEqualTo "+ans6);
    }
}
