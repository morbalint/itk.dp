package hu.ppke.itk.dp.lab10.hw;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    try {
            Intersection intersection = new Intersection();
            intersection.start();
            Thread.sleep(5000);
            for (int i = 1; i < 21; i++){
                new Car(intersection).start();
                Thread.sleep(10000 / i);
            }
        } catch (Exception ex){
	        System.out.println("stopped " + ex.getMessage());
	        return; // fck java
        }
    }
}
