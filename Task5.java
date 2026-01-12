
import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        int [] arr = {2,5,63,63,86,23,98};
        int k=3;
        Arrays.sort(arr);
        System.out.println(k + "th smallest element is: " + arr[k-1]);
    }
}
