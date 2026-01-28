package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiseImp implements Carservise {

    private List<Car> cars = Arrays.asList(
            new Car("Toyota", "red", 2015),
            new Car("Honda", "yellow", 2011),
            new Car("BMW", "green", 2002),
            new Car("Mercedes", "blue", 2020),
            new Car("Subaru", "black", 2018)
    );
    @Override
    public List<Car> getCars(int count) {
        int carCount = (count <= 0) ? 5 : count;
        if (carCount >= cars.size()){
            return cars;
        }
        return cars.subList(0, carCount);
    }

}
