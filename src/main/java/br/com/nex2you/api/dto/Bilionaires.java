package br.com.nex2you.api.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "billionaires")
@Entity
public class Bilionaires {

	@Id
	private int id;
	
	private String name;
	
	private String career;
}