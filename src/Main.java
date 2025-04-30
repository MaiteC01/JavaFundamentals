import  java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1: Exploring Variables and Primitive Types");
        int age= 28;
        double height = 59.05;
        char initial = 'M';
        boolean isStudent = false;

        System.out.println("My age: " +age);
        System.out.println("My height: "+ height);
        System.out.println("My initial: " + initial);
        System.out.println("Status: " + isStudent);

        System.out.println("Part 2: Increment and Decrement Operations\n");

        int counter =10;
        counter ++;
        System.out.println("After incrementing: " + counter);
        counter --;
        System.out.println("After decrementing: " + counter);

        for (counter = 10; counter <= 15; counter++) {
            System.out.println("for: " + counter);
        }
counter = 15;
        while (counter >= 10) {
            System.out.println("while " + counter);
            counter--;
        }

        System.out.println("Part 3: Working with Strings and User Input");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your lastname: ");
        String lastName = scanner.nextLine();
        String fullName = firstName + " " + lastName;
        String fullNameUpper = fullName.toUpperCase();
        char firstChar = fullNameUpper.charAt(0);
        int count = 0;
        for (int i = 0; i < fullNameUpper.length(); i++) {
            if (fullNameUpper.charAt(i) == firstChar) {
                count++;
            }
        }

        System.out.println("\nFull Name: " + fullName);
        System.out.println("Uppercase: " + fullNameUpper);
        System.out.println("The character '" + firstChar + "' appears " + count + " times.");

        //scanner.close();

        System.out.println("Assignment 4: Using Conditionals, Logical Operators, and Switch Statements");

        int a = 75;
        int b = 63;
        int c = 28;
        int averageScore = (a+b+c) / 3;

        if (averageScore >= 90 && averageScore <= 100) {
            System.out.println("Excellent");
        } else if (averageScore >= 70 && averageScore <= 89) {
            System.out.println("Good");
        } else if (averageScore >= 50 && averageScore <= 69) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        System.out.println("Part 5: Basic Calculator");
        double num1, num2, result = 0;
        char operation;
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner1.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner1.nextDouble();
        System.out.print("Choose an operation (+, -, *, /): ");
        operation = scanner1.next().charAt(0);

        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.println("Result: " + result );

        System.out.print("Do you want to increase (i) or decrease (d) the result by one?");
        char operator;
        double x;
        Scanner opScanner = new Scanner(System.in);
        operator = opScanner.next().charAt(0);

        if (operator == 'i') {
            x = result + 1;
            System.out.println("Result increased by 1: " + x );
        } else if (operator == 'd'){
            x= result -1 ;
            System.out.println("Result decreased by 1: " + x );
        } else {
            System.out.println("Invalid operation");
        }

    }
}