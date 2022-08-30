import java.util.Scanner;

public class MaxArray {
    public static void main(String...args){
        Scanner scan = new Scanner(System.in);
        int []arr = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            arr[i] = scan.nextInt();
        }
        
        System.out.println("MaxArray Element: "+maxElement(arr));
    }
    public static int maxElement(int []num){
        int lar = num[0];
        for(int i=1; i<5;i++){
            if(num[i]>lar){
                lar = num[i];
            }
        }
        return lar;
    }
    
}
