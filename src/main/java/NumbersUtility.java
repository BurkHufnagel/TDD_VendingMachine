import java.util.*;

public class NumbersUtility {
    public static boolean isPerfectNumber(int number) {
        Set<Integer> factors = getFactors(number);
        int sum = sumValues(factors);

        return sum == number;
    }




    public static Set<Integer> getFactors(int number) {
        Set<Integer> factors = new TreeSet<>();
        factors.add(1);
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                factors.add(i);
                factors.add(number/i);
            }
        }

        return factors;
    }

    public static int sumValues(Collection<Integer> values) {
        int sum = 0;
        for(Integer i : values) {
            sum += i;
        }

        return sum;
    }
}
