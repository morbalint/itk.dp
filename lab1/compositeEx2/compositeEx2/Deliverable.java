package compositeEx2;

import java.util.ArrayList;

public class Deliverable implements ProjectItem {
    private final String name;
    private final String description;
    private final Contact owner;
    private final ArrayList<ProjectItem> tasks = new ArrayList<>();

    Deliverable(String name, String description, Contact owner){

        this.name = name;
        this.description = description;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Contact getOwner() {
        return owner;
    }

    public double getTimeNeeded() {
        return 0;
    }

    @Override
    public String getDetails(int level) {
        return Methods.tab(level) + "deliverable: " + this.name + "\n";
    }
}
