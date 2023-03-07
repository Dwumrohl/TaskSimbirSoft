package com.example.TaskSimbirSoft.models;

import jakarta.persistence.*;

@Entity
@Table(name = "request_client", schema = "app_shema")
public class RequestClient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "request_client_id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id")
    private Request request;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}