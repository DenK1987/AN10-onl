package lesson10.Homework_Part3;

public class WorkingWithData {
    private static final int LOGIN_MAX_LENGTH = 20;
    private static final char LOGIN_EXCLUDE_SPACES = ' ';

    public static void login(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!checkLogin(login)) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов и не должен содержать пробелы");
        }
        if (!checkPassword(password)) {
            throw new WrongPasswordException("Пароль должен быть меньше 20 символов, не должен содержать пробелы и должен содержать хотя бы одну цифру");
        }
        if (!checkConfirmPassword(password, confirmPassword)) {
            throw new WrongPasswordException("Пароль не подтвержден");
        }

    }

    private static boolean checkLogin(String login) {
        int length = login.length();
        return length > 0 && length < LOGIN_MAX_LENGTH && login.indexOf(LOGIN_EXCLUDE_SPACES) == -1;
    }

    private static boolean checkPassword(String password) {
        return checkLogin(password) && password.matches(".*\\d.*");
    }

    private static boolean checkConfirmPassword(String password, String confirmPassword) {
        return checkLogin(password) && password.matches(".*\\d.*") && password.equals(confirmPassword);
    }

}



