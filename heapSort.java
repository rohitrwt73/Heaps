import java.util.*;
public class heapSort {
    public static void heapify(int arr[],int i, int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx =i;
        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx=left;
        }
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            //swap
            int t=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=t;
            heapify(arr,maxIdx,size);
        }
    }
    public static void sort(int arr[]){
          // step1-- build maxheap
          int n =arr.length;
          for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
          }
            //step2 - push largest at end
            for( int i=n-1;i>0;i--){
                //swap
                int t=arr[0];
                arr[0]=arr[i];
                arr[i]=t;

                heapify(arr,0,i);
            }
          
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        sort(arr);
        //print
        for(int i=0; i<arr.length;i++){
         System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
