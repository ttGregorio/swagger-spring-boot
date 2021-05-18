package br.com.nex2you.api.service;

import java.util.List;

import br.com.nex2you.api.dto.Bilionaires;

public interface BilionairesService {

	List<Bilionaires> findAll();

	List<Bilionaires> findByName(String name);

	Bilionaires createUpdate(Bilionaires bilionaires);

	void delete(int id);

}