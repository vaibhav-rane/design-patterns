package factory.objects;

public class Honda implements Car {
    @Override
    public void milage() {
        System.out.println("14.2");
        
    }
    @Override
    public void name() {
        System.out.println("Honda");
        
    }
}
