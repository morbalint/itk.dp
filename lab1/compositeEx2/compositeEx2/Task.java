package compositeEx2;

public class Task extends ProjectItemGroup {
    private final String name;
    private final String details;
    private final Contact owner;
    private final double timeRequired;

    Task(String name, String Details, Contact owner, double timeRequired){

        this.name = name;
        details = Details;
        this.owner = owner;
        this.timeRequired = timeRequired;
    }

    @Override
    public double getTimeNeeded() {
        return timeRequired + super.getTimeNeeded();
    }

    @Override
    public String getDetails(int level) {
        return Methods.tab(level) + "task " + this.name + "\n" + super.getDetails(level + 1);
    }
}
