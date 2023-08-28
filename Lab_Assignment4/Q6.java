import java.io.Console;
class Q6{
    public static void main(String args[]){
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter a number:"));
        if(n%5==0 && n%7==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}