package com.example.ipstackdata.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ip_geolocation")
public class IpGeolocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ip;
    private String type;
    private String continentCode;
    private String continentName;
    private String countryCode;
    private String countryName;
    private String regionCode;
    private String regionName;
    private String city;
    private String zip;
    private double latitude;
    private double longitude;
    @OneToOne(mappedBy = "ipGeolocation")
//    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IpGeolocation that = (IpGeolocation) o;
        return Double.compare(that.latitude, latitude) == 0 && Double.compare(that.longitude, longitude) == 0 && Objects.equals(id, that.id) && Objects.equals(ip, that.ip) && Objects.equals(type, that.type) && Objects.equals(continentCode, that.continentCode) && Objects.equals(continentName, that.continentName) && Objects.equals(countryCode, that.countryCode) && Objects.equals(countryName, that.countryName) && Objects.equals(regionCode, that.regionCode) && Objects.equals(regionName, that.regionName) && Objects.equals(city, that.city) && Objects.equals(zip, that.zip) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ip, type, continentCode, continentName, countryCode, countryName, regionCode, regionName, city, zip, latitude, longitude, location);
    }
}
