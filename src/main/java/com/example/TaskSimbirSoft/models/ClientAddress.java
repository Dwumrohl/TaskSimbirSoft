package com.example.TaskSimbirSoft.models;

import jakarta.persistence.*;

@Entity
@Table(name = "client_address", schema = "app_shema")
public class ClientAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_address_id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "city", length = 20)
    private String city;

    @Column(name = "street", length = 20)
    private String street;

    @Column(name = "house", length = 10)
    private String house;

    @Column(name = "building")
    private Integer building;

    @Column(name = "apartment")
    private Integer apartment;

    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}