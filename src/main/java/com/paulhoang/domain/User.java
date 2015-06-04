package com.paulhoang.domain;

/**
 * Created by paul on 04/06/15.
 */
public class User {

    private boolean registered;
    private UserProfile userProfile;


    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(final boolean registered) {
        this.registered = registered;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(final UserProfile userProfile) {
        this.userProfile = userProfile;
    }
}
