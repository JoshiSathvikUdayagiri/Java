package basics;


public class PrimeNumbers {
	public static void main(String[] args) {
		int n = 100;
		boolean isPrim = isPrime(n);
		System.out.println();
		if(isPrim) {
			System.out.println(n + " is a prime number");
		}
		else {
            System.out.println(n + " is not a prime number");
        }
	}
	public static void name() {
		
	}

    private static boolean isPrime(int n) {
		return true;
    }
}