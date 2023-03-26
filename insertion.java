import java.util.*;
public class insertion{
    static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();
       public void add(int data){
        //add at last idx
        arr.add(data);
        int x= arr.size()-1;   //child idx
        int par=(x-1)/2;    //parent idx
        while(arr.get(x) < arr.get(par)){  //O(log n)
            //swap
            int temp = arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);
            x=par;
            par=(x-1)/2;
        }
       }
       public int peek(){
        return arr.get(0);//min element of minHeap
       }
    }
    public static void main(String[] args) {
        
    }
}
