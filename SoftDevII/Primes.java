import javax.lang.model.util.Elements;

public class Primes {
    public static boolean isPrime(int n) {
        if(n<2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % 2 == 0) {
            return false;
        }
        else {
            for(int i = 3; i < n; i+=2){
                if (i == n){
                    return true;
                }
                else if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        for(int count = 1; count<=100; count++){
            System.out.println(isPrime(count));
        }
    }
}
