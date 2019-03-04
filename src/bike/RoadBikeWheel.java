package bike;


	public class RoadBikeWheel extends BikeWheel{

		private static final String width = "slim";
		private static final String model = "road";
		
		@Override
		void getInfo() {
			 System.out.println("Road bike tire. width: " + width + ", model: " + model);		
		}
		
		
	 
	}

