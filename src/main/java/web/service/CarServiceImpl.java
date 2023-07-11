package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getSpecifiedNumberOfCars(int a) {
        List<Car> newListCar = new ArrayList<>();
        for (int i = 0; i < a; i++){
            newListCar.add(ListCar.get(i));
        }
        return newListCar;
    }

    private List<Car> ListCar;
    {
        ListCar = new ArrayList<>();
        ListCar.add(new Car("Brand 1", "Color 1", 1));
        ListCar.add(new Car("Brand 2", "Color 2", 2));
        ListCar.add(new Car("Brand 3", "Color 3", 3));
        ListCar.add(new Car("Brand 4", "Color 4", 4));
        ListCar.add(new Car("Brand 5", "Color 5", 5));
    }
}
