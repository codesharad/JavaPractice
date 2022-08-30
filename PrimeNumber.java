import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class PrimeNumber {
    public static void main(String...atgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to check is prime or not?");
        int num = sc.nextInt();
        sc.close();
        if (num>1){
            prime(num);
        }
        else {
            System.out.println("ENter valid number");
        }
    }
    public static void prime(int num){
        int flag=0;
        for(int i=1;i<=Math.sqrt(num);i++){
            if (num%i==0){
                flag++;
            }
        }
        if(flag==1)
            System.out.println(num+" is a prime number");
        else
            System.out.println(num+ " is not a prime number"); 
        
    }
}
