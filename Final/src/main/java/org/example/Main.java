package org.example;
import Ejercicio_3.*;
import Ejercicio_5.*;
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
        Tweet tweet1 = new Tweet(tweetMessage);
        user1.tweet(tweet1);

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