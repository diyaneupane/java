import java.util.Scanner;
public class task2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter thhhe number ");
        int a= sc.nextInt();

        System .out.println("Enter the  next number");
        int b= sc.nextInt();

        int sum=a+b;
        System.out.println("the product of two number is:" +sum);
        int difference=a-b;
        System.out.println ("the diffrence of two number is:" +difference);
        int product=a*b;
        System.out.println ("the product  of two number is:" +product);
        int quotient=a/b;
        System.out.println ("the product  of two number is:" +quotient);
    }
}
