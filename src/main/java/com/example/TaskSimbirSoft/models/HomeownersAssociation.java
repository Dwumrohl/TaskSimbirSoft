package com.example.TaskSimbirSoft.models;

import jakarta.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "homeowners_association", schema = "app_shema")
public class HomeownersAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ha_id", nullable = false)
    private Long id;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "legal_address")
    private String legalAddress;

    @Column(name = "phone_number", length = 1)
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

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
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