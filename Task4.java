public class Task4 {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 10, 40};
        int max=arr[0];
        for(int i: arr){
            if(i>max){
                max=i;
            }       
    } 
    System.out.println("Maximum element is: " + max);}
}
