package basics;

// This is a efficient method to count the factors of a number.
    // The time complexity of this method is O(sqrt(n)).
    // The space complexity is O(1).
    // This method works by checking divisibility up to the square root of the number.
    // If the number is divisible by any number, it will be counted twice.
    // If the number is divisible by the square root of itself, it will be counted once.
    // The rest of the factors will be counted once.

public class FactorCount {
	public static void main(String[] args) {
		System.out.print(name(100));
	}
	public static int name(int n) {
		int s = 0;
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0 && i*i!=n)
				s+=2;
			else if(n%i==0 && i*i==n)
				s+=1;
		}
		return s;
	}

}
