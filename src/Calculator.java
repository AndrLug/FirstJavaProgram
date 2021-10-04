import java.util.Scanner;

public class Calculator {
    public static void main (String []args) {
        Scanner input = new Scanner(System.in);
        double firstNumber, secondNumber;
        String equationOperator;

        System.out.println("Enter the first number: \t");
        firstNumber = input.nextDouble();

        System.out.println("Enter the second number: \t");
        secondNumber = input.nextDouble();

        System.out.println("Equation");
        System.out.println("Choose one of the following + - / * \t");
        equationOperator = input.next();

        switch (equationOperator) {
            case "+":
                System.out.println("Adding");
                System.out.println("Your answer is: " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Subtracting");
                System.out.println("Your answer is: " + (firstNumber - secondNumber));
                break;
            case "/":
                System.out.println("Dividing");
                System.out.println("Your answer is: " + (firstNumber / secondNumber));
                    if (secondNumber==0) {
                        throw new ArithmeticException("Сan not divide by zero");
                    }
                break;
            case "*":
                System.out.println("Multiplying");
                System.out.println("Your answer is: " + (firstNumber * secondNumber));
                break;
        }
    }
}









