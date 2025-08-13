package system;

import java.util.ArrayList;
import java.util.List;

public class UserSystem {
    private List<User> userList = new ArrayList<>();

    public void addUser(User user){
        userList.add(user);
        System.out.println(user.getUsername() + " 등록 완료");
    }

    public void listUsers(){
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(i + ". " + userList.get(i));
        }
    }

    public void changeUserGrade(int index, Grade newGrade){
        if (index >= 0 && index < userList.size()){
            userList.get(index).grade = newGrade;
            System.out.println("등급 변경 완료: " + userList.get(index));
        } else {
            System.out.println("잘못된 번호입니다.");
        }
    }
}
