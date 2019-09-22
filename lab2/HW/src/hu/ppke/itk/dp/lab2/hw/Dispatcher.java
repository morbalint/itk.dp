package hu.ppke.itk.dp.lab2.hw;

import javax.security.auth.Subject;
import java.util.Map;
import java.util.TreeMap;

public class Dispatcher {

    protected final Map<String, TopicSubject> topics = new TreeMap<>();

    protected Dispatcher() {

    }

    private static Dispatcher instance;

    public static Dispatcher getInstance(){
        if(instance == null){
            instance = new Dispatcher();
        }
        return instance;
    }

    public void sendMessage(String topic, String message) {
        TopicSubject subject = getSubject(topic);
        subject.send(message);
    }

    public void subscribeToTopic(String topic, TopicObserver observer){
        TopicSubject subject = getSubject(topic);
        subject.subscribe(observer);
    }

    private TopicSubject getSubject(String topic){
        TopicSubject subject = topics.getOrDefault(topic, null);
        if(subject == null) {
            subject = new TopicSubject();
            topics.put(topic, subject);
        }
        return subject;
    }

}
