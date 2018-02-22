import java.io.Serializable;

public abstract class AbstractModel {
    protected Serializable Id;


    public Serializable getId() {
        return Id;
    }
}
