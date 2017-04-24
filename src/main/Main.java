package main;

import core.CustomThreadEven;
import core.CustomThreadOdd;

/**
 * Created by pvmeira on 24/04/17.
 */
public class Main {

    public static void main(String[] args) {
        CustomThreadOdd odd = new CustomThreadOdd(100);
        CustomThreadEven even = new CustomThreadEven(100);
        odd.start();
        even.start();

    }
}
