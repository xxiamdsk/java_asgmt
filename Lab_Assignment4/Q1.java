import java.io.Console;
class Q1{
    public static void main(String args[]){
        Console c = System.console();
        int day = Integer.parseInt(c.readLine("Enter day number:"));
        switch(day){
            case 1:System.out.println("In Week day "+day+" is Sunday.");
                    break;
            
            case 2:System.out.println("In Week day "+day+" is Monday.");
                    break;
            
            case 3:System.out.println("In Week day "+day+" is Tuesday.");
                    break;
            
            case 4:System.out.println("In Week day "+day+" is Wednesday.");
                    break;
            
            case 5:System.out.println("In Week day "+day+" is Thursday.");
                    break;

            case 6:System.out.println("In Week day "+day+" is Friday.");
                    break;
            
            case 7:System.out.println("In Week day "+day+" is Saturday.");
                    break;
        }

    }

}