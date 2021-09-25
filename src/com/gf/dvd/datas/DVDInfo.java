package com.gf.dvd.datas;

import java.util.UUID;

public class DVDInfo {

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

    public DVDInfo() {
    }

    public DVDInfo(int dvdNumber, UUID isbn, int launchYear, String dvdName, String production, String genre, int rentalCount, float dvdRating, boolean isRental, String rentalName) {
        this.dvdNumber = dvdNumber;
        this.isbn = isbn;
        this.launchYear = launchYear;
        this.dvdName = dvdName;
        this.production = production;
        this.genre = genre;
        this.rentalCount = rentalCount;
        this.dvdRating = dvdRating;
        this.isRental = isRental;
        this.rentalName = rentalName;
    }

    public boolean isRental() {
        return isRental;
    }

    public void setRental(boolean rental) {
        isRental = rental;
    }

    public String getRentalName() {
        return rentalName;
    }

    public void setRentalName(String rentalName) {
        this.rentalName = rentalName;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public int getDvdNumber() {
        return dvdNumber;
    }

    public void setDvdNumber(int dvdNumber) {
        this.dvdNumber = dvdNumber;
    }

    public UUID getIsbn() {
        return isbn;
    }

    public void setIsbn(UUID isbn) {
        this.isbn = isbn;
    }

    public String getDvdName() {
        return dvdName;
    }

    public void setDvdName(String dvdName) {
        this.dvdName = dvdName;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRentalCount() {
        return rentalCount;
    }

    public void setRentalCount(int rentalCount) {
        this.rentalCount = rentalCount;
    }

    public float getDvdRating() {
        return dvdRating;
    }

    public void setDvdRating(float dvdRating) {
        this.dvdRating = dvdRating;
    }
}
