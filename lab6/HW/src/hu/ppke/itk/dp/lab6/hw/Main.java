package hu.ppke.itk.dp.lab6.hw;

public class Main {

    public static void main(String[] args) {

        DefaultRuleSet defaults = DefaultRuleSet.getInstance();
        defaults.DefaultDenySiteForEmployeeType(EmployeeType.Manager, "facebook");
        defaults.DefaultDenySiteForEmployeeType(EmployeeType.BottomFeeder, "facebook");
        defaults.DefaultDenySiteForEmployeeType(EmployeeType.BottomFeeder, "youtube");

        Employee  cpt = new Employee("Captain Jack Sparrow", EmployeeType.Boss);
        Employee  gibbs = new Employee("Gibbs", EmployeeType.Manager);
        Employee  sailor = new Employee("Turner", EmployeeType.BottomFeeder);

        InternetAccess cptProxy = new InternetProxy(cpt.getRules());
        cptProxy.loadPage("imdb");
        cpt.getRules().denySite("imdb");
        cptProxy.loadPage("imdb");
        cpt.getRules().allowSite("imdb");
        cptProxy.loadPage("imdb");

        InternetAccess officerProxy = new InternetProxy(gibbs.getRules());
        officerProxy.loadPage("youtube");
        officerProxy.loadPage("facebook");
        officerProxy.loadPage("google");

        InternetAccess sailorProxy = new InternetProxy(sailor.getRules());
        sailorProxy.loadPage("youtube");
        sailorProxy.loadPage("facebook");
        sailorProxy.loadPage("stackoverflow");

    }
}
