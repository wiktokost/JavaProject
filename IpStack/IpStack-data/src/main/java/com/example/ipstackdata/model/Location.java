package com.example.ipstackdata.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer geonameId;

    private String capital;
    @OneToMany(mappedBy = "location")
//    @JoinColumn(name = "languages_id", referencedColumnName = "id")
    private List<Language> languages = new ArrayList<>();
    @OneToOne
    private IpGeolocation ipGeolocation;
    private String countryFlag;

    private String countryFlagEmoji;

    private String countryFlagEmojiUnicode;

    private String callingCode;

    private Boolean isEu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(id, location.id) && Objects.equals(geonameId, location.geonameId) && Objects.equals(capital, location.capital) && Objects.equals(languages, location.languages) && Objects.equals(countryFlag, location.countryFlag) && Objects.equals(countryFlagEmoji, location.countryFlagEmoji) && Objects.equals(countryFlagEmojiUnicode, location.countryFlagEmojiUnicode) && Objects.equals(callingCode, location.callingCode) && Objects.equals(isEu, location.isEu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, geonameId, capital, languages, countryFlag, countryFlagEmoji, countryFlagEmojiUnicode, callingCode, isEu);
    }
}
