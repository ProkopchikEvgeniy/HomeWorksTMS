package HW13.task2;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            while(true){
                System.out.println(e.getMessage() );
            }
        }
        finally {
            b=1;
            System.out.println("B = " + b);
        }
    }
}
