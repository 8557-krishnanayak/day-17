package ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class DBPoolConnection {
    static List<DBConnection> freeConnectionInPool = new ArrayList<>();
    static List<DBConnection> connectionsInUse = new ArrayList<>();

    int INITIAL_POOL_SIZE = 3;
    int MAX_POOL_SIZE = 6;

    private static DBPoolConnection instance = null;

    private DBPoolConnection() {
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            freeConnectionInPool.add(new DBConnection());
        }
    }

    public static DBPoolConnection getDBPoolConnection() {
        if (instance == null) {
            synchronized (DBPoolConnection.class) {
                if (instance == null) {
                    instance = new DBPoolConnection();
                }
            }
        }
        return instance;
    }


    public DBConnection getDBConnection() {

        if (freeConnectionInPool.isEmpty() && connectionsInUse.size() < MAX_POOL_SIZE) {
            freeConnectionInPool.add(new DBConnection());
            System.out.println("\nCreating new connection and putting into pool, free  pool size\t" + freeConnectionInPool.size());
        } else if (freeConnectionInPool.isEmpty()) {
            System.out.println("\ncan't create new DBConnection, as max is pool size reach");
            return null;
        }
        DBConnection connection = freeConnectionInPool.remove(freeConnectionInPool.size() - 1);
        connectionsInUse.add(connection);
        System.out.println("Adding db into the Current use Pool, size\t" + connectionsInUse.size() + "\n");
        return connection;
    }

    public static void releaseDBConnection(DBConnection dbConnection) {
        if (dbConnection == null) return;

        connectionsInUse.remove(dbConnection);
        System.out.println("Removing DB connection form use pool, size\t" + connectionsInUse.size());
        freeConnectionInPool.add(dbConnection);
        System.out.println("Adding DB connection on free pool, size\t" + freeConnectionInPool.size());
    }

}
