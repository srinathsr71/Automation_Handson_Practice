package sep28;

public class interview1 {
    //int num;
    public void test5(int num){
        //int num;
        //System.out.println("enter number");
        if(num<0){
            System.out.println("number is negative");
        } else if (num>0) {
            System.out.println("number is postive");

        }else{
            System.out.println("number is not provided");
        }
    }

    public static void main(String[] args) {
        interview1 i=new interview1();
        //i.test5(-5);
        i.test5(6);
    }

}
