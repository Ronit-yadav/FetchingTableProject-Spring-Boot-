package com.myProject.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cities")
@Getter
@Setter
public class City {

    @Id
    private int cityid;     // matches DB column name
    private String cityname; // matches DB column name
}
