import java.io.*;
public class ElectricityCharge {
    double units;

    void input() {
        Console c = System.console();
        System.out.print("Enter the units: ");
        units = Integer.parseInt(c.readLine());
    }

    void charge() {
        if (units <= 200) {
            System.out.println("Charge is " + (units * 0.5));
        } else if (units > 200 && units <= 400) {
            System.out.println("Charge is " + (units * 0.65+100));
        } else if (units > 401 && units <= 600) {
            System.out.println("Charge is " + (units * 0.8+230));
        } else if (units > 600) {
            System.out.println("Charge is " + (units * 1.25+425));
        }
    }

    public static void main(String[] args) {
        ElectricityCharge ec = new ElectricityCharge();
        ec.input();
        ec.charge();
        
    }
}
