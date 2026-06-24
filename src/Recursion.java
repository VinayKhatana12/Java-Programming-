import java.util.Scanner;

public class Recursion {
    public static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n < 2) return n;
        return n * factorial(n - 1);
    }




        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            print(size);
        }
    }

