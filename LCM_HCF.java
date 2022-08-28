import java.util.Scanner;

public class LCM_HCF {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int arr[];
        System.out.println("Enter two numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("What do you want. Choose 1 or 2\n 1. HCF\t2.LCM");
        int choice = sc.nextInt();

        switch(choice) {
            case (1):
                HCF(n,m);
                break;
            case (2):
                 LCM(n,m);
                 break;

        }

    }
    public static void HCF(int n, int m){
        int gcd = 1;
        while (n!=m){
            if(n>m){
                n=n-m;
            }
            else m=m-n;
        }
        System.out.println("HCF: "+n);
/*
        for (int i = 1;i<=m || i<=n;i++){
            if(n%i == 0 && m%i==0){
                gcd = i;
            }
        }*/
    }

    public static void LCM(int n,int m){
        int lcm ;
        lcm=(n>m)?n:m;
        while(true) {
            if (lcm % m == 0 && lcm % n == 0) {
                System.out.println("LCM: "+lcm);
                break;
            }
            lcm++;
        }
    }

}
