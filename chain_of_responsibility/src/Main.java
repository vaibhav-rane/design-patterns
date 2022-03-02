import chain.Operators;
import chain.RequestProcessingDispatcher;
import model.Request;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Request request = new Request();
        request.setOperand1(12);
        request.setOperand2(3);
        request.setOperator(Operators.DIV);

        //Sending object for processing
        RequestProcessingDispatcher dispatcher = new RequestProcessingDispatcher();
        dispatcher.dispatch(request);
    }
}
