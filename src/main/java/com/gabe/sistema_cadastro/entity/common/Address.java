package com.gabe.sistema_cadastro.entity.common;

public class Address {

    private String postalCode;
    private String streetName;
    private String number;
    private String complement;
    private String state;
    private String city;
    private String neighborhood;

    public Address(String postalCode, String streetName, String number, String complement, String state, String city, String neighborhood) {
        this.postalCode = postalCode;
        this.streetName = streetName;
        this.number = number;
        this.complement = complement;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }
}

