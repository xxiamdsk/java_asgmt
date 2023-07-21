import java.io.Console;

class Q1{
    public static void main(String args[]){
    Console c = System.console();
    String bname = c.readLine("Enter book name:");        
    String pname = c.readLine("Enter book publisher name:");        
    String aname = c.readLine("Enter book author name:");        

    System.out.println("Book Name:"+bname);
    System.out.println("Book Publisher Name:"+pname);
    System.out.println("Book Author Name:"+aname);
    }
}