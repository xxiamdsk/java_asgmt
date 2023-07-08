class Q4{
    public static void main(String args[]){
     byte b=10;
     //b=b+10; this line doesn't work due to lossy conversion of int to byte.
     System.out.println(b);
     b+=10;
     System.out.println(b);
    }}