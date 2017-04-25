package core.useOfRunnable;

import core.useOfThread.CustomThreadOdd;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by pvmeira on 25/04/17.
 */
public class OddRunnable implements Runnable {
    private int total;

    public OddRunnable(int total) {
        this.total = total;

    }

    @Override
    public void run() {
        for (int i = 0; i < total; i++) {
            if (i % 2 != 0) {
                System.out.print("Impar : " + i + "\n");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(CustomThreadOdd.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
