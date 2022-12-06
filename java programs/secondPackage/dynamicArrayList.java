package secondPackage;

import java.util.ArrayList;
import java.util.logging.SocketHandler;

public class dynamicArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(3);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(9);
        al.add(10);
        //al.add(0,2);
        al.add(20);
        System.out.println(al);
    }
}
