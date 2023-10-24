import java.io.*;

public class Discount {
    int ammount;

    void input() {
        Console c = System.console();
        System.out.print("Enter the ammount: ");
        ammount = Integer.parseInt(c.readLine());
    }

    void discount() {
        if (ammount < 1000) {
            System.out.println("Discount is " + (ammount * 0.05));
            if (ammount > 100 && ammount <= 3000) {
                System.out.println("Discount is " + (ammount * 0.1));
                if (ammount > 3000 && ammount <= 5000) {
                    System.out.println("Discount is " + (ammount * 0.12));
                    if (ammount > 5000) {
                        System.out.println("Discount is " + (ammount * 0.15));
                    }
                }
            }
        }
    }

    void display() {
        if (ammount < 1000) {
            System.out.println("Discount is " + (ammount * 0.05));
            if (ammount > 1000 && ammount <= 3000) {
                System.out.println("Discount is " + (ammount * 0.1));
                if (ammount > 3000 && ammount <= 5000) {
                    System.out.println("Discount is " + (ammount * 0.12));
                    if (ammount > 5000) {
                        System.out.println("Discount is " + (ammount * 0.15));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Discount d = new Discount();
        d.input();
        d.display();

    }
}
