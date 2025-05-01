package com.gabe.sistema_cadastro.entity;

import com.gabe.sistema_cadastro.entity.common.Address;

import java.util.Date;

public class User {

    private String name;
    private String lastName;
    private Date birthDate;
    private String email;
    private String phoneNumber;
    private Address address;

    public User(String name, String lastName, Date birthDate, String email, String phoneNumber, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }
}
