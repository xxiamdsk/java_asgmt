import java.io.Console;

public class CommissionPerSale {

    double ammount;

    void input() {
        Console c = System.console();
        System.out.print("Enter the sale ammount: ");
        ammount = Integer.parseInt(c.readLine());
    }

    void Commission() {
        if (ammount <= 500) {
            System.out.println("Commission is " + (ammount * 5) / 100);
        } else if (ammount > 500 && ammount <= 2000) {
            System.out.println("Commission is " + (ammount * 0.1 + 35));
        } else if (ammount > 2000 && ammount <= 5000) {
            System.out.println("Commission is " + (ammount * 0.12 + 185));
        } else if (ammount > 5000) {
            System.out.println("Commission is " + (ammount * 0.1255));
        }

    }

    public static void main(String[] args) {
        CommissionPerSale cps = new CommissionPerSale();
        cps.input();
        cps.Commission();
    }
}