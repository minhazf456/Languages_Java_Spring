package com.codingdojo.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service

public class LanguageService {
	
	/// first we need to do inject our LanguageReposity. this is the LanguageRepository Instances we r gonna use
	
	private final LanguageRepository languageRepository;
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;	
	}
	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}
	
	//Retrieve a language
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        }
        else {
            return null;
        }
    }
    /// creating Language
    public Language addLanguage(Language l) {
    	return languageRepository.save(l);
    }
    
    // deleting
    public void deleteLanguage(Long id) {
    	languageRepository.deleteById(id);
    }
}
