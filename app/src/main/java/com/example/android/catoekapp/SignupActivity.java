package com.example.android.catoekapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SignupActivity extends AppCompatActivity {

    String username, password, fullname, email, address;
    int phone_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public SignupActivity(){

    }

    public SignupActivity(String address, String email, String fullname, String password, int phone_number, String username) {
        this.address = address;
        this.email = email;
        this.fullname = fullname;
        this.password = password;
        this.phone_number = phone_number;
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPassword() {
        return password;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getUsername() {
        return username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
