
public class Task3{
    public static void main(String[] args){ 
        int[] arr = {2, 3, 4, 10, 40};
        int key =10;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                System.out.println("Element founf at index:" + mid);
                return;
            }
            if(key<arr[mid]){
                high=mid -1;

            }
            else{
                low=mid+1;
            }
        }

        System.out.println("Element not found");
        


    }
}