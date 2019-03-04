package bike;


public class Main {

	public static void main (String[] args) {
		
		MakeNewBike("road bike");
	}

	
	public static void MakeNewBike(String type) {
		
		ProduceBike bikeFactory = BikeProduction.createBikes(type); 
        BikeWheel Front = (BikeWheel) bikeFactory.create("wheel");
        Front.getInfo();
        BikeWheel Back = (BikeWheel) bikeFactory.create("wheel");
        Back.getInfo();
        BikeBody body = (BikeBody) bikeFactory.create("body");
        body.getInfo();
        BikeBat battery = (BikeBat) bikeFactory.create("battery");
        battery.getInfo();
	}
}

