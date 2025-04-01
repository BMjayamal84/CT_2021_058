package Q_04;

public class Bicycle {
    private Owner owner;

    public Bicycle() {
        // Ensure owner is initialized
        this.owner = new Owner("Unknown", "Unknown");
    }

    public Bicycle(String ownerName, String phoneNo) {
        // Initialize owner properly
        this.owner = new Owner(ownerName, phoneNo);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Method to set owner's details directly
    public void setOwnerDetails(String name, String phone) {
        if (this.owner == null) {
            this.owner = new Owner(name, phone);
        } else {
            this.owner.setOwnerName(name);
            this.owner.setPhoneNo(phone);
        }
    }
}
