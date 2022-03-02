package factory.objects;

public class Ford implements Car {
    @Override
    public void milage() {
        System.out.println("10.02");
        
    }
    @Override
    public void name() {
        System.out.println("Ford");
        
    }
}
