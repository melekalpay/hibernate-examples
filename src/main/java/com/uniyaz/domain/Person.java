package com.uniyaz.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table
public class Person extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Long null değeri alabilir.

    private String firstName;
    private String lastName;

    @Column(precision = 7, scale = 2)
    private BigDecimal montlySalary;
    private Date lastUpdate;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getMontlySalary() {
        return montlySalary;
    }

    public void setMontlySalary(BigDecimal montlySalary) {
        this.montlySalary = montlySalary;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", montlySalary=" + montlySalary +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
