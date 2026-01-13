class Task{

    public int fibonacci(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int a=0;
    int b=1;
    for(int i=3;i<=n;i++){
        int c=a+b;
        a=b;
        b=c;
    }
    return b;

    }

    

}
public class Task8{
    public static void main(String[] args) {
        Task obj=new Task();
         System.out.println(obj.fibonacci(5));
    }
}