package house;

public class Human {
    private final String secret;
    private final String news;
    private final String experience;
    private final String gossip;

    public Human(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }

    String getSecret() {
        return secret;
    }

    String getNews() {
        return news;
    }

    String getExperience() {
        return experience;
    }

    String getGossip() {
        return gossip;
    }
}