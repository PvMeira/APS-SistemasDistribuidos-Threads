package main;

import core.useOfRunnable.EvenRunnable;
import core.useOfRunnable.OddRunnable;
import core.useOfThread.CustomThreadEven;
import core.useOfThread.CustomThreadOdd;

/**
 * Created by pvmeira on 24/04/17.
 */
public class Main {

    public static void main(String[] args) {

        //Runnable
        OddRunnable or = new OddRunnable(100);
        EvenRunnable er = new EvenRunnable(100);

        //Threads
        CustomThreadOdd odd = new CustomThreadOdd(100);
        CustomThreadEven even = new CustomThreadEven(100);

        //Start of the Threads
        odd.start();
        even.start();

        //Start of the Threads using custom Runnable classs
        new Thread(or).start();
        new Thread(er).start();

    }
}
