package compositeEx2;

import java.util.stream.Stream;

public interface ProjectItem {
    double getTimeNeeded();
    // So this is how you define an optional parameter... It looks ugly af.
    default String getDetails()
    {
        return getDetails(0);
    }
    String getDetails(int level);
}
