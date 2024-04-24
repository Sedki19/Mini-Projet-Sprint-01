package com.example.pcs.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.pcs.entities.Pc;
import com.example.pcs.repos.PcRepository;

@Service
public class PcServiceImpl implements PcService {
	@Autowired
	PcRepository PcRepository;

	@Override
	public Pc savePc(Pc p) {
		return PcRepository.save(p);
	}

	@Override
	public Pc updatePc(Pc p) {
		return PcRepository.save(p);
	}

	@Override
	public void deletePc(Pc p) {
		PcRepository.delete(p);
	}

	@Override
	public void deletePcById(Long id) {
		PcRepository.deleteById(id);
	}

	@Override
	public Pc getPc(Long id) {
		return PcRepository.findById(id).get();
	}

	@Override
	public List<Pc> getAllPcs() {
		return PcRepository.findAll();
	}

	@Override
	public Page<Pc> getAllPcsParPage(int page, int size) {
		
		return PcRepository.findAll(PageRequest.of(page, size));
		
	}
}