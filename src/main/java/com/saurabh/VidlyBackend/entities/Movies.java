package com.saurabh.VidlyBackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movies {


    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }

    public int getDailyRentalRate() {
        return dailyRentalRate;
    }

    public void setDailyRentalRate(int dailyRentalRate) {
        this.dailyRentalRate = dailyRentalRate;
    }

    private String title;

    private int numberInStock;

    private int dailyRentalRate;
    public Movies(String id, String title, int numberInStock, int dailyRentalRate) {
        this.id = id;
        this.title = title;
        this.numberInStock = numberInStock;
        this.dailyRentalRate = dailyRentalRate;
    }
}
