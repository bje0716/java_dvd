package com.gf.dvd.controllers;

import com.gf.dvd.MainClass;
import com.gf.dvd.datas.User;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class UserController {

    private static final int MENU_CREATE = 1;
    private static final int MENU_INSERT = 2;
    private static final int MENU_DELETE = 3;
    private static final int MENU_PRINT = 4;
    private static final int MENU_RETURN = 5;
    private static final int MENU_OUT = 6;

    public static ArrayList<User> users;
    public static Scanner sc;

    public UserController() {
        users = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public static void menuPrint() {
        while (true) {
            System.out.println("=====================");
            System.out.println("     고객관리 메뉴");
            System.out.println("=====================");
            System.out.println();

            System.out.println("1. 고객정보 입력 2. 고객정보 수정 3. 고객정보 삭제 4. 고객정보 조회 5. 메인메뉴 돌아가기 6. 종료");
            System.out.printf("입력 > ");
            int sec = Integer.parseInt(sc.nextLine());

            if (sec == MENU_CREATE) {
                System.out.println("고객정보 생성기능 호출");
                System.out.println();
                userAdd();
                break;
            } else if (sec == MENU_INSERT) {
                System.out.println("고객정보 수정기능 호출");
                System.out.println();
                userInsert();
                break;
            } else if (sec == MENU_DELETE) {
                System.out.println("고객정보 삭제기능 호출");
                System.out.println();
                userDelete();
                break;
            } else if (sec == MENU_PRINT) {
                System.out.println("고객정보 조회기능 호출");
                System.out.println();
                userPrint();
                break;
            } else if (sec == MENU_RETURN) {
                System.out.println("메인메뉴 호출");
                System.out.println();
                new MainClass().showMenu();
                break;
            } else if (sec == MENU_OUT) {
                System.out.println("프로그램 종료합니다.");
                break;
            } else if (sec > MENU_OUT || sec < 0 || sec == 0) {
                System.out.println("잘못 입력되었습니다. 다시 입력하세요.");
                System.out.println();
            }
        }
    }

    public static void userAdd() {
        User user = new User();
        int cnt = 0;

        String name;
        String email;
        String password;
        String tel;
        int age;
        String address;

        while (true) {
            System.out.println((cnt + 1) + "번째 회원정보 입력");
            System.out.printf("이름 입력 : ");
            name = sc.nextLine();
            System.out.println("이름 : " + name);
            System.out.println();

            System.out.printf("이메일 입력 : ");
            email = sc.nextLine();
            System.out.println("이메일 : " + email);
            System.out.println();

            System.out.printf("비밀번호 입력 : ");
            password = sc.nextLine();
            System.out.println("비밀번호 (암호화) : " + sha256(password));
            System.out.println();

            System.out.printf("연락처 입력 : ");
            tel = sc.nextLine();
            System.out.println("연락처 : " + tel);
            System.out.println();

            System.out.printf("나이 : ");
            age = Integer.parseInt(sc.nextLine());
            System.out.println("나이 : " + age);
            System.out.println();

            System.out.printf("주소 : ");
            address = sc.nextLine();
            System.out.println("주소 : " + address);
            System.out.println();

            // 회원추가
            user.setName(name);
            user.setEmail(email);
            user.setAge(age);
            user.setJoinedDate(System.currentTimeMillis());
            user.setAddress(address);
            user.setPassword(sha256(password));
            user.setTel(tel);
            user.setUserRating("일반회원"); // 기본값 : 일반회원
            user.setUserNumber(getUserNumber(cnt));

            users.add(user);
            users.add(new User());

            System.out.println("회원추가를 계속할까요? 1 : 계속 0 : 종료");
            System.out.printf("입력 > ");
            int addUserValue = Integer.parseInt(sc.nextLine());
            if (addUserValue == 1) {
                cnt++;
            } else if (addUserValue == 0) {
                System.out.println("회원추가 기능 종료");
                System.out.println();
                menuPrint();
                break;
            }
        }


    }

    public static String sha256(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(password.getBytes());
            return byteToHex(digest.digest());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String byteToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

    public static String getUserNumber(int cnt) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyy");
        StringBuilder builder = new StringBuilder();
        builder.append(sdf.format(System.currentTimeMillis())); // long타입 현재시간
        builder.append(String.format("%02d", cnt+1)); // 1 -> 01
        return builder.toString(); // 21091501
    }

    public static void userInsert() {
        if (users.isEmpty()) {
            System.out.println("수정할 고객정보가 없습니다.");
        }
    }

    public static void userDelete() {
        if (users.isEmpty()) {
            System.out.println("삭제할 고객정보가 없슴니다.");
            menuPrint();
        }
    }

    public static void userPrint() {
        if (users.isEmpty()) {
            System.out.println("출력할 고객정보가 없습니다.");
            System.out.println();
            menuPrint();
        } else {
            System.out.println("=====================");
            System.out.println("     고객정보 조회");
            System.out.println("=====================");
            System.out.println();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
            for (int i = 0; i < users.size(); i++) {
                System.out.println((i+1) + ". " + users.get(i).getName() + " (" + users.get(i).getUserNumber() + ")");
                System.out.println("회원등급 : " + users.get(i).getUserRating());
                System.out.println("이메일 : " + users.get(i).getEmail());
                System.out.println("연락처 : " + users.get(i).getTel());
                System.out.println("주소 : " + users.get(i).getAddress());
                System.out.println("가입시간 : " + sdf.format(users.get(i).getJoinedDate()));
            }
            System.out.println();
            menuPrint();
        }
    }

    public static ArrayList<User> getUsers() {
        return users;
    }
}
