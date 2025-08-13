package system;

import java.util.Scanner;

public class SystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin("master", "1234");

        while (true){
            System.out.println("\n==메뉴==");
            System.out.println("1. 유저 추가");
            System.out.println("2. 유저 목록 보기");
            System.out.println("3. 유저 등급 변경 (Admin)");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1){
                System.out.print("유저 이름: ");
                String name = sc.nextLine();
                System.out.print("비밀번호: ");
                String pw = sc.nextLine();
                admin.createUser(name, pw);
            }

            else if (menu == 2){
                admin.userSystem.listUsers();
            }
            else if (menu == 3){
                admin.userSystem.listUsers();
                System.out.print("변경할 유저 번호: ");
                int idx = sc.nextInt();
                sc.nextLine();
                System.out.print("새 등급 (BRONZE/SILVER/GOLD) : ");
                String gradeStr = sc.nextLine().toUpperCase();
                try{
                    Grade grade = Grade.valueOf(gradeStr);
                    admin.upgradeUser(idx, grade);
                } catch (IllegalArgumentException e){
                    System.out.println("잘못된 등급입니다.");
                }
            } else if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }
        sc.close();
    }
}
