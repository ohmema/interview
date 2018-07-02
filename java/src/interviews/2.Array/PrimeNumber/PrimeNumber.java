package PrimeNumber;

import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

class Prime_number_generator {

    static int[] prime_number_generator(int num){
        if (num < 1)
            return new int[]{};
        String dataName = "primes.dat";
        ArrayList<Integer> prime_numbers = null;
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(dataName)))){
            prime_numbers = getData(ois);
        }catch(IOException | ClassNotFoundException e){
            prime_numbers = new ArrayList<>();
        }


        for (int i = 0; i < prime_numbers.size(); i++){
            if (prime_numbers.get(i) > num)
                return ArrayUtils.toPrimitive(prime_numbers.subList(0,i).toArray(new Integer[i]));
        }
        int last_prime_number = prime_numbers.size() == 0? 1 : prime_numbers.get(prime_numbers.size()-1);
        for (int i = last_prime_number+1; i <= num; i ++){
            if(isPrime(i))
                prime_numbers.add(i);
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(dataName)))){
            saveData(oos, prime_numbers);
        }catch( IOException e){}

        return ArrayUtils.toPrimitive(prime_numbers.toArray(new Integer[prime_numbers.size()]));
    }

    static boolean isPrime(int num){
        for(int i = 2; i < Math.sqrt(num)+1; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }

    static void saveData(ObjectOutputStream outPutStream, ArrayList<Integer> outputObject) throws IOException {
        outPutStream.writeObject(outputObject);
    }
    static ArrayList<Integer> getData(ObjectInputStream inputStream ) throws IOException, ClassNotFoundException{
        ArrayList<Integer> primes = new ArrayList<>();
        if (inputStream == null)
            return primes;
        primes = (ArrayList<Integer>)inputStream.readObject();
        return primes;
    }
    public static void main(String[] args) {
        System.out.print(Arrays.toString(prime_number_generator(100)));
    }
}
