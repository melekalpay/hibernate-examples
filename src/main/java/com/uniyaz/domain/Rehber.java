package com.uniyaz.domain;

import javax.persistence.*;

@Entity
@Table(name = "REHBER_TABLO")
public class Rehber extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 15)
    private String gsm;

    public Long getId() {
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    @Override
    public String toString() {
        return "Rehber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gsm='" + gsm + '\'' +
                '}';
    }
}
