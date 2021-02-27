
//import java.util.Scanner;

public class Main {
    public static void main(String[] Args){
        Calculator calculate = new Calculator();
//        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("((#[^\\n]*\\n)|(\\s+))+");

        System.out.println("Welcome to the calculator!");
        System.out.println("Enter a command:");

//        while(scanner.hasNext()) {
        String command = Args[0];
        int input1 = Integer.getInteger(Args[1]);

        switch (command) {
            case "add":
                System.out.println(calculate.add(input1, Integer.getInteger(Args[2])));
                break;
            case "subtract":
                System.out.println(calculate.subtract(input1, Integer.getInteger(Args[2])));
                break;
            case "multiply":
                System.out.println(calculate.multiply(input1, Integer.getInteger(Args[2])));
                break;
            case "divide":
                System.out.println(calculate.divide(input1, Integer.getInteger(Args[2])));
                break;
            case "fibonacci":
                System.out.println(calculate.fibonacciNumberFinder(input1));
                break;
            case "binary":
                System.out.println(calculate.intToBinaryNumber(input1));
                break;
        }
//        }
    }
}
