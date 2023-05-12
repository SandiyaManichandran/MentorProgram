package BikeDetails;

import java.util.*;

public class BikeUI {
    private Map<String, Bike> bikeMap=new HashMap<String, Bike>();



     Scanner sc = new Scanner(System.in);
     BikeInterface biker = new BikeImpl();
    public void inputDetails()
    {
        System.out.println("Enter the number of bikes:");
        int noOfCars = sc.nextInt();
        for (int i = 1; i <= noOfCars; i++) {
            System.out.println("Enter the colour of bike:");
            String color = sc.next();
            System.out.println("Enter the brandName of bike:");
            String brandName = sc.next();
            System.out.println("Enter the chasis Number of bike:");
            String chasisNumber = sc.next();
            List<String> featureList = new ArrayList<>();
            System.out.println("Enter the number of bike Feature List:");
            int count = sc.nextInt();
            for (int j = 1; j <= count; j++) {
                System.out.println("Enter the Feature:" + j);
                String feature = sc.next();
                featureList.add(feature);
            }
              biker.createbikeInfo(color,brandName,chasisNumber,featureList);
        }
        biker.showBikes();
    }
}
