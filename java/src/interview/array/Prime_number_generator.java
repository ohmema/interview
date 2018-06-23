package interview.array;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

class Prime_number_generator {

    static int[] prime_number_generator(int num){
        if (num < 1)
            return new int[]{};

        ArrayList<Integer> prime_numbers = new ArrayList<>();
        for (int i = 1; i <= num; i ++){
            if(isPrime(i))
                prime_numbers.add(i);
        }

        System.out.println(prime_numbers);
        Integer[] primes = new Integer[prime_numbers.size()];
        prime_numbers.toArray(primes);
        return ArrayUtils.toPrimitive(primes);
    }

    static boolean isPrime(int num){
        for(int i = 2; i < Math.sqrt(num)+1; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        prime_number_generator(10);
    }
}
