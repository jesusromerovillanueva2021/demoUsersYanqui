package com.example.demoUsersYanqui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoUsersYanqui.dto.YanquiUserDto;
import com.example.demoUsersYanqui.repository.YanquiUserRepository;
import com.example.demoUsersYanqui.utils.AppUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class YanquiUserService {
	@Autowired
	private YanquiUserRepository repository;
	
	public Flux<YanquiUserDto> getYanquiUsers(){
		return repository.findAll()
				.map(AppUtils::entityToDto	);
	}
	
	public Mono<YanquiUserDto> getYanquiUser(int id){
		return repository.findById(id)
				.map(AppUtils::entityToDto);
	}
	
	public Mono<YanquiUserDto> saveYanquiUser(Mono<YanquiUserDto> yanquiUserMono){
		return yanquiUserMono.map(AppUtils::dtoToEnity)
				.flatMap(repository::save)
				.map(AppUtils::entityToDto);
	}
	
	public Mono<YanquiUserDto> updateYanquiUser(Mono<YanquiUserDto> yanquiUserMonoint,int id){
		return repository.findById(id)
				.flatMap(p->yanquiUserMonoint.map(AppUtils::dtoToEnity)
						.doOnNext(e->e.setId(id)))
				.flatMap(repository::save)
				.map(AppUtils::entityToDto);
	}
	
	
	public Mono<Void> deleteYanquiUser(int id){
		return repository.deleteById(id);		
	}
	
	
}
