package nullObject;

public class DefaultPerson implements IPeople {
    @Override
    public String print() {
        return "404 not found";
    }

    private static DefaultPerson instance;

    public static DefaultPerson getInstance(){
        if(instance == null){
            instance = new DefaultPerson();
        }
        return instance;
    }
}
