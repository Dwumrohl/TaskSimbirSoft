package com.example.TaskSimbirSoft.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ha_client", schema = "app_shema")
public class HaClient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ha_client_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ha_id")
    private HomeownersAssociation ha;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
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