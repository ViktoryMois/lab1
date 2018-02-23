import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Applic extends AbstractModel{
    private Map<Enum,Integer> mark= new HashMap<Enum, Integer>();
    private String abname;
    private  Faculties fac;
    Applic(Abiturient one){
        abname= one.getName();
        mark= one.getMarks();
    }

    @Override
    public String toString() {
        return "Applic{" +
                "mark=" + mark +
                ", abname='" + abname + '\'' +
                ", fac=" + fac +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Applic)) return false;
        Applic applic = (Applic) o;
        return Objects.equals(mark, applic.mark) &&
                Objects.equals(abname, applic.abname) &&
                fac == applic.fac;
    }

    @Override
    public int hashCode() {

        return Objects.hash(mark, abname, fac);
    }
}
