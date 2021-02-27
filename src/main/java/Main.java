
import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        Calculator calculate = new Calculator();

        System.out.println("Welcome to the calculator!");
        System.out.println("Enter a command:");

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\p{javaWhitespace}+");

        while(scanner.hasNext() && scanner.next() != null) {
            String command = scanner.next();
            int input1 = scanner.nextInt();

            if ("add".equals(command)) {
                System.out.println(calculate.add(input1, scanner.nextInt()));
            } else if ("subtract".equals(command)) {
                System.out.println(calculate.subtract(input1, scanner.nextInt()));
            } else if ("multiply".equals(command)) {
                System.out.println(calculate.multiply(input1, scanner.nextInt()));
            } else if ("divide".equals(command)) {
                System.out.println(calculate.divide(input1, scanner.nextInt()));
            } else if ("fibonacci".equals(command)) {
                System.out.println(calculate.fibonacciNumberFinder(input1));
            } else if ("binary".equals(command)) {
                System.out.println(calculate.intToBinaryNumber(input1));
            }
        }
    }
}
