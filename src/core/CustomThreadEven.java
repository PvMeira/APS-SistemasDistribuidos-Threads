package core;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by pvmeira on 24/04/17.
 */
public class CustomThreadEven extends Thread {
    private int total;

    public CustomThreadEven(int totalValue) {
        total = totalValue;
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
