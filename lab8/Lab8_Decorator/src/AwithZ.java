public class AwithZ implements Doable {

    private final A a;
    private final Z z;

    public AwithZ(A a){
        this.a = a;
        this.z = new Z();
    }
    public AwithZ(A a, Z z){
        this.a = a;
        this.z = z;
    }
    public AwithZ(Z z){
        this.a = new A();
        this.z = z;
    }
    public AwithZ(){
        this.a = new A();
        this.z = new Z();
    }

    public void doIt() {
        a.doIt();
        z.doZ();
    }
}