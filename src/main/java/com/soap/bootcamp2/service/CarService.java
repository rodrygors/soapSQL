package com.soap.bootcamp2.service;

import com.soap.bootcamp2.model.Car;
import com.soap.bootcamp2.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService{

    private static final Map<Integer, Car> cars = new HashMap<>();

    @PostConstruct
    public void initialize() {
        Car car1 = new Car();
        car1.setCarId(1);
        car1.setModel("M2");
        car1.setBrand("BMW");

        Car car2 = new Car();
        car2.setCarId(2);
        car2.setModel("Class A");
        car2.setBrand("Mercedes");

        Car car3 = new Car();
        car3.setCarId(3);
        car3.setModel("Yaris");
        car3.setBrand("Toyota");;

        cars.put(car1.getCarId(), car1);
        cars.put(car2.getCarId(), car2);
        cars.put(car3.getCarId(), car3);
    }

    public Car getCar(int id) {
        System.out.println(id);
        return cars.get(id);
    }
}
