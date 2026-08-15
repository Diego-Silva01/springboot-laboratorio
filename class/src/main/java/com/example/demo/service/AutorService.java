package com.example.demo.service;

import com.example.demo.entidys.Autor;
import com.example.demo.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public Autor salvar(Autor autor) {
        Autor salvo = autorRepository.save(autor);
        return salvo;
    }

    public List<Autor> buscar() {
        return autorRepository.findAll();
    }

    public Autor buscarPorId(Long id) {
        return autorRepository.findById(id)
                .orElseThrow();
    }

public Autor updateAutor(Autor autor, Long id) {
    Autor autorExistente = autorRepository.findById(id)
            .orElseThrow();
    autorExistente.setNome(autor.getNome());
    return autorRepository.save(autorExistente);
}
public void deleteAutor(Long id){
Autor autorExist = autorRepository.findById(id).orElseThrow();
       autorRepository.deleteById(id);

}

    }


