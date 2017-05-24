package primeFactorizer;

import java.util.ArrayList;

public abstract class PrimeNumberUtilitiesClass {
	public static ArrayList<Integer> findPrimesUpToInclusive(int num){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//this loop finds primes and adds them to the list
		for(int i = 1; i <= num; i++){
			if(isPrime(i) == true){
				list.add(i);
			}
		}
		
		
		return list;
	}
	
	public static boolean isPrime(int num){
		boolean temp = true;
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				temp = false;
			}
		}
		return temp;
	}
	
	public static ArrayList<Integer> primeFactorization(int num){
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes = findPrimesUpToInclusive(num);
		
		return list;
	}
}
