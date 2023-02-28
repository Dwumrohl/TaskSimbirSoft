package com.example.TaskSimbirSoft.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CLIENT_METER_READINGS", schema = "app_shema")
public class ClientMeterReading {
    @Id
    @Column(name = "\"CLIENT_METER_READINGS_ID\"", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"METER_READINGS_ID\"")
    private MeterReading meterReadings;

    @Column(name = "\"DATE\"")
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public MeterReading getMeterReadings() {
        return meterReadings;
    }

    public void setMeterReadings(MeterReading meterReadings) {
        this.meterReadings = meterReadings;
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