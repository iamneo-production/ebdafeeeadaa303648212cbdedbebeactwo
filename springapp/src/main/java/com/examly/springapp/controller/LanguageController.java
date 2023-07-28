package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Language;
import com.examly.springapp.service.ApiService;

@RestController
public class LanguageController {
    @Autowired
    public ApiService api;

    @PostMapping("/")
    public boolean addnew(@RequestBody Language language){
        return api.addnew(language);
    }

    @GetMapping("/")
    public List<Language> getAllLanguage(){
        return api.getAllLanguage();
    }

    @GetMapping("/{languageId}")
    public Language getone(@PathVariable int languageId){
        return api.getone(languageId);
    }

    @PutMapping("/{languageId}")
    public Language update(@PathVariable int languageId , @RequestBody Language language){
        return api.update(language, languageId);
    }

    @DeleteMapping("/{languageId}")
    public boolean delete(@PathVariable int languageId){
        return api.delete(languageId);
    }
    
}
