package sep30;
class tr{
    private int id;private String name;String regex="^[a-zA-Z]+$"; String sr ="[a-zA-Z0-9]{6}";//srin21
    String a="^[0-9]+$";//values only
//    public void setName(String str){
//        if(str.matches(regex)){
//            name=str;
//            System.out.println("correct name is " +name);
//        }else{
//            System.out.println("name is not correct");
//        }
//    }
public void setName(String s){
    String h=Integer.toString(id);
    if(s.matches(a)){
        h=s;
        System.out.println("correct name is " +h);
    }else{
        System.out.println("id is not correct");
    }
}
}
public class regularExpTask {
    public static void main(String[] args) {
        tr t=new tr();
        t.setName("1234");
    }
}
