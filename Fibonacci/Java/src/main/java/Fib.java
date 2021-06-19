import java.util.HashMap;
import java.util.Map;

public class Fib {

    public static void getFib(long n) {
        Map<Long, Long> map = new HashMap<>();
        System.out.println(calFib(n, map));
    }

    private static long calFib(long n, Map<Long, Long> map) {
        if(map.get(n) != null) {
            return map.get(n);
        }
        if(n <= 0) {
            return 0;
        }
        if(n <= 2) {
            return 1;
        }
        long n1= calFib(n-1, map);
        map.put(n-1, n1);
        long n2 = calFib(n-2, map);
        map.put(n-2, n2);

        return n1+ n2;
    }

    public static void main(String[] args) {
        for(int i =1 ; i <= 10 ; i++) {
            Fib.getFib(i);
        }
        Fib.getFib(100);
    }
}
