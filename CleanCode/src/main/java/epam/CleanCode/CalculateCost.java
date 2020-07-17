package epam.CleanCode;

public class CalculateCost {

	public int compute_cost(String material_type, int areaOfHouse) {
		
		int costperSquareFoot=0;
		
		switch(material_type) {
		case "StandardMaterial": costperSquareFoot= 1200;
		break;
		
		case "AboveStandardMaterial" : costperSquareFoot=1500;
		break;
		
		case "HighStandardMaterial" : costperSquareFoot = 1800;
		break;
		
		case "HighStandardMaterial_AutomatedHome" : costperSquareFoot=2500;
		break;
				
		}
		
		int ConstructionCost = costperSquareFoot*areaOfHouse;
		return ConstructionCost;
	}

}
