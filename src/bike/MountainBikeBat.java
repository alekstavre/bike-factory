package bike;

public class MountainBikeBat extends BikeBat{

	private static String type = "extra durable";
	
	@Override
	void getInfo() {
		System.out.println("Mountain bike bat type: " + type);
		
	}

}
