import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //WEIGHT CONVERSION PROGRAM
        //Welcome message
        System.out.println("||Weight Conversion Program||");

        Scanner scanner = new Scanner(System.in);

        double weight, newWeight;
        char choice;
        boolean validChoice;

        do {
            validChoice = true;

            System.out.println("1 - Convert lbs to kgs");
            System.out.println("2 - Convert kgs to lbs");

            //Prompt for user input
            System.out.print("Select an option(1 or 2): ");
            choice = scanner.next().charAt(0);

            if (choice == '1') {
                System.out.print("Enter weight in lbs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 0.453592;
                System.out.printf("Weight in kgs: %.1fKg%n", newWeight);
            }
            else if (choice == '2') {
                System.out.print("Enter weight in kgs: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.printf("Weight in lbs: %.1fLbs%n", newWeight);
            }
            else {
                System.out.println("Bad choice bruh\n");
                validChoice = false;
            }

        } while (!validChoice);

        scanner.close();
    }
}