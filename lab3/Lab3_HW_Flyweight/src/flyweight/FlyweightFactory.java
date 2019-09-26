package flyweight;

import java.util.*;

public class FlyweightFactory {

    private final Map<Integer, PixelFlyweight> pixels = new TreeMap<>();

    public PixelFlyweight createFlyweight(int row) {
        if (pixels.containsKey(row)) {
            return  pixels.get(row);
        }
        PixelFlyweight rtn = new PixelFlyweight(row);
        pixels.put(row, rtn);
        return rtn;
    }

}
