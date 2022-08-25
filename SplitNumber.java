import java.util.Scanner;

public class SplitNumber {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        int temp = number;
        int digit = 0;

        do{
            temp = temp/10;
            digit++;
        }while (temp>0);
        int times = digit;
        System.out.println("This is a "+digit+" number");

        for(int i = 0; i<digit; i++){
            times--;
            
            int printDigit = number/(int)Math.pow(10,times);
            System.out.println(printDigit* (int)Math.pow(10,times));
            number = (int) (number%Math.pow(10,times));
            
        }
        
    }
}
