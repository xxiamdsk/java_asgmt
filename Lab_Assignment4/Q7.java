import java.io.Console;
class Q7{
    public static void main(String args[]){
        Console c = System.console();
        int num = Integer.parseInt(c.readLine("Enter a four digit number:"));
        int rem=0;
        System.out.print("Reverse of "+num+" is ");
        while(num!=0){
        rem = num%10;
        num = num/10;
        System.out.print(rem);
        }

    }
}