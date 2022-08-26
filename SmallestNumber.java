import java.util.Scanner;

public class SmallestNumber {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number[] = new int[3];
        number[0] = sc.nextInt();
        number[1] = sc.nextInt();
        number[2] = sc.nextInt();
        System.out.println("Smallest Number: ");
        if(number[0]<number[1]){
            if(number[0]<number[2]){
                System.out.println(number[0]);
            }
            else
                System.out.println(number[2]);
        }
        else {
            if(number[1]<number[2]){
                System.out.println(number[1]);
            }
            else
                System.out.println(number[2]);
        }

        sc.close();
    }
    
}
