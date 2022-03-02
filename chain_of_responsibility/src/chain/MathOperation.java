package chain;

import model.Request;

public interface MathOperation {
    public void setNextHandler(MathOperation handler);
    public void process(Request request);
}
