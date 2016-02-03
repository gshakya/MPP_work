package lambda;

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
    	MethodRefPractice mref= new MethodRefPractice();
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,15,16);
        List<Integer> primeNumbers = findPrimeNumbers(numbers,  mref::isPrime);
 
        System.out.println("Prime Numbers are "+primeNumbers);
    }
 
    public  boolean isPrime(int number) {
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
 
    public static List<Integer> findPrimeNumbers(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> sortedNumbers = new ArrayList<>();
        list.stream().filter(predicate).forEach((sortedNumbers::add));
        return sortedNumbers;
 
    }
}