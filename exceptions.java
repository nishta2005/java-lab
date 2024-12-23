// Custom exception class for WrongAge
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

// Base class: Father
class Father {
    int fatherAge;

    // Constructor of Father class
    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        this.fatherAge = age;
        System.out.println("Father's age is: " + this.fatherAge);
    }
}

// Derived class: Son
class Son extends Father {
    int sonAge;

    // Constructor of Son class
    public Son(int fatherAge, int sonAge) throws WrongAge {
        // Call the constructor of Father class
        super(fatherAge);

        if (sonAge < 0) {
            throw new WrongAge("Son's age cannot be negative.");
        }

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age.");
        }

        this.sonAge = sonAge;
        System.out.println("Son's age is: " + this.sonAge);
    }
}

// Main class to demonstrate exception handling
public class Main {
    public static void main(String[] args) {
        try {
            // Example 1: Invalid father age
            Son son1 = new Son(-10, 5);  // This will throw a WrongAge exception for Father's age.

        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Example 2: Son's age is greater than or equal to Father's age
            Son son2 = new Son(30, 30);  // This will throw a WrongAge exception for Son's age.
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Example 3: Valid case
            Son son3 = new Son(40, 20);  // This will work fine.
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
