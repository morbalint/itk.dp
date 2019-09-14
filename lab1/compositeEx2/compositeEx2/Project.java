package compositeEx2;

public class Project extends ProjectItemGroup {
    private final String name;
    private final String description;

    Project(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getDetails(int level) {
        return Methods.tab(level) + "project " + this.name + "\n" + super.getDetails(level + 1);
    }

}
