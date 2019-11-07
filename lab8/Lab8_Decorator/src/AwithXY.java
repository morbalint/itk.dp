public class AwithXY implements Doable {

    public static class Builder {

        private A a;
        private X x;
        private Y y;

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

        public AwithXY build() {
            if(a == null){
                a = new A();
            }
            if(x == null){
                x = new X();
            }
            if(y == null){
                y = new Y();
            }
            return new AwithXY(a,x,y);
        }
    }


    private final A a;
    private final X x;
    private final Y y;

    private AwithXY(A a, X x, Y y){
        this.a = a;
        this.x = x;
        this.y = y;
    }

    public void doIt() {
        a.doIt();
        x.doX();
        y.doY();
    }
}