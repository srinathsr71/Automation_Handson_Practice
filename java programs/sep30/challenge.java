package sep30;


import javax.sound.midi.Soundbank;

/*class ed{
        public int cal(int x,int y){
            int d=4;
            return x+y;
        }
    }
    class ed1 extends ed{
        public int cal_adv(int x,int y,int d){
            int sum=d+4;
            ed s=new ed();

            return x-y;
        }
    }*/
    /*class ed{
        int d=4;
        public int cal(int x,int y){
            return x+y;
        }
    }
    class ed1 extends ed{
        int sum=d+4;
        public int cal_adv(int x,int y){
            //ed s=new ed();
            return x-y;
        }
    }*/
    class ed{
      int d;
        public  int cal(int x,int y){
                  d=8;
                //System.out.println(d);
            return d;
        }
    }
    class ed1 extends ed{

        //int sum=d+4;
//      public  int cal(int d){
//          ed s=new ed();
//          //s.cal(d);
//          int su=s.d+4;
//     //     System.out.println(su);
//         return su;
//      }
        ed s=new ed();
        int se=s.d+4;

        //e.cal(d)
        //System.out.println(s.su)
        public int cal_adv(int x,int y){
            //int sum=d+4;
            return x-y;
        }
    }


public class challenge {
    public static void main(String[] args) {
        ed1 e=new ed1();
        //System.out.println(e.cal(5,2));
       //System.out.println(e.cal(5,4));
        System.out.println(e.se);
    }
}
