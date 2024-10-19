package byITacademyMPA.marathon.oct19;

public class Main {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        homePage.open();
        System.out.println(homePage.getTitle());
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.open();
        System.out.println(loginPage.getTitle());
    }
}
