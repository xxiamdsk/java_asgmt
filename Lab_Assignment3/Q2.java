import java.io.Console;

class Q2{
    public static void main(String args[]){
    Console c = System.console();
    String Product = c.readLine("Enter Product name:");        
    String Manufacturer = c.readLine("Enter Manufacturer name:");        
    String Price = c.readLine("Enter Price:");        

    System.out.println("Product Name:"+Product);
    System.out.println("Manufacturer Name:"+Manufacturer);
    System.out.println("Price:"+Price);
    }
}