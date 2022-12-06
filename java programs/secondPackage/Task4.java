package secondPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task4 {
    public static void test1(int num){
        if(num%2 == 0){
            System.out.println("num is even");
        }else if(num%2==1){
            System.out.println("num is odd");
        }else{
            System.out.println("entered number is wrong");
        }
    }
    public static void test2(int num1,int num2){
        if(num1>num2){
            System.out.println(num1+num2);
        }
        else{
            System.out.println(num1*num2);
        }
    }
    public static void test3(int num3,int num4){
        System.out.println(num3+num4);
        System.out.println(num3-num4);
        System.out.println(num3*num4);
        System.out.println(num3/num4);

    }
    public static void test4(String s1,String s2){
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.length());
        System.out.println(s1+" "+s2);
        System.out.println(s1.replace('r','s'));
        System.out.println(s1.equals(s2));
    }
    public static void test5(int value,int val,int pattern){
        for(int i=1;i<value;i++){
            System.out.print(i+1 + " ");//print the even numbers from 1 to 100.
            i++;
        }
        System.out.println();
        for(int j=1;j<val;j++){
            System.out.print(j+ " ");//print the odd numbers from 1 to 100.
            j++;
        }
        System.out.println();
        //printing Hill pattern
        for(int m=1;m<=pattern;m++){
            for(int n=m;n<=pattern;n++){
                System.out.print(" ");
            }
            for(int n=1;n<m;n++){
                System.out.print("*");
            }
            for(int n=1;n<=m;n++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void test6(int[] arr,String[] s3){
        System.out.println(arr.length);
        for(int at=0;at<arr.length;at++){
            System.out.println(arr[at]);
        }
        System.out.println(s3.length);
        for(int av=0;av<s3.length;av++){
            System.out.println(s3[av]);
        }
    }

    public static void main(String[] args) throws IOException {
        //String s1,s2;
        int[] arr={23,26,78,45,67,89,6999};
        String[] s3={"srinath","sainath","shankar","madhu","kiran"};
        Task3 tas=new Task3();
        tas.test6(arr,s3);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any number to check even or odd");
        int num=Integer.parseInt(br.readLine());
        tas.test1(num);
        System.out.println("enter any two numbers to perform addition or multiplication");
        int num1=Integer.parseInt(br.readLine());
        int num2=Integer.parseInt(br.readLine());
        tas.test2(num1,num2);
        System.out.println("enter any two numbers to perform arithametic operations");
        int num3=Integer.parseInt(br.readLine());
        int num4=Integer.parseInt(br.readLine());
        tas.test3(num3,num4);
        System.out.println("enter any value,val,pattern to print even and odd and hill pattern");
        int value=Integer.parseInt(br.readLine());
//        System.out.println("enter any val");
        int val=Integer.parseInt(br.readLine());
  //      System.out.println("enter any pattern");
        int pattern=Integer.parseInt(br.readLine());
        //int arr[]=Integer.parseInt(br.readLine());
        tas.test5(value,val,pattern);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings to perform string methods");
        //String s1=sc.nextLine();
        //String s2=sc.nextLine();
        //Scanner sc=new Scanner(System.in);
        String s1="";String s2="";
        if(sc.hasNext("[A-Za-z]*"))// 23 srinath 23 srinath
        {
           s1 = sc.next();
           //s2 = sc.next();
            //System.out.println("You entered a string value "+s1);
        }else {
            System.out.println("Please Enter a Valid Value");
        }
        tas.test4(s1,s2);

    }
}
