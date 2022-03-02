package factory.main;

import factory.factory.CarFactory;
import factory.factory.Cars;
import factory.objects.Car;

class Main{
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car mustang = factory.createCar(Cars.FORD);
        Car civic = factory.createCar(Cars.HONDA);
        Car maybach = factory.createCar(Cars.MERC);

        mustang.name();
        mustang.milage();
        
        civic.name();
        civic.milage();

        maybach.name();
        maybach.milage();
    }
}