import java.util.ArrayList;

public class AddressBook {
    private final ArrayList<BuddyInfo> buddies;

    public AddressBook() {
         buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        if (buddyInfo != null) {
            buddies.add(buddyInfo);
        }
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        buddies.remove(buddyInfo);
    }

    public ArrayList<BuddyInfo> getBuddies() {
        return buddies;
    }

    public void toPrint() {
        for  (BuddyInfo buddyInfo : buddies) {
            System.out.println(buddyInfo + "\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}

//Testing the GitHub editor
