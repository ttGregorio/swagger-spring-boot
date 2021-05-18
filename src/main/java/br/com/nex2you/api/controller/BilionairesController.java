package br.com.nex2you.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.nex2you.api.dto.Bilionaires;
import br.com.nex2you.api.service.BilionairesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Bilionaires")
public class BilionairesController {

	@Autowired
	private BilionairesService bilionairesService;

	@ApiOperation(value = "List all the bilionaires cadastrated")
	@GetMapping(value = "/api")
	public ResponseEntity<List<Bilionaires>> findAll() {
		return ResponseEntity.ok(bilionairesService.findAll());
	}

	@ApiOperation(value = "List all the bilionaires cadastrated whith the given name")
	@GetMapping(value = "/api/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<Bilionaires>> findByName(@PathVariable String name) {
		return ResponseEntity.ok(bilionairesService.findByName(name));
	}

	@ApiOperation(value = "Insert a bilionaire")
	@PostMapping(value = "/api", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Bilionaires> create(@RequestBody Bilionaires bilionaires) {
		return ResponseEntity.ok(bilionairesService.createUpdate(bilionaires));
	}

	@ApiOperation(value = "Update a bilionaire")
	@PutMapping(value = "/api", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Bilionaires> update(@RequestBody Bilionaires bilionaires) {
		return ResponseEntity.ok(bilionairesService.createUpdate(bilionaires));
	}

	@ApiOperation(value = "Delete a bilionaire")
	@DeleteMapping(value = "/api/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		bilionairesService.delete(id);
		return ResponseEntity.ok("");
	}
}