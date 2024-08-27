package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDAOImpl implements CarDAO {

    private List<Car> cars;

    public CarDAOImpl() {
        cars = new ArrayList<>();

        cars.add(new Car("BMW", 2019, "Black"));
        cars.add(new Car("Lada", 1992, "White"));
        cars.add(new Car("Mazda", 2012, "Red"));
        cars.add(new Car("Nissan", 2023, "Grey"));
        cars.add(new Car("KIA", 2015, "Blue"));
    }

    public List<Car> showAllCars() {
        return cars;
    }


    public List<Car> showCars(Integer count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
