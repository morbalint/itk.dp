package hu.ppke.itk.dp.lab2.hw;

import java.util.ArrayList;
import java.util.List;

public class TopicSubject {

    private final List<TopicObserver> observerList = new ArrayList<>();

    public void send(String message) {
        for(TopicObserver o : observerList){
            o.update(message);
        }
    }

    public void subscribe(TopicObserver observer){
        observerList.add(observer);
    }

    public void detach(TopicObserver observer){
        observerList.remove(observer);
    }


}
