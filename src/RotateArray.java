import java.util.Scanner;
public class RotateArray {
    public static void reverse(int[] nums, int start, int end) {
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int[] arr, int k){
            k = k%arr.length;
            reverse(arr,0,arr.length-1);
            reverse(arr,0,k-1);
            reverse(arr,k,arr.length-1);
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length of array:");
        int length = sc.nextInt();
        System.out.println("Enter your kth step for rotation:");
        int k = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i]= sc.nextInt();
        }
        rotateArray(arr,k);
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
