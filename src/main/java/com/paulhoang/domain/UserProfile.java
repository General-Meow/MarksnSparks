package com.paulhoang.domain;

import java.util.List;

/**
 * Created by paul on 04/06/15.
 */
public class UserProfile {

    private List<MoviePurchase> boughtMovies;
    private int discountRate;

    public List<MoviePurchase> getBoughtMovies() {
        return boughtMovies;
    }

    public void setBoughtMovies(final List<MoviePurchase> boughtMovies) {
        this.boughtMovies = boughtMovies;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(final int discountRate) {
        this.discountRate = discountRate;
    }
}
