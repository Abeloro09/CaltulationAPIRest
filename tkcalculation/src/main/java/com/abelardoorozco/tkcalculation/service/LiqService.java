package com.abelardoorozco.tkcalculation.service;

import com.abelardoorozco.tkcalculation.mapper.LiqInDTOToLiq;
import com.abelardoorozco.tkcalculation.persistence.entity.Liq;
import com.abelardoorozco.tkcalculation.persistence.repository.LiqRepository;
import com.abelardoorozco.tkcalculation.service.dto.LiqInDTO;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@Service
public class LiqService {

    private final LiqRepository repository;
    private final LiqInDTOToLiq mapper;

    public LiqService(LiqRepository repository, LiqInDTOToLiq mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Liq createLiq(LiqInDTO liqInDTO){
        Liq liq = mapper.map(liqInDTO);
        return this.repository.save(liq);

    }

    public List<Liq> findAll(){
        return this.repository.findAll();
    }

    public Optional<Liq> findLiqById(Long id) {
        return repository.findById(id);
    }

    public Liq updateliq(Liq liq){
        return this.repository.save(liq);
    }

}
