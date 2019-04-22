import java.util.List;
import org.sql2o.*;

public class Client {
    private int id;
    private String name;
    private String gender;
    private String contact;
    private int stylist_id;

    public Client(String name, String gender, String contact, int stylist_id) {
        this.name = name.toUpperCase();
        this.gender = gender;
        this.contact = contact;
        this.stylist_id = stylist_id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }


}