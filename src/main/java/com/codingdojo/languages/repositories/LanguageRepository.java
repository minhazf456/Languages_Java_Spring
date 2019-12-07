package com.codingdojo.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.languages.models.Language;

/// CrudRepository will allow us to do all crud operations.

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {// type is the model which is Language and primary key type which is long 
	
	List<Language> findAll();
}