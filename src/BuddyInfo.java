public class BuddyInfo {
    private final String name;
    private final String address;
    private final String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "742 Evergreen Terrace", "555-7246");
        System.out.println("Hello " + buddyInfo.getName());
        System.out.println("Address: " + buddyInfo.getAddress());
        System.out.println("Phone Number: " + buddyInfo.getPhoneNumber());
    }
}