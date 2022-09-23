package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.io.Serializable;

public class ChungNhanId implements Serializable {
    @Basic(optional = false)
    @Column(name = "MaNV")
    private String MaNV;

    @Basic(optional = false)
    @Column(name = "MaMB")
    private Integer MaMB;
}
