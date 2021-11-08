public class sumOfDigit {
    public static void main(String[] args) {
        System.out.println(fn(54321));
    }
    static int fn(int n){
        if (n==0){
            return 0;
        }
int r=n%10;

int ans=r+fn(n/10);

return ans;
    }
}
