import java.util.ArrayList;
import java.util.List;

public class Rim {

    private String name;


    public Rim(String name) {
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
        return "Rim{" +
                "name='" + name + '\'' +
                '}';
    }
}
