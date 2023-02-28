package com.example.TaskSimbirSoft.models;

import javax.persistence.*;

@Entity
@Table(name = "CLIENT_ADRESS", schema = "app_shema")
public class ClientAdress {
    @Id
    @Column(name = "\"CLIENT_ADRESS_ID\"", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @Column(name = "\"SITY\"", length = 1)
    private String sity;

    @Column(name = "\"STREET\"", length = 1)
    private String street;

    @Column(name = "\"HOME\"", length = 1)
    private String home;

    @Column(name = "\"CORPUS\"")
    private Integer corpus;

    @Column(name = "\"APARTMENT\"")
    private Integer apartment;

    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }

    public Integer getCorpus() {
        return corpus;
    }

    public void setCorpus(Integer corpus) {
        this.corpus = corpus;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
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