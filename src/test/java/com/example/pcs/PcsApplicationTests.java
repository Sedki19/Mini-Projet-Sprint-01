package com.example.pcs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.pcs.entities.Pc;
import com.example.pcs.repos.PcRepository;

@SpringBootTest
class PcsApplicationTests {

	@Autowired
	private PcRepository PcRepository;

	@Test
	void contextLoads() {
		Pc p = new Pc("Dell",2200.500,"i5 6eme gen ..");
		PcRepository.save(p);

	}

}
