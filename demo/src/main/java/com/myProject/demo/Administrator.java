package com.myProject.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "administrator")
@Getter
@Setter
@NoArgsConstructor
public class Administrator {

    @Id
    private String emailid;

    private String moblinumber;

    private String adminname;

    private String password;
}

