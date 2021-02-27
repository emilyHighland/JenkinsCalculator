
import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        Calculator calculate = new Calculator();

        System.out.println("Welcome to the calculator!");
        System.out.println("Enter a command:");

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\p{javaWhitespace}+");

        while(scanner.hasNext()) {
            String command = scanner.next();
            int input1 = scanner.nextInt();

            switch (command) {
                case "add":
                    System.out.println(calculate.add(input1, scanner.nextInt()));
                    break;
                case "subtract":
                    System.out.println(calculate.subtract(input1, scanner.nextInt()));
                    break;
                case "multiply":
                    System.out.println(calculate.multiply(input1, scanner.nextInt()));
                    break;
                case "divide":
                    System.out.println(calculate.divide(input1, scanner.nextInt()));
                    break;
                case "fibonacci":
                    System.out.println(calculate.fibonacciNumberFinder(input1));
                    break;
                case "binary":
                    System.out.println(calculate.intToBinaryNumber(input1));
                    break;
            }
        }
    }
}
