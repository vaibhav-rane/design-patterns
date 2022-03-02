package factory.factory;

import factory.objects.Car;
import factory.objects.Ford;
import factory.objects.Honda;
import factory.objects.Mercedes;

public class CarFactory {
    public Car createCar(Cars car){
        switch (car) {
            case FORD:
                return new Ford();
            case HONDA:
                return new Honda();    
            case MERC:
                return new Mercedes();
            default:
                break;
        }
    return null;
    }
}
