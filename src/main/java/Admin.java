import java.util.Objects;

public class Admin extends AbstractModel {

    private String password;
    private String login;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(password, admin.password) &&
                Objects.equals(login, admin.login);
    }

    @Override
    public int hashCode() {

        return Objects.hash(password, login);
    }

    private boolean check(String login, String password){
        if(login.equals(this.login)){
            if (password.equals(this.password)) {
                return true;
            } else {
                return  false;
            }
        }
        else {
            return false;
        }

    }


}
