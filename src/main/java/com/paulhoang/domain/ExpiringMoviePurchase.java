package com.paulhoang.domain;

import java.util.Date;

/**
 * Created by paul on 04/06/15.
 */
public class ExpiringMoviePurchase extends MoviePurchase {

    private Date expireDate;

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(final Date expireDate) {
        this.expireDate = expireDate;
    }
}
