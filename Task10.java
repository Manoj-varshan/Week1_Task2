class Task {

    public int sumdigits(int input1, int input2){
        input1=input1%10;
        input2=input2%10;
        return input1+input2;
    }
    
}
public class Task10{
    public static void main(String[] args) {
        Task obj = new Task();
         int result=obj.sumdigits(1542, 5634);
        System.out.println("Sum of last digits: "+ result);
    }
}
