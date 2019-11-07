public class AwithY implements Doable {

    private final A a;
    private final Y y;

    public AwithY(A a){
        this.a = a;
        this.y = new Y();
    }
    public AwithY(A a, Y y){
        this.a = a;
        this.y = y;
    }
    public AwithY(Y y){
        this.a = new A();
        this.y = y;
    }
    public AwithY(){
        this.a = new A();
        this.y = new Y();
    }

    public void doIt() {
        a.doIt();
        y.doY();
    }
}