import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        String login = "login";
        String password = "password";
        String confirmPassword = "password";
        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Готово!");
        }

    }
}