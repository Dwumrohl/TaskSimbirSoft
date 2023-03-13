package com.example.TaskSimbirSoft.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Data
@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "client", schema = "app_shema")
public class Client implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id", nullable = false)
    private Long id;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number", length = 11)
    private String phoneNumber;

    @Column(name = "email", length = 30)
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "client_address_id")
    private Long clientAddressId;

    @OneToMany(mappedBy = "client")
    private Set<HaClient> haClients = new LinkedHashSet<>();

    @OneToMany(mappedBy = "client")
    private Set<ClientMeterReading> clientMeterReadings = new LinkedHashSet<>();

    @OneToMany(mappedBy = "client")
    private Set<ClientAddress> clientAddresses = new LinkedHashSet<>();

    @OneToMany(mappedBy = "client")
    private Set<RequestClient> requestClients = new LinkedHashSet<>();



    public Client(Client client) {
        this.email = client.getEmail();
        this.password = client.getPassword();
        this.role = client.getRole();
    }


    //
//

//    public Set<RequestClient> getRequestClients() {
//        return requestClients;
//    }
//
//    public void setRequestClients(Set<RequestClient> requestClients) {
//        this.requestClients = requestClients;
//    }
//
//    public Set<ClientAddress> getClientAddresses() {
//        return clientAddresses;
//    }
//
//
//    public void setClientAddresses(Set<ClientAddress> clientAddresses) {
//        this.clientAddresses = clientAddresses;
//    }
//
//    public Set<ClientMeterReading> getClientMeterReadings() {
//        return clientMeterReadings;
//    }
//
//    public void setClientMeterReadings(Set<ClientMeterReading> clientMeterReadings) {
//        this.clientMeterReadings = clientMeterReadings;
//    }
//
//    public Set<HaClient> getHaClients() {
//        return haClients;
//    }
//
//    public void setHaClients(Set<HaClient> haClients) {
//        this.haClients = haClients;
//    }
//
//    public Long getClientAddressId() {
//        return clientAddressId;
//    }
//
//    public void setClientAddressId(Long clientAddressId) {
//        this.clientAddressId = clientAddressId;
//    }
//
//    public String getPatronymic() {
//        return patronymic;
//    }
//
//    public void setPatronymic(String patronymic) {
//        this.patronymic = patronymic;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> listRole = new ArrayList<GrantedAuthority>();
        listRole.add(new SimpleGrantedAuthority(role));
        return listRole;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}