import java.util.Scanner;

public class LCM {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int lcm = (n>m)?n:m;
        while (true){
            if(lcm%m==0 && lcm%n==0){
                System.out.println(lcm);
                break;
            }
            lcm = (m>n)?(lcm+m):(lcm+n);
        }
    }
}
