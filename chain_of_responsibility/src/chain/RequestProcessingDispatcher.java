package chain;

import model.Request;

public class RequestProcessingDispatcher {
    // Creating a processing chain
    private MathOperation addition = new Add();
    private MathOperation subtract = new Subtract();
    private MathOperation multiply = new Multiply();
    private MathOperation divide = new Division();
    
    public RequestProcessingDispatcher() {
        this.addition = new Add();
        this.subtract = new Subtract();
        this.multiply = new Multiply();
        this.divide = new Division();

        addition.setNextHandler(subtract);
        subtract.setNextHandler(multiply);
        multiply.setNextHandler(divide);
        divide.setNextHandler(null);
    }

    public void dispatch(Request request){
        addition.process(request);
    }
}
