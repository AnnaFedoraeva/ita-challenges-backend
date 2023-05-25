package com.itachallenge.score.repository;

/*Creación de capa Repository en micro Score#45

Description
Utilizaremos ReactiveMongoRepository (tipado)*/

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


@Repository

public interface ScoreRepository extends ReactiveMongoRepository<Score, String>{


}
