package BikeDetails;

import java.util.*;

public class BikeUI {

     Scanner sc = new Scanner(System.in);
     BikeInterface biker = new BikeImpl();

     public void menu()
     {
         int menuList = 0;
         do{
             System.out.println("Select any option");
             System.out.println("1.Add Bike");
             System.out.println("2.Show Bike");
             System.out.println("3.Exit");
             menuList = sc.nextInt();
             switch (menuList) {
                 case 1:
                     addBike();
                     System.out.println("Your bike has been registered successfully");
                     break;
                 case 2:
                     biker.showBikes();
                     System.out.println("This is the bike you have registered ");
                     break;
                     case 3:
                     System.out.println("Thank you for registering");
                     break;
             }
         } while (menuList != 3);

         }

         public void addBike() {
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
                 biker.createbikeInfo(color, brandName, chasisNumber, featureList);
             }

             biker.showBikes();
    }
}
