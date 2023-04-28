package mini.project.car;

import java.util.*;

public class NewCarMain
{
    public static void main(String[] args)
    {
        Map<String, NewCar> carMap=new HashMap<String, NewCar>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars:");
        int noOfCars = sc.nextInt();
        for(int i = 1; i<=noOfCars ; i++) {
            NewCar newCar = new NewCar();
            System.out.println("Enter the colour of car:");
            String color = sc.next();
            newCar.setColor(color);
            System.out.println("Enter the brandName of car:");
            String brandName = sc.next();
            newCar.setBrandName(brandName);
            System.out.println("Enter the chasis Number of car:");
            String chasisNumber = sc.next();
            newCar.setChasisNumber(chasisNumber);
            List<String> featureList = new ArrayList<>();
            System.out.println("Enter the number of Car Feature List:");
            int count = sc.nextInt();
            for(int j=1;j<=count;j++)
            {
                System.out.println("Enter the Feature:"+j);
                String feature=sc.next();
                featureList.add(feature);
            }
            newCar.setFeatures(featureList);
            carMap.put(chasisNumber, newCar);
            System.out.println("The "+ newCar.getBrandName()+ " " + "car has been added successfully");
        }
//        System.out.println(carMap.keySet());
//        System.out.println(carMap.values());
        for(NewCar caa : carMap.values())
        {
            System.out.println(caa.getColor()+" "+caa.getBrandName()+" "+caa.getChasisNumber()+" "+caa.getFeatures());
        }
//
    }
}



