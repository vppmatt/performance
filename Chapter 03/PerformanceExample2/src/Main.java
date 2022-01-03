public class Main {

	public static void main(String[] args) {

		Long start = System.currentTimeMillis();
		PrimeNumbers primeNumbers = new PrimeNumbers();
		int max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
		Long end = System.currentTimeMillis();
		System.out.println("Time taken : " + (end -start) + " ms.");
		while(true) {
			//this is purposely to stop the application ending so that we can use jinfo
		}
	}

}
