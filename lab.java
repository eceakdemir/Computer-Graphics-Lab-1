

package lab1;

public class lab {
	static boolean isPrime(int number){
		if (number == 2)
			return true;
		for (int i=2 ; i < (number/2) + 1 ; i++){
			if(number % i == 0)
				return false;
		}
		return true;
	}
		
	static void fizzBuzz(int number){
		for(int x=1 ; x < number+1 ; x++){
			if (x % 3 == 0)
				System.out.println("fizz");
			else if(x % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(x);
		}
	}
	
	static void optimusPrime(int number){
		for ( int x=1 ; x < number + 1; x++){
			if(x==1)
				System.out.println(x);
			else if(isPrime(x) && (x % 3 == 0 || x % 5 == 0))
				System.out.println("optimusPrime");
			else if(isPrime(x))
				System.out.println("Prime");
			else if (x % 3 == 0)
				System.out.println("fizz");
			else if(x % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(x);
		}
	}
	public static void main(String[] args) {
		//fizzBuzz(100);
		optimusPrime(100);
	}

}
