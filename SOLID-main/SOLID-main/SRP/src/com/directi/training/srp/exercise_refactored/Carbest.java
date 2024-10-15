package com.directi.training.srp.exercise_refactored;


import java.util.List;

public class Carbest
{
	

    public static Car getBestCar(CarManager carManager)
    {
        List<Car> cars = carManager.getCarsDb(); 
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
