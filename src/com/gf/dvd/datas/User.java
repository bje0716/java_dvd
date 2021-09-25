package com.gf.dvd.datas;

public class User {

    private String name; // 이름
    private String email; // 이메일
    private String password; // 비번
    private String userRating; // 회원등급
    private String tel; // 연락처
    private long joinedDate; // 가입날짜
    private String userNumber; // 회원번호 - 자동생성 (21091301)
    private int age; // 나이
    private String address; // 주소

    public User() {}

    public User(String name, String email, String password, String userRating, String tel, long joinedDate, String userNumber, int age, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRating = userRating;
        this.tel = tel;
        this.joinedDate = joinedDate;
        this.userNumber = userNumber;
        this.age = age;
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }

    public long getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(long joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
