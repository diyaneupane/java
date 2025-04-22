import java.util.Scanner;
public class task3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number");
        int a= sc.nextInt();
        if (a>0){
            System.out.println("positive");
        }
    
            else if  (a==0){
            System.out.println("zero");
        }
    
            else {
            System.out.println("negative");
            }
        
}
}

