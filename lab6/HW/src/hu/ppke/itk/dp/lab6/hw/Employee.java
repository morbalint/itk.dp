package hu.ppke.itk.dp.lab6.hw;

public class Employee {

    private String name;

    private EmployeeType type;

    private final Rules rules;

    public Employee(String name, EmployeeType type) {
        this.name = name;
        this.type = type;
        this.rules = DefaultRuleSet.getInstance().getRuleForEmployeeType(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public Rules getRules() {
        return rules;
    }
}
