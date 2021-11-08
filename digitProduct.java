public class digitProduct {
    public static void main(String[] args) {
        System.out.println(fn(1302));
    }
    static int fn(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*fn(n/10);
    }
}
