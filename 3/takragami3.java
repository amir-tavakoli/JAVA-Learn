import java.util.Scanner;

public class takragami3 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

            long number = x.nextLong();
            while (number > 9) {
                int sum = 0;
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                number = sum;
            }
            System.out.println(number);
        }
    }


