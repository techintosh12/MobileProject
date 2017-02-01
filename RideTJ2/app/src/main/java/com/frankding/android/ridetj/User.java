package com.frankding.android.ridetj;

/**
 * Created by frankding on 1/30/17.
 */

class User {

    private String Name;
    private String region;
    private String username;
    private String password;

    public User(String fullName, String region, String password,String username){
        this.Name = fullName;
        this.password = password;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public String getRegion() {
        return region;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
