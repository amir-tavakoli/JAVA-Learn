import java.util.Scanner;

public class mogayesa {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int add1 = x .nextInt();
        int add2 = x .nextInt();
        int add3 = x .nextInt();
        if (add1 >= add2 && add1 >= add3) {
            System.out.println(add1);
        } else if (add2 >= add1 && add2 >= add3) {
            System.out.println(add2);
        } else {
            System.out.println(add3);
        }

    }
}
