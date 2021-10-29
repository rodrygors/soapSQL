package com.soap.bootcamp2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
        "name",
        "empId",
        "salary"
})
public class User {
    @XmlElement(required = true)
    @Id
    protected String name;
    protected int empId;
    protected double salary;
}
