import java.util.HashMap;
import java.util.Map;

public class Abiturient extends AbstractModel{
    private Subjects marks;
    private String name;
    private Map<Enum,Integer> mark= new HashMap<>();

    public String getName (){
         return name;
    }

}

