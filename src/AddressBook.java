import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> buddies = new ArrayList<>();

    public AddressBook() {
    }

    public void addBuddy() {
        buddies.add(new BuddyInfo());
    }

    public void removeBuddy(String name) {
        buddies.removeIf(buddy -> buddy.getName().equals(name));
    }

    public ArrayList<BuddyInfo> getBuddies() {
        return buddies;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}