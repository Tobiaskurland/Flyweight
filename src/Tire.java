import java.util.ArrayList;

public class Tire {

    private String name;


    public Tire(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "name='" + name + '\'' +
                '}';
    }
}

