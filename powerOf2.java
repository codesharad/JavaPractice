import java.util.Scanner;

public class powerOf2 {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int temp =0;
        while(true){
            if(n>Math.pow(2, temp)){
                temp++;
                continue;
            }
            else {
                System.out.println("2^"+(temp-1));
                break;
            }
        }
        
        sc.close();
    }
}
