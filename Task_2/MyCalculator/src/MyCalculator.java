public class MyCalculator {

	/**
	 * returns sum of two numbers
	 * @param x
	 * @param y 
	 * @return int
	 */
	public int Add(int x , int y) {
		return x+y;
	}
	/**
	 * returns product of two numbers
	 * @param x 
	 * @param y
	 * @return int multiplication of two numbers
	 */
	public int Multiply(int x , int y) {
		return x*y;
	}
	/**
	 * @param x
	 * @param y
	 * @return double a divides b
	 */
	public double Divide(int x, int y) {
		if(y==0)
			throw new ArithmeticException("Cannot divide by zero");
		else
			return x/(double)y;
	}
}