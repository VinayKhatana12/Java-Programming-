import java.util.Scanner;
public class BinarySearch {
    public static int binarySearch(int[] arr , int target){
        int low =0;
        int high = arr.length-1;
        int mid = low + (high-low)/2;
        while(low<high){
            mid = low+(high-low)/2;
            if(arr[target]==arr[mid]){
                return mid;
            }
            else if(arr[target] <arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,target));


    }

}
