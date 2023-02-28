package com.example.TaskSimbirSoft.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "\"HOMEOWNERS_ASSOCIATION\"", schema = "app_shema")
public class HomeownersAssociation {
    @Id
    @Column(name = "\"HA_ID\"", nullable = false)
    private Long id;

    @Column(name = "\"CLIENT_ID\"")
    private Long clientId;

    @Lob
    @Column(name = "\"LEGAL_ADDRES\"")
    private String legalAddres;

    @Column(name = "\"PHONE_NUMBER\"", length = 1)
    private String phoneNumber;

    @OneToMany(mappedBy = "ha")
    private Set<HaClient> haClients = new LinkedHashSet<>();

    public Set<HaClient> getHaClients() {
        return haClients;
    }

    public void setHaClients(Set<HaClient> haClients) {
        this.haClients = haClients;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLegalAddres() {
        return legalAddres;
    }

    public void setLegalAddres(String legalAddres) {
        this.legalAddres = legalAddres;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}