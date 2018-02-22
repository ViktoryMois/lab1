import java.util.HashMap;
import java.util.Map;

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
}


