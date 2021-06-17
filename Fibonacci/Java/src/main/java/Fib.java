public class Fib {

    public static void getFib(long n) {
        System.out.println(calFib(n));
    }

    private static long calFib(long n) {
        if(n <= 0) {
            return 0;
        }
        if(n <= 2) {
            return 1;
        }
        return calFib(n-1) + calFib(n-2);
    }

    public static void main(String[] args) {
        for(int i =1 ; i <= 10 ; i++) {
            Fib.getFib(i);
        }
        Fib.getFib(50);
    }
}
