package com.abelardoorozco.tkcalculation.service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LiqInDTO {

    String ABD;
    double gauge;
    double tov;
    double waterGauge;
    double waterTov;
    double kFra1;
    double kFra2;
    double tLam;
    double tempL;
    double tAmb;
    double api60;
    double bsw;

}
