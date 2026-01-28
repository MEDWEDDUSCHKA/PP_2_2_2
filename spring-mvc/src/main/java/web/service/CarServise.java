package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
@Service
public interface CarServise {
    List<Car> getCars(Integer count);

}
