package compositeEx2;

import java.util.ArrayList;
import java.util.stream.Stream;

public abstract class ProjectItemGroup implements ProjectItem {
    protected final ArrayList<ProjectItem> items = new ArrayList<>();

    public void addProjectItem(ProjectItem item){
        items.add(item);
    }

    @Override
    public double getTimeNeeded() {
        return items
                .stream()
                .map(x -> x.getTimeNeeded())
                .reduce((x,y) -> x + y)
                .orElse(0.0);
    }

    public String getDetails(int level){
        return items.stream().map(x -> x.getDetails(level)).reduce((x, y) -> x + y).orElse("");
    }
}
