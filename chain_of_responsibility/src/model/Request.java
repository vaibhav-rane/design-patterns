package model;

import chain.Operators;

public class Request {
    private int operand1;
    private int operand2;
    private Operators operator;
        
    public Request() {
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public Operators getOperator() {
        return operator;
    }

    public void setOperator(Operators operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Request [operand1=" + operand1 + ", operand2=" + operand2 + ", operator=" + operator + "]";
    }

}
