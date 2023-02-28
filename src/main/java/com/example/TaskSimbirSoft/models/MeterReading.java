package com.example.TaskSimbirSoft.models;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "METER_READINGS", schema = "app_shema")
public class MeterReading {
    @Id
    @Column(name = "\"METER_READINGS_ID\"", nullable = false)
    private Long id;

    @Column(name = "\"NAME\"", length = 1)
    private String name;

    @Column(name = "\"DATA\"")
    private Long data;

    @OneToMany(mappedBy = "meterReadings")
    private Set<ClientMeterReading> clientMeterReadings = new LinkedHashSet<>();

    public Set<ClientMeterReading> getClientMeterReadings() {
        return clientMeterReadings;
    }

    public void setClientMeterReadings(Set<ClientMeterReading> clientMeterReadings) {
        this.clientMeterReadings = clientMeterReadings;
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}