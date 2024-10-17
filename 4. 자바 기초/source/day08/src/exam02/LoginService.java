package exam02;

public class LoginService {

    public void process(String userId, String password) {
        try {
            // userId - user01, password - 1234
            if (!userId.equals("user01")) { // user01과 불일치
                throw new UserIdValidationException();
            }

            if (!password.equals("1234")) { // 비번이 1234와 불일치
                throw new PasswordValidationException();
            }
        } catch (UserIdValidationException e) {

        } catch (PasswordValidationException e) {

        }
    }
}
