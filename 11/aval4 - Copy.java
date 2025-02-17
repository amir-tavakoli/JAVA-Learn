import java.util.Scanner;

public class aval4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int a = x.nextInt();
        int aa = a+1;
        int b = x.nextInt();
        int [] c = new int[b-aa];
        int j = 0;
        for (;aa  < b ; aa++){
            boolean isPrime = true;
            for (int i = 2 ; i <= aa/2 ; i++){
                if (aa % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { //a را به  c اضافه کن
                c[j] = aa;
                j++;
            }
        }
        System.out.print(c[0] );
        for (int i = 1; i < j; i++) {
            System.out.print(",");
            System.out.print(c[i] );
        }
    }
}