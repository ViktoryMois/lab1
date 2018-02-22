import java.util.HashMap;
import java.util.Map;

public class Applic extends AbstractModel{
    private Map<Enum,Integer> mark= new HashMap<Enum, Integer>();
    private String abname;
    private  Faculties fac;
    Applic(Abiturient one){
        abname= one.getName();
        mark= one.getMarks();
    }
}
