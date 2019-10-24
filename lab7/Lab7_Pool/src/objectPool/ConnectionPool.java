package objectPool;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ConnectionPool {

    private int maxNumberOFConnections = 1;

    // TODO: we should store connections in a map keyed with their reusability data (url in this case).

    private Set<DBConnection> freeConnections = new HashSet<>();

    private Set<DBConnection> takenConnections = new HashSet<>();

    private static ConnectionPool instance;

    public static ConnectionPool getInstance() {
        if(instance == null){
            instance = new ConnectionPool();
        }
        return instance;
    }

    public DBConnection request(String _url) throws Exception {
        DBConnection resource = null;
        Optional<DBConnection> freeResource = freeConnections.stream().findAny();
        if(freeResource.isPresent()){
            resource = freeResource.get();
            freeConnections.remove(resource);
        }
        else if(takenConnections.size() < maxNumberOFConnections) {
            resource = new DBConnection();
        }
        else {
            throw new Exception("no more connection can be made to the database");
        }
        resource.open(_url);
        takenConnections.add(resource);
        return resource;
    }

    public void release(DBConnection connection) throws Exception {
        connection.close();
        takenConnections.remove(connection);
        freeConnections.add(connection);
    }

}
