import java.util.*;

public class Fibbonaci {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int f=0;
        int a=0,b=1;
        if (n==0)
            f=a;
        else if (n==1)
            f=b;
        else {
            for (int i=2;i<=n;i++){
                f = a+b;
                a = b;
                b = f;
            }
        }
        System.out.println(f);
    }
}