public class powerLinear {
    public static void main(String[] args) {
int n=2;
int x=5;

        System.out.println(fn(n,x));
    }
    static int fn(int n,int x){
        if (x==0){
            return 1;
        }
        int ans=fn(n,x-1);
        int z=ans*n;
        return z;
    }
}
