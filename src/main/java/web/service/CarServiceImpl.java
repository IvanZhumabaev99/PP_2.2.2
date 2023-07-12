package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carList = List.of(
        new Car("Brand 1", "Color 1", 1),
        new Car("Brand 2", "Color 2", 2),
        new Car("Brand 3", "Color 3", 3),
        new Car("Brand 4", "Color 4", 4),
        new Car("Brand 5", "Color 5", 5)
    );

    @Override
    public List<Car> getSpecifiedNumberOfCars(int count) {
        if (count >= carList.size() || count < 0) {
            return carList;
        }
            return carList.stream()
                    .limit(count)
                    .collect(Collectors.toList());
    }
}