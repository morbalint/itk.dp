public class AwithX implements Doable {

    private A a;
    private X x;

    public AwithX(A a){
        this.a = a;
    }
    public AwithX(A a, X x){
        this.a = a;
        this.x = x;
    }
    public AwithX(X x){
        this.a = new A();
        this.x = x;
    }
    public AwithX(){
        this.a = new A();
        this.x = new X();
    }

    public void doIt() {
        a.doIt();
        x.doX();
    }
}