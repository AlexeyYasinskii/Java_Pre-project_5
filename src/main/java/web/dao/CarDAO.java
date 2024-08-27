package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> showCars(Integer count);

    public List<Car> showAllCars();
}
