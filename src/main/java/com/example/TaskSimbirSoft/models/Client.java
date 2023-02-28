package com.example.TaskSimbirSoft.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"CLIENT\"", schema = "app_shema")
public class Client {
    @Id
    @Column(name = "\"CLIENT_ID\"", nullable = false)
    private Long id;

    @Column(name = "\"PHONE_NUMBER\"", length = 1)
    private String phoneNumber;

    @Column(name = "\"EMAIL\"", length = 1)
    private String email;

    @Lob
    @Column(name = "\"NAME\"")
    private String name;

    @Lob
    @Column(name = "\"SURNAME\"")
    private String surname;

    @Lob
    @Column(name = "\"PATRONYMIC\"")
    private String patronymic;

    @Column(name = "\"CLIENT_ADRESS_ID\"")
    private Long clientAdressId;

    @OneToMany(mappedBy = "client")
    private Set<HaClient> haClients = new LinkedHashSet<>();

    @OneToMany(mappedBy = "client")
    private Set<ClientMeterReading> clientMeterReadings = new LinkedHashSet<>();

    @OneToMany(mappedBy = "client")
    private Set<ClientAdress> clientAdresses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "client")
    private Set<RequestClient> requestClients = new LinkedHashSet<>();

    public Set<RequestClient> getRequestClients() {
        return requestClients;
    }

    public void setRequestClients(Set<RequestClient> requestClients) {
        this.requestClients = requestClients;
    }

    public Set<ClientAdress> getClientAdresses() {
        return clientAdresses;
    }

    public void setClientAdresses(Set<ClientAdress> clientAdresses) {
        this.clientAdresses = clientAdresses;
    }

    public Set<ClientMeterReading> getClientMeterReadings() {
        return clientMeterReadings;
    }

    public void setClientMeterReadings(Set<ClientMeterReading> clientMeterReadings) {
        this.clientMeterReadings = clientMeterReadings;
    }

    public Set<HaClient> getHaClients() {
        return haClients;
    }

    public void setHaClients(Set<HaClient> haClients) {
        this.haClients = haClients;
    }

    public Long getClientAdressId() {
        return clientAdressId;
    }

    public void setClientAdressId(Long clientAdressId) {
        this.clientAdressId = clientAdressId;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}