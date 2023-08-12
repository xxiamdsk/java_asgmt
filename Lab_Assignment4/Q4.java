import java.io.Console;
public class Q4{
    public static void main(String args[]){
       Console c = System.console();
       int num=Integer.parseInt(c.readLine("Enter a number:"));
       if(num%2==0){
        System.out.println(num+" is Even number.");
       }
       else{
        System.out.println(num+" is Odd number.");
        
       }

    }
}