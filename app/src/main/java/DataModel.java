import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class DataModel extends RealmObject {
    // on below line we are creating our variables
    // and with are using primary key for our id.
    @PrimaryKey
    private long id;
    private String upcA;
    private String upcB;
    private String brand;
    private String name;

    // on below line we are
    // creating an empty constructor.
    public DataModel() {
    }

    // below line we are
    // creating getter and setters.
    public String getUpcA() {
        return upcA;
    }

    public void setUpcA(String upcA) {
        this.upcA = upcA;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUpcB() {
        return upcB;
    }

    public void setUpcB(String upcB) {
        this.upcB = upcB;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

