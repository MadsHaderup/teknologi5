package com.example.obg.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Booking {
    @Id
    @Column(name="bookingID")
    private int bookingID;

    @Column(name="bookingname")
    private String bookingname;

    @Column(name="phonenumber")
    private String phonenumber;

    @Column(name="no_of_people")
    private int noOfPeople;

    @ManyToOne
    @JoinColumn(name = "showingID")
    private Showing showing;

    public String getBookingname() {
        return bookingname;
    }

    public void setBookingname(String bookingname) {
        this.bookingname = bookingname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public Showing getShowing() {
        return showing;
    }

    public void setShowing(Showing showing) {
        this.showing = showing;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", bookingname='" + bookingname + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", noOfPeople=" + noOfPeople +
                ", showing=" + showing +
                '}';
    }
}
