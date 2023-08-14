import java.io.Console;
class Q5{
    public static void main(String args[]){
        Console c= System.console();
        int num = Integer.parseInt(c.readLine("Enter a number:"));
        boolean flag = false;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                flag = true;
                break;
            }
            
        }

        if(!flag){
        System.out.println(num+" is a prime number.");
        }
        else{
             System.out.println(num+" is a composite number.");
        }
    }
}