package vehicle;

import mini.project.car.NewCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarUI
{
    public void data()
    {
        CarServiceImpl impl = new CarServiceImpl();
        List<Car> carList = new ArrayList<>();
        carList = impl.addCar();
        impl.showCar(carList);
    }
}
