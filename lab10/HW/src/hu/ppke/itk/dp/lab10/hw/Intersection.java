package hu.ppke.itk.dp.lab10.hw;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Intersection extends Thread {

    private boolean isGreen = true;
    private boolean isEmpty = true;
    private final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    @Override
    public void run() {
        try {
            while (true) {
                log("switching to green");
                isGreen = true;
                sleep(2500);
                log("switching to red");
                isGreen = false;
                synchronized (this){
                    sleep(2500);
                }
            }
        }
        catch (Exception ex) {
            System.out.println("fatal error");
            return; // fck java
        }
    }

    public boolean enter() {
        synchronized (this) {
            if(isEmpty && isGreen) {
                isEmpty = false;
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void leave() {
        this.isEmpty = true;
    }

    private void log(String message){
        System.out.println(sdf.format(new Date()) + ": " + message);
        System.out.flush();
    }

}
