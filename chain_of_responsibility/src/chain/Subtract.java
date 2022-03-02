package chain;

import model.Request;

public class Subtract implements MathOperation{
    private MathOperation nextHandler;
    
    @Override
    public void setNextHandler(MathOperation handler) {
        this.nextHandler = handler;
        
    }

    @Override
    public void process(Request request) {
        if(request.getOperator().equals(Operators.SUB)){
            System.out.println("Subtraction: "+(request.getOperand1() - request.getOperand2()));
        }
        else
            nextHandler.process(request);
    }
}
