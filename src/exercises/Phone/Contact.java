package exercises.Phone;

public class Contact {
    private String name;
    private int phonenumber;

    public Contact(String name, int phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }
    public String getName() {
        return name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public static Contact createContact(String name, int phoneNumber) {
        return new Contact(name, phoneNumber);
    }

}
