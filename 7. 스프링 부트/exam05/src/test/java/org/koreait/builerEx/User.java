package org.koreait.builerEx;

public class User {
    private String email;
    private String password;
    private String name;

    private User() {}

    public static Builder builder() {
        return new Builder();
    }

    static class Builder { // User 클래스 객체를 생성하고 조립
        private User instance = new User();

        public Builder email(String email) {
            instance.email = email;

            return this;
        }

        public Builder password(String password) {
            instance.password = password;

            return this;
        }

        public Builder name(String name) {
            instance.name = name;

            return this;
        }

        public User build() {
            return instance;
        }
    }
}
