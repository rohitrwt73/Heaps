import java.util.*;
public class heapSortDescend {
    public static void heapify(int arr[],int i, int size){
        int left=2*i+1;
        int right=2*i+2;
        int minIdx =i;
        if(left<size && arr[left]<arr[minIdx]){
            minIdx=left;
        }
        if(right<size && arr[right]<arr[minIdx]){
            minIdx=right;
        }
        if(minIdx!=i){
            //swap
            int t=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=t;
            heapify(arr,minIdx,size);
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

