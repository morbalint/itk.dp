package hu.ppke.itk.dp.lab6.hw;

public class AccessDenied implements InternetAccess {
    @Override
    public void loadPage(String page) {
        System.out.println("access to " + page + " denied");
    }
}
