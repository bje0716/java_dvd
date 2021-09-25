package com.gf.dvd.datas;

public class DVDRental {

    private String rentalName; // 대여자
    private String dvdName; // dvd 이름
    private long rentalDate; // 대여날짜
    private long returnDate; // 반납날짜
    private boolean isLatePayment; // 연체여부

    public DVDRental() {}

    public DVDRental(String rentalName, String dvdName, long rentalDate, long returnDate, boolean isLatePayment) {
        this.rentalName = rentalName;
        this.dvdName = dvdName;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.isLatePayment = isLatePayment;
    }

    public String getRentalName() {
        return rentalName;
    }

    public void setRentalName(String rentalName) {
        this.rentalName = rentalName;
    }

    public String getDvdName() {
        return dvdName;
    }

    public void setDvdName(String dvdName) {
        this.dvdName = dvdName;
    }

    public long getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(long rentalDate) {
        this.rentalDate = rentalDate;
    }

    public long getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(long returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isLatePayment() {
        return isLatePayment;
    }

    public void setLatePayment(boolean latePayment) {
        isLatePayment = latePayment;
    }
}
