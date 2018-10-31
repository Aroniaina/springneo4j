package com.aroniaina.springneo4j.controller;

import java.util.Map;

import com.aroniaina.springneo4j.domain.Movie;
import com.aroniaina.springneo4j.domain.Person;
import com.aroniaina.springneo4j.domain.Role;
import com.aroniaina.springneo4j.dto.MovieDto;
import com.aroniaina.springneo4j.dto.PersonDto;
import com.aroniaina.springneo4j.dto.RoleDto;
import com.aroniaina.springneo4j.services.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author a.safidy
 */
@RestController
@RequestMapping("/")
public class GlobalController {

	@Autowired
	private GlobalService globalService;

	@GetMapping("/graph")
	public Map<String, Object> graph(@RequestParam(value = "limit", required = false) Integer limit) {
		return globalService.graph(limit == null ? 100 : limit);
	}

	@PostMapping("/person")
	public Person createperson(@RequestBody PersonDto dto) {
		return globalService.createPerson(dto);
	}

	@PostMapping("/movie")
	public Movie createmovie(@RequestBody MovieDto dto) {
		return globalService.createMovie(dto);
	}

	@PostMapping("/role")
	public Role createrole(@RequestBody RoleDto dto) {
		return globalService.createRole(dto);
	}
}
