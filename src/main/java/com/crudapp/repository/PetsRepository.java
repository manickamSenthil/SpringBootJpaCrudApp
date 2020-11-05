package com.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudapp.model.Pets;

/***
 * 
 * @author Senthil
 *
 */
@Repository
public interface PetsRepository extends JpaRepository<Pets, Long> {

}
