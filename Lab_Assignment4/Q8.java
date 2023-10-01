import java.io.Console;
class Q8{
    public static void main(String args[]){
        Console c = System.console();
        int num1 = Integer.parseInt(c.readLine("Enter a first number:"));
        int num2 = Integer.parseInt(c.readLine("Enter a second number:"));
        int num3 = Integer.parseInt(c.readLine("Enter a third number:"));
        int num4 = Integer.parseInt(c.readLine("Enter a fourth number:"));
        int greatest = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        int smallest = Math.min(Math.min(num1, num2), Math.min(num3, num4));
        System.out.println(greatest+" is Greatest number amoung entered numbers.");
        System.out.println(smallest+" is Smallest number amoung entered numbers.");
        if(greatest == smallest){
            System.out.println("There is no difference Between greatest and smallest number.");
        }
        else{
             System.out.println("Difference between greatest and smallest number:"+(greatest-smallest));
        }
    }}