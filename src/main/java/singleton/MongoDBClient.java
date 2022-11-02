package singleton;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;


public class MongoDBClient {
    public static MongoDBClient client = null;
    public static MongoClient mongoClient;

    private MongoDBClient()
    {
        try
        {

            mongoClient = MongoClients.create(System.getProperty("mongodb.uri"));

        }
        catch( MongoException me)
        {
            me.getStackTrace();
        }
    }
    public static MongoDBClient getClient()
    {
        if (client == null){
            System.out.println("Primera vez");
            client = new MongoDBClient();
        }

        return client;
    }

    public long getData(){
        return this.mongoClient.getDatabase("myFirstDatabase").getCollection("bootcamp").countDocuments();
    }
}
