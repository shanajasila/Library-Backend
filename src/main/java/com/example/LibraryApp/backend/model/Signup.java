package com.example.LibraryApp.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "signup")
public class Signup {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String adhaar;
    private String address;
    private String pincode;
    private String dob;
    private String email;
    private String phoneno;
    private String username;
    private String password;
    private String confirmpassword;

    public Signup() {
    }

    public Signup(int id, String name, String adhaar, String address, String pincode, String dob, String email, String phoneno, String username, String password, String confirmpassword) {
        this.id = id;
        this.name = name;
        this.adhaar = adhaar;
        this.address = address;
        this.pincode = pincode;
        this.dob = dob;
        this.email = email;
        this.phoneno = phoneno;
        this.username = username;
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdhaar() {
        return adhaar;
    }

    public String getAddress() {
        return address;
    }

    public String getPincode() {
        return pincode;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdhaar(String adhaar) {
        this.adhaar = adhaar;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
}
