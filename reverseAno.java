public class reverseAno {
    public static void main(String[] args) {
        fn(12345);
    }
    static void fn(int n){
 if (n==0){
     return;
 }
        System.out.print(n%10);
 fn(n/10);


    }
}
