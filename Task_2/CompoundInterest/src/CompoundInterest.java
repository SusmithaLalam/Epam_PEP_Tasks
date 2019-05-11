public class CompoundInterest {
	
	float principle,rateOfIntrest,timePeriod;
	/**
	 * constructor initializes data members of the class 
	 * @param principle
	 * @param rateOfIntrest
	 * @param timePeriod
	 */
	public CompoundInterest(float principle,float rateOfIntrest,float time) {
		this.principle=principle;
		this.rateOfIntrest=rateOfIntrest;
		this.timePeriod=time;
	}
	/**
	 * finds simple interest of the class object
	 * @return simple compound interest
	 */
	public double getSimpleInterest() {
		return (principle*timePeriod*rateOfIntrest)/100;
	}
	/**
	 * finds compound interest of the class object
	 * @return double compound interest
	 */
	public double getCompoundInterest() {
		return principle * 
                (Math.pow((1 + rateOfIntrest / 100), timePeriod));
	}
}