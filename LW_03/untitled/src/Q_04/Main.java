package Q_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String phoneNo;
        Bicycle bicycle1 = new Bicycle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter owner name:");
        name = scanner.nextLine();
        System.out.println("Enter phone number:");
        phoneNo = scanner.nextLine();

        bicycle1.setOwnerDetails(name, phoneNo);

        System.out.println("Owner Name: " + bicycle1.getOwner().getOwnerName());
        System.out.println("Phone Number: " + bicycle1.getOwner().getPhoneNo());

    }
}
