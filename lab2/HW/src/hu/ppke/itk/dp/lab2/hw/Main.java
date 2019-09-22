package hu.ppke.itk.dp.lab2.hw;

public class Main {

    public static void main(String args[]){
        Dispatcher dispatcher = Dispatcher.getInstance();
        TopicObserver foo = new TopicObserver();
        dispatcher.subscribeToTopic("foo", foo);
        TopicObserver bar = new TopicObserver();
        dispatcher.subscribeToTopic("bar", bar);
        TopicObserver foobar = new TopicObserver();
        dispatcher.subscribeToTopic("foo", foobar);
        dispatcher.subscribeToTopic("bar", foobar);

        dispatcher.sendMessage("foo", "foooo");
        dispatcher.sendMessage("bar", "baaar");
        dispatcher.sendMessage("qq", "ff20");
        dispatcher.sendMessage("gg", "ez");
    }
}
