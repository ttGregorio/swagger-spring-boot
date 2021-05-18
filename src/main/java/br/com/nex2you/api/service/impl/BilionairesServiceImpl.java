package br.com.nex2you.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.nex2you.api.dto.Bilionaires;
import br.com.nex2you.api.repository.BilionairesRepository;
import br.com.nex2you.api.service.BilionairesService;

@Component
public class BilionairesServiceImpl implements BilionairesService {

	@Autowired
	private BilionairesRepository bilionairesRepository;

	public List<Bilionaires> findAll() {
		return (List<Bilionaires>) bilionairesRepository.findAll();
	}

	public List<Bilionaires> findByName(String name) {
		return (List<Bilionaires>) bilionairesRepository.findByName(name);
	}

	public Bilionaires createUpdate(Bilionaires bilionaires) {
		return bilionairesRepository.save(bilionaires);
	}

	public void delete(int id) {
		bilionairesRepository.deleteById(id);
	}
}
