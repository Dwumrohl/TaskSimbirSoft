package com.example.TaskSimbirSoft.models;

import javax.persistence.*;

@Entity
@Table(name = "\"HA_CLIENT\"", schema = "app_shema")
public class HaClient {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HA_ID")
    private HomeownersAssociation ha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public HomeownersAssociation getHa() {
        return ha;
    }

    public void setHa(HomeownersAssociation ha) {
        this.ha = ha;
    }
}