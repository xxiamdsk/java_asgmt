import java.io.Console;
class Q2{
    public static void main(String args[]){
        Console c= System.console();
        int month = Integer.parseInt(c.readLine("Enter Month Number: "));
        int year = Integer.parseInt(c.readLine("Enter Year: "));
         
         switch(month){
            case 1:System.out.println("Month: January");
                    System.out.println("Number of days:31");
                    leap(year);
                    break;

            case 2:System.out.println("Month: February");
                if(year%400==0 || year%100 != 0 && year%4==0){
                        System.out.println("Number of days:29");
            }
            else{
                System.out.println("Number of days:28");
            }
                leap(year);
                break;
            
            case 3:System.out.println("Month: March");
                    System.out.println("Number of days:31");
                    leap(year);
                    break;

            case 4:System.out.println("Month: April");
                    System.out.println("Number of days:30");
                    leap(year);
                    break;

            case 5:System.out.println("Month: May");
                    System.out.println("Number of days:31");
                    leap(year);
                    break;

            case 6:System.out.println("Month: June");
                    System.out.println("Number of days:30");
                    leap(year);
                    break;
            
            case 7:System.out.println("Month: July");
                    System.out.println("Number of days:31");
                    leap(year);
                    break;
            
            case 8:System.out.println("Month: August");
                    System.out.println("Number of days:31");
                    leap(year);
                    break;
            
            case 9:System.out.println("Month: September");
                    System.out.println("Number of days:30");
                    leap(year);
                    break;
            
            case 10:System.out.println("Month: October");
                    System.out.println("Number of days:31");
                    leap(year);
                    break;
            
            case 11:System.out.println("Month: November");
                    System.out.println("Number of days:30");
                    leap(year);
                    break;

            case 12:System.out.println("Month: December");
                    System.out.println("Number of days:31");
                    leap(year);
                    break;
            default:System.out.println("Enter a valid month number");
                    break;
         }             

        
        
    }
    static void leap(int year){
        if(year%400==0 || year%100 != 0 && year%4==0){
                        System.out.println(year+" is a leap Year.");
            }
           
    }
} 