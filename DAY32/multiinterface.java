package DAY32;

import java.lang.Thread;
class even implements Runnable
{
    public void run()
    {
        for(int i=2;i<=20;)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
            i=i+2;


        }
    }
}
class odd  implements Runnable {
    @Override

    public void run() {
        try {


            for (int i = 1; i <= 20; ) {
                //Thread.sleep(1000);

                System.out.println(i);
                i = i + 2;

            }
        }catch (Exception e)
        {
            System.out.println("InterruptedException");

        }
    }
}


public class multiinterface {
    public static void main(String[] args) {
        even ob1=new even();
        odd ob2=new odd();
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);


        t1.setName("even");
        t2.setName("odd");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        System.out.println("even priority"+t1.getPriority());
        System.out.println("odd priority"+t2.getPriority());
        System.out.println("thread t1 name"+t1.getName());
        System.out.println("thread t2 name"+t2.getName());

    }
}

