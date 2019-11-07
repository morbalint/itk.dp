public class Main {
    public static void main(String[] args) {
        Doable[] array = {new AwithX(), new AwithXY.Builder().build(), new AwithXYZ.Builder().build()};
        for (Doable a : array) {
            a.doIt();
            System.out.print("  ");
        }
    }
}
