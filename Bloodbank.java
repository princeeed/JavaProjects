class Person {
    protected String name;
    protected int age;
    protected String contactNumber;

    
public Person(String name, int age, String contactNumber) {
        this.name = name;
        this.age = age;
        this.contactNumber = contactNumber;
    }

    
public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contactNumber);
    }
}


class Donor extends Person {
    private String bloodType;
    private int totalDonations;

    
public Donor(String name, int age, String contactNumber, String bloodType, int totalDonations) {
        super(name, age, contactNumber); 
        this.bloodType = bloodType;
        this.totalDonations = totalDonations;
    }


public void displayDonorInfo() {
        System.out.println("--- Donor Profile ---");
        super.displayPersonInfo(); 
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Total Donations: " + totalDonations);
    }
}


class Recipient extends Person {
    private String requiredBloodType;
    private String urgencyLevel;


public Recipient(String name, int age, String contactNumber, String requiredBloodType, String urgencyLevel) {
        super(name, age, contactNumber); 
        this.requiredBloodType = requiredBloodType;
        this.urgencyLevel = urgencyLevel;
    }


public void displayRecipientInfo() {
        System.out.println("--- Recipient Profile ---");
        super.displayPersonInfo(); 
        System.out.println("Required Blood Type: " + requiredBloodType);
        System.out.println("Urgency Level: " + urgencyLevel);
    }
}

public class Bloodbank {
    public static void main(String[] args) {
        System.out.println("=== Blood Bank Management System (Inheritance Demo) ===\n");

        Donor donor = new Donor("Ryuji Sakamoto", 19, "555-0192", "O+", 4);
        donor.displayDonorInfo();

        System.out.println();

        Recipient recipient = new Recipient("Chloe Elizabeth Price", 19, "555-8391", "O+", "Critical");
        recipient.displayRecipientInfo();
    }
}

