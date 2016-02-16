package ui;

import java.util.Scanner;

public class PersonApp {

    public static void main(String[] args) {
        // display a welcome message
        Console.displayLine("Welcome to the Person Tester application");
        Console.displayLine();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            String type = Console.getString("Create customer or employee? (c/e): ");
            if (type.equalsIgnoreCase("c")){
                String firstName = Console.getString("Enter first name: ");
                String lastName = Console.getString("Enter last name: ");
                String email = Console.getString("Enter email address: ");
                String number = Console.getString("Customer number: ");
                Console.displayLine();
                Business.Customer customer = new Business.Customer();
                customer.setFirstName(firstName);
                customer.setlastName(lastName);
                customer.setEmail(email);
                customer.setNumber(number);
                Console.print (customer);
            } else if (type.equalsIgnoreCase("e")){
                String firstName = Console.getString("Enter first name: ");
                String lastName = Console.getString("Enter last name: ");
                String email = Console.getString("Enter email address: ");
                String social = Console.getString("Social security number: ");
                Console.displayLine();
                Business.Employee employee = new Business.Employee();
                employee.setFirstName(firstName);
                employee.setlastName(lastName);
                employee.setEmail(email);
                employee.setSocial(social);
                Console.print (employee);
            }
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();


        }
    }


}
