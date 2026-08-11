package com.example.demo.service;

import com.example.demo.entidys.Autor;
import com.example.demo.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository){
        this.autorRepository = autorRepository;
    }

    public Autor salvar(Autor autor){
        Autor salvo = autorRepository.save(autor);
        return salvo;
    }
    public List<Autor> buscar(){
        return autorRepository.findAll();
    }
}

