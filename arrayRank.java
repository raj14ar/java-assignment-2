import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class arrayRank {
    public static int[] rankArray(int[] arr)
    {
        int temp[] = new int[arr.length];
        for(int i = 0 ; i< arr.length ; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            if (rank.get(temp[i]) == null) {
                rank.put(temp[i], i+1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rank.get(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {25, 16, 2 ,0 , 10};
        int[] ans=rankArray(arr);
        for(int i=0;i<5;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
