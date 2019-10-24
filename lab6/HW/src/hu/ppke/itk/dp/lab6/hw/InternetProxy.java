
package hu.ppke.itk.dp.lab6.hw;

public class InternetProxy implements InternetAccess {

    private final Rules rules;
    private final InternetAccess deny = new AccessDenied(); // this should be received through DI
    private final InternetAccess allow = new RealInternetAccess(); // same

    public InternetProxy(Rules rules) {
        this.rules = rules;
    }


    @Override
    public void loadPage(String site) {
        this.getProxy(site).loadPage(site);
    }

    private InternetAccess getProxy(String site){
        if(rules.canAccessSite(site)){
            return allow;
        }
        else{
            return deny;
        }
    }
}
