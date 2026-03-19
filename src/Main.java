import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main{


public static void displayEmployeeDetails (Scanner input){
    String fileName = "resources/MotorPH_Employee Data - Employee Details.csv";
            String line;
            boolean employeeFound = false;

            // Ask user to enter employee number
            System.out.print("Enter Employee Number: ");
            String searchEmployeeNumber = input.nextLine();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));

                // Skip header row
                reader.readLine();

                while ((line = reader.readLine()) != null) {

                    // Split the CSV line by comma
                    String[] data = line.split(",");

                    String employeeNumber = data[0];

                    // Check if employee number matches user input
                    if (employeeNumber.equals(searchEmployeeNumber)) {

                        String lastName = data[1];
                        String firstName = data[2];
                        String birthday = data[3];

                        System.out.println("\nEMPLOYEE DETAILS");
                        System.out.println("----------------------------");
                        System.out.println("Employee Number : " + employeeNumber);
                        System.out.println("First Name      : " + firstName);
                        System.out.println("Last Name       : " + lastName);
                        System.out.println("Birthday        : " + birthday);
                        System.out.println("----------------------------");

                        employeeFound = true;
                        break;
                    }
                }

                reader.close();

                // If employee was not found
                if (!employeeFound) {
                    System.out.println("\nEmployee number not found or does not exist.");
                }

            } catch (IOException e) {
                System.out.println("Error reading the file.");
            }

            input.close();

        }
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
            System.out.println("MotorPH Payroll System");
            System.out.println("===========================");
            System.out.println("1 - Payroll Staff");
            System.out.println("2 - Employee");
            System.out.println("3 - Exit");
            
          int choice = input.nextInt();

            if (choice == 1){
                System.out.println("Welcome, Payroll Staff.");
                System.exit(0);

            }
            else if (choice == 2){
                System.out.println("Welcome! Please enter your Employee ID");
                System.exit(0);
            }
            if (choice == 3){
                System.out.println("Exiting MotorPH Payroll System. Thank you!");
                System.exit(0);
            }
            else{
                    System.out.println("Invalid Selection");
            }
        
    }

