import java.util.Scanner;

public class Power_logarithmic {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n= scn.nextInt();
        System.out.println(fn(x,n));

    }
    public  static int fn(int x,int n){
        if (n==0){
            return 1;
        }
        int ansx=fn(x,n/2);
        int xp=ansx*ansx;
        if (n%2!=0){
            xp*=x;
        }
        return xp;
    }
}
