class Task{
    public void palindrome(int n){
        int rev=0;
        int org=n;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(org==rev){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
    }
}
public class Task9{
    public static void main(String[] args) {
        Task obj = new Task();
        obj.palindrome(122);
        
    }
}