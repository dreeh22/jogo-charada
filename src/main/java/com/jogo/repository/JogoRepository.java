package com.jogo.repository;

import org.springframework.data.repository.CrudRepository;

import com.jogo.domain.Jogo;


public interface JogoRepository extends CrudRepository<Jogo, Long> {

}
