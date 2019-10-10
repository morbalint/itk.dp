package example;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Mediator {


    private Map<String, Object> handlers = new TreeMap<>(); // Why the f... is class not comparable ?? Does it lacks a getHash method ?

    // normally the handler would be a factory or builder method creating a new handler for each request;
    public <T extends Request> void register(Class c, Handler<T> handler){
        // how to write `typeof(T)` in Java ??
        handlers.put(c.getCanonicalName(), handler);
    }

    public <T extends Request> void dispatch(T request){
        String c = request.getClass().getCanonicalName();
        if(handlers.containsKey(c)){
            Handler<T> handler = (Handler<T>) handlers.get(c);
            handler.handle(request);
        }
        else {
            // or use whatever error handling you prefer
            throw new NoSuchElementException();
        }
    }

}
