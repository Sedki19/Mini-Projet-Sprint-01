package com.example.pcs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.pcs.entities.Pc;
public interface PcRepository extends JpaRepository<Pc,Long> {

}
