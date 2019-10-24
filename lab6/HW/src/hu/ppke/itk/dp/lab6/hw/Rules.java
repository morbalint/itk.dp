package hu.ppke.itk.dp.lab6.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rules {

    private final List<String> denyList;

    public Rules() {
        denyList = new ArrayList<>();
    }

    protected Rules(List<String> denyList) {
        this.denyList = denyList;
    }

    public Rules createClone(){
        return new Rules(new ArrayList<>(this.denyList));
    }

    public void denySite(String site){
        denyList.add(site);
    }

    public void allowSite(String site){
        denyList.remove(site);
    }

    public boolean canAccessSite(String site){
        return denyList.stream().noneMatch(x -> x.equals(site));
    }
}
