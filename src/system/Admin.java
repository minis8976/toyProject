package system;

public class Admin extends User{
    protected UserSystem userSystem;

    public Admin(String username, String password){
        super(username, password, Grade.ADMIN);
        this.userSystem = new UserSystem();
        userSystem.addUser(this);
    }

    public void createUser(String username, String password){
        User user = new User(username, password, Grade.BRONZE);
        userSystem.addUser(user);
    }

    public void upgradeUser(int index, Grade newGrade){
        userSystem.changeUserGrade(index, newGrade);
    }
}
