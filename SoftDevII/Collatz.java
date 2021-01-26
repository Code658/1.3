public class Collatz {
    public static String sequence(int n){
        String collatz = "";
        if(n < 1){
            return collatz;
        }
        else{
            for(int i = 1; i >= 0; i++){
                if(n == 1){
                    collatz = collatz + n +" ";
                    return collatz;
            }
                else if(n % 2 == 0){
                    collatz += n+" ";
                    n = n/2;
            }
                else{
                    collatz += n+" ";
                    n = 3*n + 1;
            }
        }
    }
        return collatz;
    
}
    public static void main(String[] args){
        System.out.println(sequence(13));
        System.out.println(sequence(5));
        System.out.println(sequence(12));
        System.out.println(sequence(19));
        System.out.println(sequence(1));
        System.out.println(sequence(0));
    }
}
