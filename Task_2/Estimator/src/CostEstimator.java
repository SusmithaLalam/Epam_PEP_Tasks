public class CostEstimator {
	int material;
	double area;
	boolean isAutomated;
	
	/**
	 * constructor initializes class members
	 * @param material
	 * @param area
	 * @param isAutomated
	 */
	public CostEstimator(int material,double area,boolean isAutomated) {
		this.area=area;
		this.material=material;
		this.isAutomated=isAutomated;
	}
	
	/**
	 * function to calculate the cost of the house
	 * depending on the class instance data
	 * @return double cost of the house
	 */
	public double findCost() {
		int cost = 0;
		if(material==0)
			cost = 1200;
		else if(material==1)
			cost = 1500;
		else if(material==2 && isAutomated)
			cost = 2500;
		else
			cost = 1800;
		return area*cost;
	}
}