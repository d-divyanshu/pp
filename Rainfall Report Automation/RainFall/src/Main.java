import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args)
			throws IOException, InvalidCityPincodeException, ClassNotFoundException, SQLException {
		RainfallReport rf = new RainfallReport();
		List<AnnualRainfall> avgli = new ArrayList<AnnualRainfall>();
		avgli = rf.generateRainfallReport("AllCityMonthlyRainfall.txt");
		List<AnnualRainfall> maxli = new ArrayList<AnnualRainfall>();
		maxli = rf.findMaximumRainfallCities();
		for (int i = 0; i < maxli.size(); i++) {
			AnnualRainfall ob = maxli.get(i);
			System.out.println("City Pincode:" + ob.getCityPincode());
			System.out.println("City Name:" + ob.getCityName());
			System.out.println("Average RainFall:" + ob.getAverageAnnualRainfall());
		}

	}

}
