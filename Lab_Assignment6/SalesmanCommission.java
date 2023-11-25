import java.io.Console;

public class SalesmanCommission {
    String area;
    int sale;

    void input() {
        Console c = System.console();
        System.out.print("Enter the area: ");
        area = c.readLine();
        System.out.print("Enter the sale: ");
        sale = Integer.parseInt(c.readLine());
    }

    void Commission() {
        switch (area) {
            case "x":
                if (sale < 1000) {
                    System.out.println("Commission is " + (sale * 0.01));
                } else if (sale < 5000) {
                    System.out.println("Commission is " + (sale * 0.12));
                } else if (sale >= 5000) {
                    System.out.println("Commission is " + (sale * 0.15));
                }
                break;
            case "y":
                if (sale < 1500) {
                    System.out.println("Commission is " + (sale * 0.01));
                } else if (sale < 7000) {
                    System.out.println("Commission is " + (sale * 0.12));
                } else if (sale >= 7000) {
                    System.out.println("Commission is " + (sale * 0.15));
                }
                break;
            case "z":
                if (sale < 1200) {
                    System.out.println("Commission is " + (sale * 0.01));
                } else if (sale < 6500) {
                    System.out.println("Commission is " + (sale * 0.12));
                } else if (sale > 6500) {
                    System.out.println("Commission is " + (sale * 0.15));
                }
                break;

            default:
                break;
        }
    }

    public static void main(String[] args) {
        SalesmanCommission sc = new SalesmanCommission();
        sc.input();
        sc.Commission();

    }
}
