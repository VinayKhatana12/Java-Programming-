package Sorting;
import java.util.*;
public class MergeSort {
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                merged[k]=left[i];
                i++;
                k++;
            }
            else {
                merged[k]= right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            merged[k++]=left[i++];
        }
        while(j<right.length){
            merged[k++] = right[j++];
        }
        return merged;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(mergeSort(arr)));


    }
}
