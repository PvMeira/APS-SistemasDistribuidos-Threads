package core.useOfRunnable;

import core.useOfThread.CustomThreadEven;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by pvmeira on 25/04/17.
 */
public class EvenRunnable implements Runnable {
    private int total;

    public EvenRunnable(int total) {
        this.total = total;

    }

    @Override
    public void run() {
        for (int i = 0; i < total; i++) {
            if (i % 2 == 0) {
                System.out.print("Par : " + i + "\n");

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(CustomThreadEven.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
