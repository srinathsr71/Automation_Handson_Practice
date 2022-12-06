package sep28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class trytest {
    public static void main(String[] args) throws IOException {
        int[] arr={2,4,5,5};
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int index=Integer.parseInt(br.readLine());
     try{
         System.out.println(arr[1]);
     }
     catch(ArithmeticException e){
         System.out.println(e);
     }
     catch(ArrayIndexOutOfBoundsException e){
         System.out.println(e);
     }
     catch(NullPointerException e){
         System.out.println(e);
     }

    }

    }

