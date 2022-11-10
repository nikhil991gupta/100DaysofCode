package DAY31;
import java.lang.Thread;
 class even extends Thread
        {
            public void run()
         {
             for(int i=2;i<=20;)
             {
                 try {
                     sleep(1000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 System.out.println(i);
                 i=i+2;


             }
         }
        }
class odd extends Thread {
    @Override

    public void run() {
        try {


            for (int i = 1; i <= 20; ) {
               // sleep(1000);

                System.out.println(i);
                i = i + 2;

            }
        }catch (Exception e)
        {
            System.out.println("InterruptedException");

        }
    }
}


public class multithreadingg {
    public static void main(String[] args) {
        even t1=new even();
        odd t2=new odd();

        t1.setName("even");
        t2.setName("odd");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        //t1.start();
        //t2.start();
        System.out.println("name of thread t1 "+t1.getName());
        System.out.println("name of thread t2 "+t2.getName());

        System.out.println("even class priority "+t1.getPriority());
        System.out.println("odd class priority "+t2.getPriority());
        t1.start();

        t2.start();


    }
}
