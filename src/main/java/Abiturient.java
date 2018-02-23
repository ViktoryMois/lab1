import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Abiturient extends AbstractModel{
   // private Subjects marks;
    private String name;
    private Map<Enum,Integer> mark= new HashMap<Enum,Integer>();

    public String getName (){
         return name;
    }

    Abiturient(String name){
        super();

        this.name= name;
    }
    public Map<Enum,Integer> getMarks(){
        return mark;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abiturient)) return false;
        Abiturient that = (Abiturient) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), mark);
    }
}


