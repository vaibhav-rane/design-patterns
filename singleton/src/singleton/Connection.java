package singleton;

public class Connection {
    private String dbUrl;
    private String dbName;
    private String schemaName;
    
    private static Connection connection;

    private Connection(){}

    public static Connection getConnection(String dbUrl, String dbName, String schemaName){
        if(connection == null){
            connection = new Connection();
            connection.setDbName(dbName);
            connection.setDbUrl(dbUrl);
            connection.setSchemaName(schemaName);
        }
        return connection;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Override
    public String toString() {
        return "Connection [dbName=" + dbName + ", dbUrl=" + dbUrl + ", schemaName=" + schemaName + "]";
    }
    
}
