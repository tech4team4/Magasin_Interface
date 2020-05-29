package com.example.magasin_interface;

public class NomMag {
    String name,email;
    public NomMag(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NomMag(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
