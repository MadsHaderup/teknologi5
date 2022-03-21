package com.example.obg.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Showing {
    @Id
    @Column(name="showingID")
    private int showingID;

    @Column(name="showing_date")
    private Date showingDate;

    @Column(name="showing_time")
    private Time showingTime;


    @ManyToOne
    @JoinColumn(name = "movieID")
    private Movie movie;

    public int getShowingID() {
        return showingID;
    }

    public void setShowingID(int showingID) {
        this.showingID = showingID;
    }

    public Date getShowingDate() {
        return showingDate;
    }

    public void setShowingDate(Date showingDate) {
        this.showingDate = showingDate;
    }

    public Time getShowingTime() {
        return showingTime;
    }

    public void setShowingTime(Time showingTime) {
        this.showingTime = showingTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Showing{" +
                "showingID=" + showingID +
                ", showingDate=" + showingDate +
                ", showingTime=" + showingTime +
                ", movie=" + movie +
                '}';
    }
}
