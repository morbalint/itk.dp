package compositeEx2;

import java.util.stream.Stream;

public class Methods {
    public static String tab(int level){
        return Stream.generate(() -> "  ").limit(level).reduce((x, y) -> x + y).orElse("");
    }
}
