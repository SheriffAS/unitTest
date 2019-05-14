import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Testing {

    //zratavanie stran trojuholnika
    //
    //metoda na prepisovanie cisla uctu do iban tvaru


    public double checkTriangle(double a, double b, double c) {
        float numError = -1;
        if (a + b > c || a + c > b || b + c > a) {
            return 10;
        } else {
            return numError;
        }
    }

    public String formatText(String text) {
        //prve pismeno da na velke
        if (text == null) {
            return null;
        }
        if (text.isEmpty()) {
            return text;
        }
        text = text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();

        return text;
    }

    public void mongoFormat() {


    }
}
