package chain;

import model.Request;

public class Division implements MathOperation{
    private MathOperation nextHandler;
    
    @Override
    public void setNextHandler(MathOperation handler) {
        this.nextHandler = handler;
    }

    @Override
    public void process(Request request) {
        if(request.getOperator().equals(Operators.DIV)){
            System.out.println("Division: "+(request.getOperand1() / request.getOperand2()));
        }
        else
            System.err.println("Inavalid Operation. Only Add, Subtract, Multiply, and Divide are allowed.");;
    }
}
