package hu.ppke.itk.dp.lab10.hw;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car extends Thread {

    private final long id;
    private final Intersection intersection;
    private final DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public Car(Intersection intersection) {
        id = (long)(Math.random()*Long.MAX_VALUE);
        this.intersection = intersection;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void run() {
        try {
            log("drive to intersection");
            sleep(3000);
            while(!intersection.enter());
            log("entering intersection");
            sleep(1000);
            intersection.leave();
            log("driving away");
        }
        catch (Exception ex){
            log("crash");
            return; // fck java
        }
    }

    private void log(String message) {
        System.out.println(sdf.format(new Date()) + ": " + id+" "+message);
        System.out.flush();
    }
}
