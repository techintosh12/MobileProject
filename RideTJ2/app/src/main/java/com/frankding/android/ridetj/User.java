package com.frankding.android.ridetj;

/**
 * Created by frankding on 1/30/17.
 */

class User {

    private String firstName;
    private String lastName;
    private int gradYear;
    private String email;
    private String address;
    private String password;

    public User(String fullName, int gradYear, String address, String password){
        this.firstName = fullName.split(" ")[0];
        this.lastName = fullName.split(" ")[1];
        this.gradYear = gradYear;
        this.address = address;
        this.password = password;

        String emailLast;
        if(lastName.length() > 7)
            emailLast = lastName.substring(0, 7);
        else
            emailLast = lastName.substring(0, lastName.length());

        this.email = gradYear + firstName.substring(0, 1) + emailLast + "@tjhsst.edu";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }
}
