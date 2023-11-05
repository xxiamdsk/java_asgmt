// Program to input marks and display the grade
import java.io.Console;

public class Grade {
    int marks;

    void input() {
        Console c = System.console();
        System.out.print("Enter the marks: ");
        marks = Integer.parseInt(c.readLine());
    }

    void display() {
        if (marks <= 100 && marks >= 80) {
            System.out.println("Honours");
        } else if (marks < 79 && marks >= 60) {
            System.out.println("First Division");
        } else if (marks < 59 && marks >= 50) {
            System.out.println("Second Division");
        } else if (marks < 49 && marks >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks");
        }
    }
    public static void main(String[] args) {
        Grade g = new Grade();
        g.input();
        g.display();
    }
}
