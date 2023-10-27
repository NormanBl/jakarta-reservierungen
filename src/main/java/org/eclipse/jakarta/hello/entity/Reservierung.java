package org.eclipse.jakarta.hello.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Reservierung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer tischnummer;
    private Date date;
    private Integer personenanzahl;

    public Reservierung(Long id, String name, Integer tischnummer, Date date, Integer personenanzahl) {
        this.id = id;
        this.name = name;
        this.tischnummer = tischnummer;
        this.date = date;
        this.personenanzahl = personenanzahl;
    }

    public Reservierung(String name, Integer tischnummer, Date date, Integer personenanzahl) {
        this.name = name;
        this.tischnummer = tischnummer;
        this.date = date;
        this.personenanzahl = personenanzahl;
    }

    public Reservierung() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
