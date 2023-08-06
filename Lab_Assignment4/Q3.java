import java.io.Console;
class Q3{
    public static void main(String args[]){
        Console c = System.console();
        int num1 = Integer.parseInt(c.readLine("Enter first number:"));
        int num2 = Integer.parseInt(c.readLine("Enter second Number:"));
        int choice = Integer.parseInt(c.readLine("1-->Addition\n2-->Substraction\n3-->Multiplication\n4--> Division\nEnter choice:"));
        switch(choice){
            case 1:System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2)+" .");
                    break;
            
            case 2:System.out.println("Substraction of "+num1+" and "+num2+" is "+(num1-num2)+" .");
                    break;
            
            case 3:System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2)+" .");
                    break;
            
            case 4:System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2)+" .");
                    break;
        
            default:System.out.println("Enter valid Choice");
                    break;
            }
        }
}