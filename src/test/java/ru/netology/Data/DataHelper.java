package ru.netology.Data;

import com.github.javafaker.Faker;
import lombok.Value;
import lombok.val;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        String login;
        String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo invalidPassword() {
        val faker = new Faker();
        return new AuthInfo("vasya", faker.internet().password());
    }

    @Value
    public static class VerificationCode {
        String verificationCode;
    }
}
