package ui;

import java.util.Scanner;

public class PersonApp {

    public static void print ( Person person){
        System.out.println( person.getDisplayText());
    }

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Person Tester application");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            System.out.print("Create customer or employee? (c/e): ");
            String type = sc.nextLine();
            if (type.equalsIgnoreCase("c")){
                System.out.print("Enter first name: ");
                String firstName = sc.nextLine();
                System.out.print("Enter last name: ");
                String lastName = sc.nextLine();
                System.out.print("Enter email address: ");
                String email = sc.nextLine();
                System.out.print("Customer number: ");
                String number = sc.nextLine();
                System.out.println();
                System.out.print("You entered: " + "\n");
                Customer customer = new Customer();
                customer.setFirstName(firstName);
                customer.setlastName(lastName);
                customer.setEmail(email);
                customer.setNumber(number);
                print (customer);
            } else if (type.equalsIgnoreCase("e")){
                System.out.print("Enter first name: ");
                String firstName = sc.nextLine();
                System.out.print("Enter last name: ");
                String lastName = sc.nextLine();
                System.out.print("Enter email address: ");
                String email = sc.nextLine();
                System.out.print("Social security number: ");
                String social = sc.nextLine();
                String number = sc.nextLine();
                System.out.println();
                System.out.print("You entered: " + "\n");
                Employee employee = new Employee();
                employee.setFirstName(firstName);
                employee.setlastName(lastName);
                employee.setEmail(email);
                employee.setSocial(social);
                print (employee);
            }

            System.out.println("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();


        }
    }



}
