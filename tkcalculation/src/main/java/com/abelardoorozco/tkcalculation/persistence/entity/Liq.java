package com.abelardoorozco.tkcalculation.persistence.entity;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "liq")
public class Liq {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String ABD;
    double gauge;
    double tov;
    double waterGauge;
    double waterTov;
    double kFra1;
    double kFra2;
    double fra;
    double tLam;
    double tempL;
    double tAmb;
    double ctsh;
    double gov;
    double api60;
    double ctl;
    double gsv;
    double bsw;
    double nsv;

}
