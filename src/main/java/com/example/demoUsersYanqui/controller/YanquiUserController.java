package com.example.demoUsersYanqui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoUsersYanqui.dto.YanquiUserDto;
import com.example.demoUsersYanqui.service.YanquiUserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/yanquiusers")
public class YanquiUserController {
	@Autowired
	private YanquiUserService service;
	
	@GetMapping
	public Flux<YanquiUserDto> getYanquiUsers(){
		return service.getYanquiUsers();
	}
	
	@GetMapping("/{id}")
	public Mono<YanquiUserDto> getYanquiUser(@PathVariable int id){
		return service.getYanquiUser(id);
	}
	
	@PostMapping
	public Mono<YanquiUserDto> saveYanquiUser(@RequestBody Mono<YanquiUserDto> yanquiDtoMono){
		return service.saveYanquiUser(yanquiDtoMono);
	}
	
	@PutMapping("/update/{id}")
	public Mono<YanquiUserDto> updateYanquiUser(@RequestBody Mono<YanquiUserDto> yanquiDtoMono ,@PathVariable int id){
		return service.updateYanquiUser(yanquiDtoMono, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public Mono<Void> deleteYanquiUser(@PathVariable int id){
		return service.deleteYanquiUser(id);
	}
}
	