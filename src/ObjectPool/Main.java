package ObjectPool;

public class Main {

    public static void main(String[] args) {
        DBPoolConnection dbPoolConnection = DBPoolConnection.getDBPoolConnection();

        DBConnection dbConnection = dbPoolConnection.getDBConnection();
        DBConnection dbConnection1 = dbPoolConnection.getDBConnection();
        DBConnection dbConnection2 = dbPoolConnection.getDBConnection();
//        DBPoolConnection.releaseDBConnection(dbConnection1);

        DBConnection dbConnection3 = dbPoolConnection.getDBConnection();
        DBConnection dbConnection4 = dbPoolConnection.getDBConnection();
        DBConnection dbConnection5 = dbPoolConnection.getDBConnection();
        DBConnection dbConnection6 = dbPoolConnection.getDBConnection();

        System.out.println("0987654321");
        DBPoolConnection.releaseDBConnection(dbConnection1);

        DBConnection dbConnection7 = dbPoolConnection.getDBConnection();
        DBPoolConnection.releaseDBConnection(dbConnection);

    }
}
