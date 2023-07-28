package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Language;
import com.examly.springapp.repository.LanguageRepo;

@Service
public class ApiService {
    @Autowired
    public LanguageRepo repo;

     public boolean addnew(Language language){
         return repo.save(language)!=null?true:false;
     }

     public Language getone(int languageId){
        return repo.findById(languageId).get();
     }

     public List<Language> getAllLanguage(){
        return repo.findAll();
     }

     public Language update(Language language,int languageId){
        return repo.save(language);
     }

     public boolean delete(int languageId){
        repo.deleteById(languageId);
        return true;
     }
    
}
