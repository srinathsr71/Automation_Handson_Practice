package conditionPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conditionMovie {
    public static void main(String[] args) throws IOException {
        int ticket;
        System.out.println("enter the price");
        BufferedReader brd=new BufferedReader(new InputStreamReader(System.in));
        ticket=Integer.parseInt(brd.readLine());
        //b=Integer.parseInt(brd.readLine());
        if (ticket>200){       // >=, <=
            System.out.println(" Don't go to movie");
        }
        else if (ticket<100){
            System.out.println("go to movie");
        }
        else if(ticket>=150 && ticket<=200){
            System.out.println("go to movie");
        }
        else if(ticket<=180 && ticket>=190)
        {
            System.out.println();
        }
        else {
            System.out.println("not equal");
        }
    }
}
