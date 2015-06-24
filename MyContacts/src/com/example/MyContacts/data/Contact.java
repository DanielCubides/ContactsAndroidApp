package com.example.MyContacts.data;

/**
 * Created by Nirox on 6/24/2015.
 */
public class Contact {
    private String name;
    private String email;
    private String addres;
    private Long phone;

    public Contact(String name, String email, String addres, Long phone) {
        this.name = name;
        this.email = email;
        this.addres = addres;
        this.phone = phone;
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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}
