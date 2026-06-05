import java.util.*;
public class selection {
    public static void main(String args[]){
        int arr[]={32,23,65,87,1};
        //selection sort
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];   
            arr[i]=temp;
                }
                    
        System.out.print("Sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}

