
public class JourneyCalculator {
public static void main(String []args) {
	JourneyCalculator journeyCalculator = new JourneyCalculator();

	 double res1=journeyCalculator.calculateDistance(60.0, 1.5);
	  System.out.printf("%.2f",res1);
}
public double calculateDistance(double speed, double time)
{
	return speed*time;
	}

}
