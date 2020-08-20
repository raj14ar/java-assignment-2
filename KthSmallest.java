import java.util.PriorityQueue;

public class KthSmallest {
    public static int kthSmallest(int arr[], int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        for(int j=0;j<k-1;j++){
            pq.remove();
        }
        return pq.remove();
    }

    public static void main(String[] args) {
        int[] arr = {798,1720,4524,51,486,257};
        System.out.println(kthSmallest(arr,3));
    }
}
