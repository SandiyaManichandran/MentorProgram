import java.util.*;

public class NewCarMain
{
    public static void main(String[] args)
    {
        Map<String,Car> carMap=new HashMap<String, Car>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars:");
        int noOfCars = sc.nextInt();
        for(int i = 1; i<=noOfCars ; i++) {
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
            for(int j=1;j<=count;j++)
            {
                System.out.println("Enter the Feature:"+j);
                String feature=sc.next();
                featureList.add(feature);
            }
            car.setFeatures(featureList);
            carMap.put(chasisNumber, car);
            System.out.println("The "+ car.getBrandName() + "car has been added successfully");
        }
//        System.out.println("==============Car1===="+carMap.keySet());
//        System.out.println("==============Car1===="+carMap.values());
        for(Car caa : carMap.values())
        {
            System.out.println(caa.getColor()+" "+caa.getBrandName()+" "+caa.getChasisNumber()+" "+caa.getFeatures());
        }
//        carMap.values().stream().forEach(a->{
//            System.out.println(a.getColor()+" "+a.getBrandName()+" "+a.getChasisNumber()+" "+a.getFeatures());
//        });
    }
}



