package core.useOfThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by pvmeira on 24/04/17.
 */
public class CustomThreadOdd extends Thread {
    private int total;

    public CustomThreadOdd(int totalValue) {
        total = totalValue;
    }

    @Override
    public void run() {
        for (int i = 0; i < total; i++) {
            if (i % 2 != 0) {
                System.out.print("Impar : " + i+"\n");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(CustomThreadOdd.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
