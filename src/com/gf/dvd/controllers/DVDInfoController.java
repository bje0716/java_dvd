package com.gf.dvd.controllers;

import com.gf.dvd.datas.DVDInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class DVDInfoController {

    /*
    private int dvdNumber; // dvd 번호
    private UUID isbn; // isbn
    private int launchYear; // 출시년
    private String dvdName; // dvd 이름
    private String production; // 제작사
    private String genre; // dvd 장르
    private int rentalCount; // 전체 대여횟수
    private float dvdRating; // 평점
    private boolean isRental; // 대여여부
    private String rentalName; // 현재 대여중인 회원
     */

    private static Scanner sc;
    private static ArrayList<DVDInfo> infos;

    public DVDInfoController(Scanner sc) {
        this.sc = sc;
    }
}
