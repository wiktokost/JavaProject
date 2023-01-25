package com.example.ipstackwebapi.contract;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LanguageDto {
    private String code;
    private String name;
    private String nativeName;
}
