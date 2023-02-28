package com.example.TaskSimbirSoft.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "REQUEST", schema = "app_shema")
public class Request {
    @Id
    @Column(name = "\"REQUEST_ID\"", nullable = false)
    private Long id;

    @Column(name = "\"TYPE\"")
    private Integer type;

    @Lob
    @Column(name = "\"NAME\"")
    private String name;

    @Column(name = "\"DATE\"")
    private LocalDate date;

    @Lob
    @Column(name = "\"ADRESS\"")
    private String adress;

    @Lob
    @Column(name = "\"COMMENT\"")
    private String comment;

    @Column(name = "\"STATUS\"")
    private Integer status;

    @OneToMany(mappedBy = "request")
    private Set<RequestClient> requestClients = new LinkedHashSet<>();

    public Set<RequestClient> getRequestClients() {
        return requestClients;
    }

    public void setRequestClients(Set<RequestClient> requestClients) {
        this.requestClients = requestClients;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}