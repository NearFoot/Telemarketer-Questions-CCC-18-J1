//CCC '18 J1 - Telemarketer or not?
//Write a program to decide if a telephone number is a telemarketer number or not, based on the last four digits. If the number is not a telemarketer number, we should answer the phone, and otherwise, we should ignore it.
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            boolean isFirstDigit8or9 = a == 8 || a == 9;
            boolean isLastDigit8or9 = d == 8 || d == 9;
            boolean areSecondAndThirdDigitsSame = b == c;
            boolean isTelemarketerNumber = isFirstDigit8or9 && isLastDigit8or9 && areSecondAndThirdDigitsSame;

            if (isTelemarketerNumber) {
                System.out.println("ignore");
            } else {
                System.out.println("answer");
            }
        }
    }
}


