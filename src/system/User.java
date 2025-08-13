package system;

public class User {
    private String username;
    private String password;
    protected Grade grade;

    public User(String name, String password, Grade grade){
        username = name;
        this.password = password;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return username + "(" + grade + ")";
    }

    public String getUsername(){
        return username;
    }
}
