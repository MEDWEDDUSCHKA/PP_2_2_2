package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
@Service
public interface Carservise {
    List<Car> getCars(int count);

}
