package bike;

public class RoadBikeBody extends BikeBody {

	private static String type = "citydrive";

	@Override
	void getInfo() {
	System.out.println("Road bike body type: " + type);
		
	}

}
