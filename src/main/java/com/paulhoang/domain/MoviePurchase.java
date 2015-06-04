package com.paulhoang.domain;

import java.util.Date;

/**
 * Created by paul on 04/06/15.
 */
public class MoviePurchase {

    private Movie purchasedMovie;
    private Date purchaseDate;
    private String otherDetails;

    public Movie getPurchasedMovie() {
        return purchasedMovie;
    }

    public void setPurchasedMovie(final Movie purchasedMovie) {
        this.purchasedMovie = purchasedMovie;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(final Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(final String otherDetails) {
        this.otherDetails = otherDetails;
    }
}
