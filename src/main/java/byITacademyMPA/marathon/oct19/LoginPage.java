package byITacademyMPA.marathon.oct19;

public class LoginPage extends BasePage {
    protected String LOGIN_PAGE = BASE_URL + "/форма логина";
    String title = "Форма логина";

    public void open(){
        System.out.println("Пользователь открыл страницу " + LOGIN_PAGE);
    }

    public String getTitle(){
        return title;
    }
}
