package epam.CleanCode;

public class Calculate {

	
	public float compute_simpleinterest(int principal, int time, int interest) {
		float result = (principal*time*interest)/100;
		return result;
	}

	
	public double compute_compoundinterest(int principal, int time, float interest) {
		double result = principal*Math.pow(1+interest/100, time)-principal;
		return Math.ceil(result);
	}

}
