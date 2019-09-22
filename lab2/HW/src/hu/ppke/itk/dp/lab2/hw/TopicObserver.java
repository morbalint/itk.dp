package hu.ppke.itk.dp.lab2.hw;

public class TopicObserver {

    public void update(String message){
        System.out.println("observer " +  this + " received message: " + message);
    }
}
