import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodRefPractice {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,15,16);
        List<Integer> primeNumbers = findPrimeNumbers(numbers,  MethodRefPractice::isPrime);
 
        System.out.println("Prime Numbers are "+primeNumbers);
    }
 
    public boolean isPrime(int number) {
        if(number == 1 ){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }
 
    public static List findPrimeNumbers(List<Integer> list, Predicate predicate) {
        List<Integer> sortedNumbers = new ArrayList<>();
        list.stream().filter((i) ->(predicate.test(i))).forEach((i) -> {
            sortedNumbers.add(i);
        });
        return sortedNumbers;
 
    }
}