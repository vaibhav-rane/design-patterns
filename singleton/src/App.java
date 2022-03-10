import singleton.Connection;

public class App {
    public static void main(String[] args) throws Exception {
        Connection connection1 = Connection.getConnection("127.0.0.1:8987", "HRD", "Employee");
        Connection connection2 = Connection.getConnection("176.5.0.1:8887", "PAYROL", "Employee");
        System.out.println(connection1 == connection2); //true
    }
}
