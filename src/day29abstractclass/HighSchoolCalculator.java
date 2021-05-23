package day29abstractclass;

public class HighSchoolCalculator extends Operations{

	@Override
	public int add(int... a) {
		
		int sum = 0;
		for(int w : a) {
			sum += w;
		}
		return sum;
	}

	@Override
	public int subtract(int... a) {
		
		int diff = 0;
		for ( int w : a) {
			diff -= w;
		}
		return diff;
	}

	@Override
	public int division(int a, int b) {
		return a/b;
	}

	@Override
	public int multiplication(int... a) {
		
		int prod = 1;
		for ( int w : a) {
			prod *= w;
		}
		return prod;
	}

	@Override
	public double sqrt(int a) {
		System.out.println("High school root method...");
		return super.sqrt(a);
	}
}