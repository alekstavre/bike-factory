package bike;

public class MountainBikeWheel extends BikeWheel{

	private static final String width = "wide";
	private static final String model = "cross";
	
	@Override
	void getInfo() {
		 System.out.println("Mountain bike tire. Width: " + width + ", model: " + model);		
	}
	
	
 
}
