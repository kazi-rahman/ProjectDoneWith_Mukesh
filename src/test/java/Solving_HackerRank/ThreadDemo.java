package Solving_HackerRank;

public class ThreadDemo {

/*
* Multi-threaded: A flow of execution is known as a Thread.
* JVM creates a thread which is called the main thread.
* The user can create multiple threads by extending the thread class
* or by implementing the Runnable interface.

*/
public static void main (String [] args)
    {
        MyThread mt = new MyThread ();
        mt.start ();
        for (int i = 0; i < 50; i++)
            System.out.println ("i = " + i + ", i * i = " + i * i);
    }
}

class MyThread extends Thread
{
    public void run ()
    {
        for (int count = 1, row = 1; row < 20; row++, count++)
        {
            for (int i = 0; i < count; i++)
                System.out.print ('*');
            System.out.print ('\n');
        }
    }


}
