public class CountUp {
    public static int countWhile(int n) {
        int sum = 0;
        int count = 0;
        while(count <= n) {
            System.out.println(count);
            sum += count;
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(countWhile(100));
    }
}
