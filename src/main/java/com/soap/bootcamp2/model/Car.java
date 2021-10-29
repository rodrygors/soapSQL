package com.soap.bootcamp2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "car", propOrder = {
        "carId",
        "model",
        "brand"
})
public class Car {
    @XmlElement(required = true)
    @Id
    protected int carId;
    protected String model;
    protected String brand;
}
