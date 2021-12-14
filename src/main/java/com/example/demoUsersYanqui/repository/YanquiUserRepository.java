package com.example.demoUsersYanqui.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demoUsersYanqui.entity.YanquiUser;

@Repository
public interface YanquiUserRepository extends ReactiveCrudRepository<YanquiUser, Integer> {

}
