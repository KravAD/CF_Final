package Ejercicio_5;

import java.time.LocalDate;

public class DirectMessage extends Tweet {
    private UserAccount receiver;

    public DirectMessage(LocalDate time, String message, UserAccount sender, UserAccount receiver) {
        super(time, message, sender);
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "DirectMessage{" +
                "receiver=" + receiver +
                ", time=" + time +
                ", message='" + message + '\'' +
                ", sender=" + sender +
                '}';
    }
}
