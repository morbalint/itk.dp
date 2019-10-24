package hu.ppke.itk.dp.lab6.hw;

import java.util.Map;
import java.util.HashMap;

public class DefaultRuleSet {

    private final Map<EmployeeType, Rules> rulesMap = new HashMap();

    protected DefaultRuleSet() {
        rulesMap.put(EmployeeType.Boss, new Rules());
        rulesMap.put(EmployeeType.Manager, new Rules());
        rulesMap.put(EmployeeType.BottomFeeder, new Rules());
    }

    private static DefaultRuleSet instance;

    public static DefaultRuleSet getInstance(){
        if(instance == null){
            instance = new DefaultRuleSet();
        }
        return instance;
    }

    public Rules getRuleForEmployeeType(EmployeeType type){
        return this.rulesMap.get(type).createClone();
    }

    public void DefaultAllowSiteForEmployeeType(EmployeeType type, String site){
        this.rulesMap.get(type).allowSite(site);
    }

    public void DefaultDenySiteForEmployeeType(EmployeeType type, String site){
        this.rulesMap.get(type).denySite(site);
    }

}
