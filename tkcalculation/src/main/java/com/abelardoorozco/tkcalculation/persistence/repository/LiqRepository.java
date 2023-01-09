package com.abelardoorozco.tkcalculation.persistence.repository;

import com.abelardoorozco.tkcalculation.persistence.entity.Liq;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.List;

public interface LiqRepository  extends JpaRepository<Liq, Long> {

}
