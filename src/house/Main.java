package house;

    public class Main {
        public static void main(String[] args) {
            // Creating a new Human object
            Human person = new Human("My secret", "Latest news", "Exciting experience", "Juicy gossip");

            // Accessing and printing the values using the getter methods
            System.out.println("Secret: " + person.getSecret());
            System.out.println("News: " + person.getNews());
            System.out.println("Experience: " + person.getExperience());
            System.out.println("Gossip: " + person.getGossip());
        }
    }


