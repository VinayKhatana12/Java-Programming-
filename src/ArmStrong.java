import java.util.Scanner;
public class ArmStrong {
    public static boolean isArmStrong(int n){
        int original = n;
        int count =0;
        int temp=n;
        while(temp>0){
            count++;
            temp=temp/10;
        }

        int sum=0;
        while(n>0){
            int digit = n%10;
            sum += (int) Math.pow(digit,count);
            n=n/10;
        }
        return original == sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isArmStrong(number));

    }
}
