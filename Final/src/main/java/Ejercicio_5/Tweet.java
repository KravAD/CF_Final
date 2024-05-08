package Ejercicio_5;

import java.time.LocalDate;

public class Tweet {
    protected LocalDate time;
    protected String message;
    protected UserAccount user;

    public Tweet(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
