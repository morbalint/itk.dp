package templatemethod;

public class HouseTemplate {
	
	void house(){
		buildFoundation();
		buildHousePillars();
		buildHouseWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	void castle(){
		buildFoundation();
		buildCastlePillars();
		buildCastleWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	protected void buildFoundation(){
		System.out.println("Build proper foundation.");
	}
	
	protected void buildWindows(){
		System.out.println("Adding Glass windows.");
	}

	protected void buildHousePillars(){
		System.out.println("Building wooden pillars.");
	}
	
	protected void buildHouseWalls(){
		System.out.println("Building walls from wood.");
	}

	protected void buildCastleWalls(){
		System.out.println("Building rock walls and dig moat.");
	}

	protected void buildCastlePillars(){
		System.out.println("Building great rock pillars and towers.");
	}
}
