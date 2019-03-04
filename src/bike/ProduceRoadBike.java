package bike;

public class ProduceRoadBike extends ProduceBike{

	@Override
	public BikeParts create(String type) {
        if (type.equalsIgnoreCase("wheel")) {
            return new RoadBikeWheel();
        } else if (type.equalsIgnoreCase("body")) {
            return new RoadBikeBody();
        } else if (type.equalsIgnoreCase("battery")) {
            return new RoadBikeBat();
        }else {
            return null;

        }
	}
}
