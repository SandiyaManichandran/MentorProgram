package vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarUI {
    public void data() {
        CarServiceImpl impl = new CarServiceImpl();
        List<Car> carList = new ArrayList<>();
        carList = impl.addCar();
        impl.showCar(carList);
    }
}






//    Scanner sc = new Scanner(System.in);
//    public void data()
//    {
//        CarServiceImpl impl = new CarServiceImpl();
//        List<Car> carList = new ArrayList<>();
//        System.out.println("Enter the number of cars:");
//        int noOfCars = sc.nextInt();
//        for (int i = 1; i <= noOfCars; i++) {
//            Car car = new Car();
//            car.setColor(getcolor());
//            carList = impl.addCar(car);
//        }
//
//        impl.showCar(carList);
//    }
//
//    public String getcolor()
//    {
//        System.out.println("Enter the colour of car:");
//        String color = sc.next();
//        return color;
//    }
//}
