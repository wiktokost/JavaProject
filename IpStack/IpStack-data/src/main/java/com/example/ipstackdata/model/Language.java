package com.example.ipstackdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Setter
@Getter
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String nativeName;
    @ManyToOne
//    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;

    public Language(){}

    public Language(Long id, String code, String name, String nativeName) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nativeName = nativeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return Objects.equals(id, language.id) && Objects.equals(code, language.code) && Objects.equals(name, language.name) && Objects.equals(nativeName, language.nativeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, nativeName);
    }
}
