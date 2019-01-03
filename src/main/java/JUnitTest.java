import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class JUnitTest {


    TMDBController tmdbController = new TMDBController();

    @Test
    public void testTMDBController() {
        assertNotNull("No Connection to tmdb", tmdbController.resultJSONArray("test"));
    }

    @Test
    public void testMySQLDB() {
        try {
            DBConnector.connect();
            assertNotNull("No Connection to tmdb", DBConnector.getConnection());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}