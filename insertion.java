import java.util.*;
public class insertion {
    public static void main(String args[]){
        int arr[]={2,3,6,8,1};
        //insertion sort
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && key < arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.print("Sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }    
}
}
