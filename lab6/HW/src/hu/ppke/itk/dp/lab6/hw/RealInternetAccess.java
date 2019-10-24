package hu.ppke.itk.dp.lab6.hw;

public class RealInternetAccess implements InternetAccess {
    @Override
    public void loadPage(String page) {
        System.out.println(page + " loaded");
    }
}
