package house;

public class Human {
    private String secret;
    private String news;
    private String experience;
    private String gossip;

    public Human(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }

    public String getSecret() {
        return secret;
    }

    String getNews() {
        return news;
    }

    protected String getExperience() {
        return experience;
    }

     String getGossip() {
        return gossip;
    }
}