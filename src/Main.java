import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Functional functional = (x) -> { int result = 1;
            for (int i = 1; i < x; i++)
                result*=i;


            return result;


        };
        System.out.println(functional.getFactorial(scanner.nextInt()));
    }
}