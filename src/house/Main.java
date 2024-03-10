package house;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("My secret", "Latest news", "Years of experience", "Interesting gossip");

        System.out.println("Secret: " + human.getSecret());
        System.out.println("News: " + human.getNews());
        System.out.println("Experience: " + human.getExperience());
        System.out.println("Gossip: " + human.getGossip());
    }
}


