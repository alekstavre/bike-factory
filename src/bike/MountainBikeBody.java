package bike;

public class MountainBikeBody extends BikeBody{

	private static String type = "crosscountry";

	@Override
	void getInfo() {
	System.out.println("Mountain bike body type: " + type);
		
	}
	}

