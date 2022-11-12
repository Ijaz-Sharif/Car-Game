package com.roam.cargame.Model;

public class Car {

    int carPic;
    String carName;

    public Car(int carPic, String carName) {
        this.carPic = carPic;
        this.carName = carName;
    }
    public Car(String carName) {
        this.carName = carName;
    }

    public int getCarPic() {
        return carPic;
    }

    public String getCarName() {
        return carName;
    }
}
