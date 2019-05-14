import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestTest {

    @BeforeClass
    public static void  setUp() throws Exception {
        MongoClient mongoClient = new MongoClient("localhost",27017);
        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("root","JavaUser",
                "password".toCharArray());
        MongoDatabase database = mongoClient.getDatabase("JavaUser");

        MongoCollection<Document> col = database.getCollection("userdob");

        try (MongoCursor<Document> cur = col.find().iterator()) {
            while (cur.hasNext()) {

                org.bson.Document doc = cur.next();

                List listDob = new ArrayList(doc.values());
                System.out.print(listDob.get(1));
                System.out.print(": ");
                System.out.println(listDob.get(2));
                System.out.print(": ");
                System.out.println(listDob.get(3));

                Document User = new Document();

            }
        }

        mongoClient.close();

    }


    @AfterClass
    public static void tearDown() throws Exception {
        //pripojenie do mongoDB
        MongoClient mongoClient = new MongoClient("localhost",27017);
        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("root","JavaUser",
                "password".toCharArray());
        MongoDatabase database = mongoClient.getDatabase("JavaUser");

        MongoCollection<Document> col = database.getCollection("userdob");

        BasicDBObject document = new BasicDBObject();

        col.deleteMany(document);

        System.out.println("deleted");

    }

    @Test
    public void checkTriangle() {
        Testing wut = new Testing();
        assertEquals(-1,wut.checkTriangle(4,5,20),0.00000000000);
        assertEquals(-1,wut.checkTriangle(4,20,8),0.00000000000);
        assertEquals(-1,wut.checkTriangle(20,5,8),0.00000000000);
        assertEquals(-1,wut.checkTriangle(4,-5,8),0.00000000000);
        assertEquals(-1,wut.checkTriangle(4,4,4),0.00000000000);
    }

    @Test
    public void formatText() {
        Testing form = new Testing();
//       assertEquals(form.formatText());
    }
}