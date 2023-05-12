package BikeDetails;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BikeImpl implements BikeInterface
{
    private Map<String, Bike> bikeMap=new HashMap<String, Bike>();

    @Override
    public void createbikeInfo(String color, String brandName, String chasisNumber, List<String> featureList) {
        Bike bike = new Bike(color,brandName,chasisNumber,featureList);
        bikeMap.put(bike.getChasisNumber(),bike);

    }

    public void showBikes()
    {
        for (Bike caa : bikeMap.values()) {
                System.out.println(caa.getColor() + " " + caa.getBrandName() + " " + caa.getChasisNumber() + " " + caa.getFeatures());
            }

    }
}