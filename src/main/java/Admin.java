public class Admin extends AbstractModel {

    private String password;
    private String login;

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
