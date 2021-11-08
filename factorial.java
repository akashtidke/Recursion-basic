public class factorial {
    public static void main(String[] args) {

        System.out.println(fn(5));
    }
    static int fn(int n){
        if (n==1){
            return 1;
        }
      int ans=n*(fn(n-1));
        return ans;
    }
}
