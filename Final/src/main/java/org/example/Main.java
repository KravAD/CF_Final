package org.example;
import Ejercicio_3.*;
import Ejercicio_5.*;
import java.time.LocalDate;
import java.util.*;

import static Ejercicio_3.CalcRecursiva.recursive;

public class Main {
    public static void main(String[] args) {
        int a = recursive(5,4 );
        System.out.println("El numero es: " + a);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter alias for user1:");
        String alias1 = scanner.nextLine();
        System.out.println("Enter email for user1:");
        String email1 = scanner.nextLine();
        UserAccount user1 = new UserAccount(alias1, email1);

        System.out.println("Enter alias for user2:");
        String alias2 = scanner.nextLine();
        System.out.println("Enter email for user2:");
        String email2 = scanner.nextLine();
        UserAccount user2 = new UserAccount(alias2, email2);

        user1.follow(user2);

        System.out.println("Enter tweet for user1:");
        String tweetMessage = scanner.nextLine();
        Tweet tweet1 = new Tweet(LocalDate.now(), tweetMessage, user1);
        user1.tweet(tweet1);

        System.out.println("Enter retweet for user2:");
        String retweetMessage = scanner.nextLine();
        Retweet retweet1 = new Retweet(LocalDate.now(), retweetMessage, user2, tweet1);
        user2.tweet(retweet1);
        System.out.println(retweet1.toString());

        System.out.println("Enter direct message from user1 to user2:");
        String directMessage = scanner.nextLine();
        DirectMessage dm1 = new DirectMessage(LocalDate.now(), directMessage, user1, user2);
        user1.sendDirectMessage(dm1);
        System.out.println(dm1.toString());

        List<UserAccount> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        System.out.println("Enter the alias of the user you want to display:");
        String displayAlias = scanner.nextLine();

        for (UserAccount user : users) {
            if (user.toString().contains(displayAlias)) {
                System.out.println(user);
            }
        }
    }
}