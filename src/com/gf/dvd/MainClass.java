package com.gf.dvd;

import com.gf.dvd.controllers.UserController;

import java.util.Scanner;

public class MainClass {

    private static final int MENU_USER = 1;
    private static final int MENU_DVD_INFO = 2;
    private static final int MENU_DVD_RENTAL = 3;
    private static final int MENU_DVD_OVERDUE = 4;
    private static final int MENU_OUT = 5;

    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            System.out.println("========================");
            System.out.println("      DVD 프로그램");
            System.out.println("========================");
            System.out.println();

            System.out.println("1. 고객관리 2. DVD 정보관리 3. DVD 대여관리 4. 연체고객 관리 5. 종료");
            System.out.printf("입력 > ");

            int selectedMenu = Integer.parseInt(sc.nextLine());
            int result = selectMenu(selectedMenu);

            if (result == MENU_USER) {
                UserController.menuPrint();
                break;
            } else if (result > MENU_OUT || result < 0 || result == 0) {
                System.out.println("메뉴 선택을 다시 입력하세요.");
                System.out.println();

            } else if (result == MENU_OUT) {
                System.out.println("프로그램 종료합니다.");
                break;
            }
        }
    }

    public static int selectMenu(int cnt) {
        switch (cnt) {
            case MENU_USER:
                System.out.println("고객관리 메뉴 호출");
                System.out.println();
                return MENU_USER;
            case MENU_DVD_INFO:
                System.out.println("DVD 정보관리 메뉴 호출");
                System.out.println();
                return MENU_DVD_INFO;
            case MENU_DVD_RENTAL:
                System.out.println("DVD 대여관리 메뉴 호출");
                System.out.println();
                return MENU_DVD_RENTAL;
            case MENU_DVD_OVERDUE:
                System.out.println("연체고객 관리메뉴 호출");
                System.out.println();
                return MENU_DVD_OVERDUE;
            default:
                return cnt;
        }
    }
}
