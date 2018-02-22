import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Statement extends AbstractModel {
    private List<Abiturient> students = new ArrayList<Abiturient>();
    private List<Abiturient> nostudents = new ArrayList<Abiturient>();
    private List<Applic> applic = new ArrayList<Applic>();
    private Map<Enum,Integer> ProhBal = new HashMap<Enum, Integer>();
    public void acceptStudent(Abiturient one) {
        students.add(one);
    }
    public void delayStudent(Abiturient one) {
        nostudents.add(one);
    }
    public void appStudent(Applic one) {
        applic.add(one);
    }
    Statement(Applic one){

    }

}
