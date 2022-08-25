import java.util.Scanner;

public class ODDorEVEN {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check odd or even? ");
        int number = sc.nextInt();

        if(number%2==0)
        System.out.println("Number is even ");

        else
        System.out.println("Number is odd");

        sc.close();
    }
    
}
