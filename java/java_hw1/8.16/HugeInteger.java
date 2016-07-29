import java.math.BigInteger;

/**
 * Created by dubo on 16/4/9.
 */
public class HugeInteger {
    public int[] num1=new int[40];
    public int[] num2=new int[40];
    public int[] nums=new int[40];
    public int n1,n2;
    int[] temp;
    int[] tempx;
    int[] num3;
    int max_length = 0;
    int min_length = 0;
    public void parse(String s1,String s2){
        this.n1=s1.length();
        this.n2=s2.length();

        for(int i=0;i<n1;i++){
            int x1=s1.charAt(i)-'0';
            num1[i]=x1;

        }
        for(int i=0;i<n2;i++){
            int x2=s2.charAt(i)-'0';
            num2[i]=x2;
        }
    }
    public void test(){

    }
    public void add() {
        if (n1 >= n2) {
            temp = new int[n1];
            max_length = n1;
            min_length= n2;
            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num2[k];
                k=k+1;
            }
            for (int i = max_length-1; i >= 0; i--) {
                temp[i]=num1[i]+num3[i];
            }
        } else {
            temp = new int[n2];
            max_length = n2;
            min_length= n1;
            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num1[k];
                k=k+1;
            }
            for (int i = max_length-1; i >= 0; i--) {
                temp[i]=num2[i]+num3[i];
            }
        }






        for (int i = max_length-1; i >= 1; i--) {

            if (temp[i] >= 10) {
                temp[i] = temp[i] - 10;
                temp[i - 1] = temp[i - 1] + 1;
            }

        }

        toString();
        System.out.println();
    }
    public String toString(){
        String s="";
        for(int i = 0; i < temp.length; i++)
            s=s+temp[i];
        System.out.print(s);
        return s;
    }
    public String toString2(String S){

        String C=S;
        System.out.println(C);
        return C;


    }
    public boolean isEqualTo() {
        int max_length;
        boolean flag=false;
        if (n1 > n2) {
            max_length = n1;
        } else {
            max_length = n2;
        }
        for(int i=0;i<=max_length-1;i++) {
            if (num1[i] == num2[i])
                flag=true;
             else {
                flag=false;
            }
        }
        return flag;

    }
    public boolean isNotEqualTo() {
        int max_length = 0;
        boolean flag=true;
        if (n1 > n2) {
            max_length = n1;
        } else {
            max_length = n2;
        }
        for(int i=0;i<=max_length-1;i++) {
            if (num1[i] != num2[i]) {
                flag=true;
            } else {
                flag=false;
            }
        }
        return flag;


    }
    public boolean isGreaterThan(){
        boolean flag=false;
        if (n1 >= n2) {
            temp = new int[n1];
            max_length = n1;
            min_length= n2;
            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num2[k];
                k=k+1;
            }
            for(int i=0;i<max_length;i++){
                if(num1[i]>num3[i]){

                    flag=true;
                }
                else {

                    flag=false;
                }
            }
            return flag;
        } else {
            temp = new int[n2];
            max_length = n2;
            min_length= n1;
            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num1[k];
                k=k+1;
            }
            for(int i=0;i<max_length;i++){
                if(num3[i]>num2[i]){

                    flag=true;
                }
                else {

                    flag=false;
                }
            }
            return flag;
        }


    }
    public  boolean isLessThan() {
        boolean flag=false;
        if (n1 >= n2) {
            temp = new int[n1];
            max_length = n1;
            min_length= n2;
            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num2[k];
                k=k+1;
            }
            for (int i = 0; i < max_length; i++) {
                if (num1[i] < num3[i])
                    flag=true;
                else {
                    flag=false;
                }

            }
        } else {
            temp = new int[n2];
            max_length = n2;
            min_length= n1;
            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num1[k];
                k=k+1;
            }
            for (int i = 0; i < max_length; i++) {
                if (num3[i] < num2[i])
                    flag=true;
                else {
                    flag=false;
                }

            }
        }


        return flag;
    }
    public  boolean isGreaterThanOrEqualTo(){
        boolean flag=false;
        if (n1 >= n2) {
            temp = new int[n1];
            max_length = n1;
            min_length= n2;
            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num2[k];
                k=k+1;
            }
            for(int i=0;i<max_length;i++){
                if (num1[i] >= num3[i])
                    flag=true;
                else {
                    flag=false;
                }
            }
        } else {
            temp = new int[n2];
            max_length = n2;
            min_length= n1;
            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num1[k];
                k=k+1;
            }
            for(int i=0;i<max_length;i++){
                if (num3[i] >= num2[i])
                    flag=true;
                else {
                    flag=false;
                }
            }
        }

        return flag;
    }
    public boolean isLessThanOrEqualTo(){
        boolean flag=false;
        if (n1 >= n2) {

            max_length = n1;
            min_length= n2;

            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num2[k];
                k=k+1;

            }
            for(int i=0;i<max_length;i++){
                if (num1[i] <= num3[i]){
                    flag=true;}
                else {
                    flag=false;
                }
            }

        }

        if(n1<n2){
            temp = new int[n2];
            max_length = n2;
            min_length= n1;
            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num1[k];
                k=k+1;
            }
            for(int i=0;i<max_length;i++){
                if (num3[i] <= num2[i])
                    flag=true;
                else {
                    flag=false;
                }
            }
        }


        return flag;
    }
    public void subtract(){
        String  flag="1";

        for(int i=0;i<max_length;i++){
            if(num1[i]>=num2[i]){

                flag="1";
            }

            else {
                flag="3";
            }
        }


        if (flag=="1") {
            max_length = n1;
            min_length= n2;
            temp = new int[n1];

            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num2[k];
                k=k+1;
            }

            for (int i = max_length-1; i >-1; i--) {

                temp[i] = num1[i] - num3[i];

            }
            for (int i = max_length-1; i > 0; i--) {

                if (temp[i] <=-1) {
                    temp[i] = temp[i] + 10;
                    temp[i - 1] = temp[i - 1] - 1;
                }

            }
//            for(int i=0;i<max_length;i++){
//                System.out.println("temp  "+temp[i]);
//            }


        } else {
            max_length = n2;
            min_length= n1;
            temp = new int[max_length];

            int j;
            num3=new int[max_length];
            j=max_length-min_length;
            int k=0;
            for(int i=j;i<num3.length;i++) {
                num3[i]=num1[k];
                k=k+1;
            }

            for (int i = max_length-1; i >-1; i--) {

                temp[i] = num2[i] - num3[i];

            }
            for (int i = max_length-1; i > 0; i--) {

                if (temp[i] <=-1) {
                    temp[i] = temp[i] + 10;
                    temp[i - 1] = temp[i - 1] - 1;
                }

            }
            System.out.print("-");




        }

        toString();
        System.out.println();
    }
    public void multiply(){
        StringBuffer sb1 = new StringBuffer();
        for(int i = 0; i < n1; i++){
            sb1. append(num1[i]);
        }
        String newStr = sb1.toString();
        StringBuffer sb2 = new StringBuffer();
        for(int i = 0; i < n2; i++){
            sb2. append(num2[i]);
        }
        String newStr2 = sb2.toString();
//        System.out.println("newStr1 is "+newStr);
//        System.out.println("newStr2 is "+newStr2);
        char[] tempa = new StringBuffer(newStr).reverse().toString().toCharArray();
        char[] tempb = new StringBuffer(newStr2).reverse().toString().toCharArray();
        int lenA = tempa.length;
        int lenB = tempb.length;
        int len = lenA + lenB;
        int[] temp = new int[lenA+lenB];


        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                temp[i + j] += (int) (tempa[i] - '0') * (int) (tempb[j] - '0');
            }
        }

        for (int i = 0; i < n1+n2; i++) {
            if (temp[i] >=10) {
                temp[i + 1] += temp[i] / 10;
                temp[i] %= 10;
            }
        }
        StringBuffer sb = new StringBuffer();
        boolean flag = true;
        for (int i = len - 1; i >= 0; i--) {
            if (temp[i] == 0 && flag) {
                continue;
            } else {
                flag = false;
            }
            sb.append(temp[i]);
        }

        // 返回最终结果



        System.out.println(sb.toString());
//        for (int i = 0; i < n1+n2; i++) {
//           System.out.print(" temp is "+temp[i]);
//        }

//        toString();
//        System.out.println();
    }
    public void divide(){

        StringBuffer sb1 = new StringBuffer();
        for(int i = 0; i < n1; i++){
            sb1. append(num1[i]);
        }
        String newStr = sb1.toString();
//        System.out.println("num1 "+newStr);


        StringBuffer sb2 = new StringBuffer();
        for(int i = 0; i < n2; i++){
            sb2. append(num2[i]);
        }
        String newStr2 = sb2.toString();
//        System.out.println("num2 "+newStr2);

        BigInteger a = new BigInteger(newStr);
        BigInteger b = new BigInteger(newStr2);
        BigInteger c = a.divide(b);

        toString2(c.toString());



    }
    public void mod(){

        StringBuffer sb1 = new StringBuffer();
        for(int i = 0; i < n1; i++){
            sb1. append(num1[i]);
        }
        String newStr = sb1.toString();
//        System.out.println("num1 "+newStr);


        StringBuffer sb2 = new StringBuffer();
        for(int i = 0; i < n2; i++){
            sb2. append(num2[i]);
        }
        String newStr2 = sb2.toString();
//        System.out.println("num2 "+newStr2);

        BigInteger a = new BigInteger(newStr);
        BigInteger b = new BigInteger(newStr2);
        BigInteger c = a.remainder(b);

        toString2(c.toString());



    }
    public void mydivide(){
        if(n1>=n2){
            int tempa,tempb;
            StringBuffer sb1 = new StringBuffer();
            for(int i = 0; i < n1; i++){
                sb1. append(num1[i]);
            }
            String newStr = sb1.toString();
            tempa=Integer.parseInt(newStr);
            StringBuffer sb2 = new StringBuffer();
            for(int i = 0; i < n2; i++){
                sb2. append(num2[i]);
            }
            String newStr2 = sb2.toString();
            tempa=Integer.parseInt(newStr);

        }
    }
}
