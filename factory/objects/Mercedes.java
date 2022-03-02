package factory.objects;

public class Mercedes implements Car {
    @Override
    public void milage() {
        System.out.println("50.02");
        
    }
    @Override
    public void name() {
        System.out.println("Mercedes");
        
    }
}
