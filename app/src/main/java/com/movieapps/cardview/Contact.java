package com.movieapps.cardview;

import android.content.Context;

/**
 * Created by acer on 1/30/2017.
 */

public class Contact {
    private int image_id;
    private String personeName;
    private String personEmail;
    private String personPhoneNo;

    public Contact(int image_id,String personName, String personEmail,String personPhoneNo){
        this.image_id = image_id;
        this.personeName = personName;
        this.personEmail = personEmail;
        this.personPhoneNo = personPhoneNo;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersoneName() {
        return personeName;
    }

    public void setPersoneName(String personeName) {
        this.personeName = personeName;
    }

    public String getPersonPhoneNo() {
        return personPhoneNo;
    }

    public void setPersonPhoneNo(String personPhoneNo) {
        this.personPhoneNo = personPhoneNo;
    }
}
