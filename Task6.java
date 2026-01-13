
 class Check {
    public void oddeven(int input1, String input2) {
        if(!input2.equalsIgnoreCase("Even")&& !input2.equalsIgnoreCase("Odd")){
            System.out.println("Ivalid Input Operation");
            return;
        }
        int sum=0;
       
        while(input1>0){
            int digit=input1%10;
            if(input2.equalsIgnoreCase("even")){
                if(digit%2==0){
                    sum+=digit;
                }
            }else if(input2.equalsIgnoreCase("odd")){
                if(digit%2!=0){
                    sum+=digit;
                }
            }
            
           input1= input1/10;
        
        }

        if(input2.equalsIgnoreCase("Even")){
            System.out.println("Even:"+ sum);
        }
        else if(input2.equalsIgnoreCase("Odd")){
            System.out.println("Odd:"+ sum);
        }
    }}

    public class Task6{
        public static void main(String[] args) {
            Check obj=new Check();
            obj.oddeven(1234,"Od");
            obj.oddeven(1234, "Even");
            obj.oddeven(25123,"ODD");
            

        }
    }
