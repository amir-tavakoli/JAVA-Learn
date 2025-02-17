import java.util.Scanner;

public class fisa1s {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int [] a = new int[3];

        for (int i = 0; i < 3; i++){
            a[i] = x.nextInt();
        }

        int bigIndex = 0;
        for (int i = 1;  i < 3; i++){
            if (a[i] > a[bigIndex]){
                bigIndex = i;
            }
        }

        //System.out.println("The biggest number is: " + a[bigIndex]);
//
        // Calculate the sum of squares of the other two numbers
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            if (i != bigIndex) {
                sum += a[i] * a[i];
            }
        }

       // System.out.println("The sum of squares of the other two numbers is: " + sum);
        if (sum ==( a[bigIndex] * a[bigIndex] )){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}