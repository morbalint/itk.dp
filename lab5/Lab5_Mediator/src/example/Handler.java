package example;

public interface Handler<T extends Request> {

    void handle(T request);

}
