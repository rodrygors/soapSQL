package com.soap.bootcamp2.model;


import lombok.*;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "carId"
})
@XmlRootElement(name = "getCarRequest")
public class GetCarRequest {
    @XmlElement(required = true)
    protected int carId;
}
