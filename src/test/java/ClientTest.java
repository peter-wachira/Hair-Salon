import org.junit.Rule;
import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
public class ClientTest {
    @Rule
    public DatabaseRule database = new DatabaseRule();

    //testing save method
    @Test
    public void savingClient_true() {
        Client client = new Client("Victor","M","234", 2);
        client.save();
        assertEquals("Victor", client.getName());
    }




}
