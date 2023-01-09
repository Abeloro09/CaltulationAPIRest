package com.abelardoorozco.tkcalculation.mapper;

import com.abelardoorozco.tkcalculation.persistence.entity.Liq;
import com.abelardoorozco.tkcalculation.service.dto.LiqInDTO;
import com.abelardoorozco.tkcalculation.util.CalculationsLiq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LiqInDTOToLiq implements  IMapper<LiqInDTO, Liq>{
    @Override
    public Liq map(LiqInDTO in) {

        //instancio un objeto del tipo que debo guardar en la base de datos
        Liq liq = new Liq();

        //Instancio un objeto de la clase que me permite hacer los calculos
        CalculationsLiq calculationsLiq = new CalculationsLiq(in.getABD(), in.getGauge(), in.getTov(), in.getWaterGauge(), in.getWaterTov(), in.getKFra1(), in.getKFra2(), in.getTLam(), in.getTempL(), in.getTAmb(), in.getApi60(), in.getBsw());

        liq.setABD(in.getABD());
        liq.setGauge(in.getGauge());
        liq.setTov(in.getTov());
        liq.setWaterGauge(in.getWaterGauge());
        liq.setWaterTov(in.getWaterTov());
        liq.setKFra1(in.getKFra1());
        liq.setKFra2(in.getKFra2());
        liq.setTLam(in.getTLam());
        liq.setTempL(in.getTempL());
        liq.setTAmb(in.getTAmb());
        liq.setApi60(in.getApi60());
        liq.setBsw(in.getBsw());

        liq.setFra(calculationsLiq.fra());
        liq.setCtsh(calculationsLiq.ctsh());
        liq.setGov(calculationsLiq.gov());
        liq.setCtl(calculationsLiq.ctl());
        liq.setGsv(calculationsLiq.gsv());
        liq.setNsv(calculationsLiq.nsv());

        return liq;






    }
}
