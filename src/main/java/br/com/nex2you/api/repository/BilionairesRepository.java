package br.com.nex2you.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.nex2you.api.dto.Bilionaires;

public interface BilionairesRepository extends CrudRepository<Bilionaires, Integer> {

	List<Bilionaires> findByName(String name);

}
