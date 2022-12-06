package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class tt {
    public static void ss(String s1,String s2){
        System.out.println(s1+s2);
    }
    public static void main(String[] args) throws IOException {
//        for (int i = 1; i < 100; i++) {
//            System.out.println(i);
//            i++;
//        }
        String s1 = "",s2="";
        tt s=new tt();
    //    Scanner sc = new Scanner(System.in);

        System.out.println("enter any string");
       Scanner sc=new Scanner(System.in);//int float,double,string next,hasnext,valueof,nextLine
        //parseInt,readLIne()
        //String s1=sc.nextLine();
        //String s2=sc.nextLine();
        if(sc.hasNext("[A-Za-z]*"))//checks the user input given is string or not
        {
            s1 = sc.next();//it will check the given string
            s2=sc.next();
            System.out.println(s1+s2);
            //System.out.println("You entered a string value "+str);
        }else {
            System.out.println("Please Enter a Valid Value");
        }
        s.ss(s1,s2);
        }
    }

