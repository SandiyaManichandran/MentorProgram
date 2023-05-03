package vehicle;


import java.util.*;

public class CarServiceImpl {
    public List<Car> addCar()

    {
        List<Car> carList = new ArrayList<Car>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars:");
        int noOfCars = sc.nextInt();
        for (int i = 1; i <= noOfCars; i++) {
            Car car = new Car();
            System.out.println("Enter the colour of car:");
            String color = sc.next();
            car.setColor(color);
            System.out.println("Enter the brandName of car:");
            String brandName = sc.next();
            car.setBrandName(brandName);
            System.out.println("Enter the chasis Number of car:");
            String chasisNumber = sc.next();
            car.setChasisNumber(chasisNumber);
            List<String> featureList = new ArrayList<>();
            System.out.println("Enter the number of Car Feature List:");
            int count = sc.nextInt();
            for (int j = 1; j <= count; j++) {
                System.out.println("Enter the Feature:" + j);
                String feature = sc.next();
                featureList.add(feature);
            }
            car.setFeatures(featureList);
            carList.add(car);
        }

        return carList;
    }

    public void showCar(List<Car> carList)
    {
        Map<String, Car> carMap=new HashMap<String, Car>();
        for(Car cab : carList)
        {
            carMap.put("chasis", cab);
            for (Car caa : carMap.values())
            {
                System.out.println(caa.getColor() + " " + caa.getBrandName() + " " + caa.getChasisNumber() + " " + caa.getFeatures());
            }
        }

    }

}
//    public void mapping(List<Car> carList)
//    {
//        Map<String, Car> carMap=new HashMap<String, Car>();
//        for(Car cab : carList) {
//            carMap.put("chasis", cab);
//            for (Car caa : carMap.values()) {
//                System.out.println(caa.getColor() + " " + caa.getBrandName() + " " + caa.getChasisNumber() + " " + caa.getFeatures());
//            }
//        }
//    }
