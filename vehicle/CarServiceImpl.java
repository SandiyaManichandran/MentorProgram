package vehicle;


import mini.project.car.NewCar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarServiceImpl
{
    public void mapping(List<Car> carList)
    {
        Map<String, Car> carMap=new HashMap<String, Car>();
        for(Car cab : carList) {
            carMap.put("chasis", cab);
            for (Car caa : carMap.values()) {
                System.out.println(caa.getColor() + " " + caa.getBrandName() + " " + caa.getChasisNumber() + " " + caa.getFeatures());
            }
        }
    }

}

