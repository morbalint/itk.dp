public class AwithXYZ implements Doable {

    public static class Builder {

        private A a;
        private X x;
        private Y y;
        private Z z;

        public Builder setA(A a) {
            this.a = a;
            return this;
        }

        public Builder setX(X x) {
            this.x = x;
            return this;
        }

        public Builder setY(Y y){
            this.y = y;
            return this;
        }

        public Builder setZ(Z z){
            this.z = z;
            return this;
        }

        public AwithXYZ build() {
            if(a == null){
                a = new A();
            }
            if(x == null){
                x = new X();
            }
            if(y == null){
                y = new Y();
            }
            if(z == null){
                z = new Z();
            }
            return new AwithXYZ(a,x,y,z);
        }
    }


    private final A a;
    private final X x;
    private final Y y;
    private final Z z;

    private AwithXYZ(A a, X x, Y y, Z z){
        this.a = a;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void doIt() {
        a.doIt();
        x.doX();
        y.doY();
        z.doZ();
    }
}