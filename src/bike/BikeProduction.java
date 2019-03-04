package bike;


public class BikeProduction {

	public static ProduceBike createBikes(String type) {
		
		if(type.equalsIgnoreCase("mountain bike")) {
            return new ProduceMountainBike();
        } else if(type.equalsIgnoreCase("road bike")) {
            return new ProduceRoadBike();
        } else {
            System.out.println("choose a bike type");
            return null;
        }
	}
	
}
