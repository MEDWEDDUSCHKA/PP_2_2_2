package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiseImp implements CarServise {

    private List<Car> cars = Arrays.asList(
            new Car("Toyota", "red", 2015),
            new Car("Honda", "yellow", 2011),
            new Car("BMW", "green", 2002),
            new Car("Mercedes", "blue", 2020),
            new Car("Subaru", "black", 2018)
    );
    @Override
    public List<Car> getCars(Integer count) {
        int carCount = (count == null || count <= 0) ? 5 : count;
        if (carCount >= cars.size()){
            return cars;
        }
        return cars.subList(0, carCount);
    }

}
