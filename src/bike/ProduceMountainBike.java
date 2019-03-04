package bike;


public class ProduceMountainBike extends ProduceBike{

	@Override
	public BikeParts create(String type) {
        if (type.equalsIgnoreCase("wheel")) {
            return new MountainBikeWheel();
        } else if (type.equalsIgnoreCase("body")) {
            return new MountainBikeBody();
        }else if (type.equalsIgnoreCase("battery")) {
                return new MountainBikeBat();
        } else {
            return null;
        }
	}
}
