import java.util.*;

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

    @Override
    public String toString() {
        return "Statement{" +
                "students=" + students +
                ", nostudents=" + nostudents +
                ", applic=" + applic +
                ", ProhBal=" + ProhBal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Statement)) return false;
        Statement statement = (Statement) o;
        return Objects.equals(students, statement.students) &&
                Objects.equals(nostudents, statement.nostudents) &&
                Objects.equals(applic, statement.applic) &&
                Objects.equals(ProhBal, statement.ProhBal);
    }

    @Override
    public int hashCode() {

        return Objects.hash(students, nostudents, applic, ProhBal);
    }
}
