import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int number, total = 0;
        boolean isNotOdd = true;
        Scanner scanner = new Scanner(System.in);
        while (isNotOdd){
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (number % 2 == 1){
                isNotOdd = false;
                break;
            }else if ((number % 2 == 0) && (number % 4 == 0) ){
                total += number;
            }

        }
        System.out.println("Total: " + total);
    }
}
