package com.validation;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class ValidateParametersController {
	@GetMapping("/validatePathVariable/{id}")
	ResponseEntity<String> validatePathVariable(@PathVariable("id") @Min(35) int id) {
		return ResponseEntity.ok("valid");
	}

	@GetMapping("/validateRequestParameter")
	ResponseEntity<String> validateRequestParameter(@RequestParam("param") @Size(min = 5) String param) {
		return ResponseEntity.ok("valid");
	} 
	@PostMapping("/personData")
	public ResponseEntity<String> createPerson(@Valid @RequestBody PersonForm personForm) {
		return ResponseEntity.ok("valid");
	}
	
	/*@PostMapping("/personData2")
	public ResponseEntity<String> createPerson2(@RequestBody PersonForm2 personForm2) {
		return ResponseEntity.ok("valid");
	}*/
	
	
	

}
