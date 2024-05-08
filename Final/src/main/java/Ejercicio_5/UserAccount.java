package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String alias;
    private String email;
    private List<UserAccount> following;
    private List<UserAccount> followers;
    private List<Tweet> tweets;
    private List<Tweet> timeline;

    public UserAccount(String alias, String email) {
        if (!Verificador.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email");
        }
        if (!Verificador.isValidAlias(alias)) {
            throw new IllegalArgumentException("Invalid alias");
        }
        this.alias = alias;
        this.email = email;
        this.following = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.tweets = new ArrayList<>();
        this.timeline = new ArrayList<>();
    }

    public void follow(UserAccount user) {
        if (!following.contains(user)) {
            following.add(user);
            user.followers.add(this);
        }
    }

    public void tweet(Tweet tweet) {
        tweets.add(tweet);
        for (UserAccount follower : followers) {
            follower.timeline.add(tweet);
        }
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "alias='" + alias + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void sendDirectMessage(DirectMessage dm) {
    }
}