package com.abelardoorozco.tkcalculation.controller;

import com.abelardoorozco.tkcalculation.service.LiqService;
import com.abelardoorozco.tkcalculation.service.dto.LiqInDTO;
import org.springframework.web.bind.annotation.*;
import com.abelardoorozco.tkcalculation.persistence.entity.Liq;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/liq")
public class LiqController {

    private final LiqService liqService;

    public LiqController(LiqService liqService) {
        this.liqService = liqService;
    }

    @PostMapping
    public Liq createLiq(@RequestBody LiqInDTO liqInDTO){
        return this.liqService.createLiq(liqInDTO);

    }

    @GetMapping
    public List<Liq> findAll(){
        return this.liqService.findAll();
    }

    @GetMapping("/byId/{id}")
    public Optional<Liq> findById(@PathVariable("id") Long id){
         Optional<Liq> result = this.liqService.findLiqById(id);
         return result;
    }

    @PutMapping("/update/{id}")
    public Optional<Liq> update(@PathVariable("id") Long id, @RequestBody Liq liq){
        Liq updateLiq = liqService.findLiqById(id).get();


        updateLiq.setABD(liq.getABD());
        updateLiq.setGauge(liq.getGauge());
        updateLiq.setTov(liq.getTov());
        updateLiq.setWaterGauge(liq.getWaterGauge());
        updateLiq.setWaterTov(liq.getWaterTov());
        updateLiq.setKFra1(liq.getKFra1());
        updateLiq.setKFra2(liq.getKFra2());
        updateLiq.setFra(liq.getFra());
        updateLiq.setTLam(liq.getTLam());
        updateLiq.setTempL(liq.getTempL());
        updateLiq.setTAmb(liq.getTAmb());
        updateLiq.setCtsh(liq.getCtsh());
        updateLiq.setGov(liq.getGov());
        updateLiq.setApi60(liq.getApi60());
        updateLiq.setCtl(liq.getCtl());
        updateLiq.setGsv(liq.getGsv());
        updateLiq.setBsw(liq.getBsw());
        updateLiq.setNsv(liq.getNsv());

        liqService.updateliq(updateLiq);

        return Optional.of(updateLiq);

    }


}
