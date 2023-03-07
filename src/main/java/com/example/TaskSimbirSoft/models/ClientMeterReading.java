package com.example.TaskSimbirSoft.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "client_meter_readings", schema = "app_shema")
public class ClientMeterReading {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_meter_readings_id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meter_readings_id")
    private MeterReading meterReadings;

    @Column(name = "date")
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