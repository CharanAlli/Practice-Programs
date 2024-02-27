import java.util.Scanner;
class Mawabro {
    public static void main(String[] args) {
        char c;
        int firstNumber, secondNumber, output = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter + for addition, - for subtraction, * for multiplication and / for division: ");
        c = scanner.next().charAt(0);

        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextInt();

        switch (c) {
            case '+':
                output = firstNumber + secondNumber;
                break;
            case '-':
                output = firstNumber - secondNumber;
                break;
            case '*':
                output = firstNumber * secondNumber;
                break;
            case '/':
                output = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Please enter a valid symbol!!");
                return;
        }

        System.out.printf("%d %s %d = %d", firstNumber, c, secondNumber, output);
    }
}