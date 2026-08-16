package com.example.demo.service;

import com.example.demo.dtos.AutorDTO;
import com.example.demo.entidys.Autor;
import com.example.demo.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public AutorDTO salvar(AutorDTO autorDTO) {
        Autor autor = new Autor();
        autor.setNome(autorDTO.getNome());

        Autor salvo = autorRepository.save(autor);
        AutorDTO resposta = new AutorDTO();
        resposta.setNome(salvo.getNome());
        resposta.setId(salvo.getId());
        return resposta;
    }

    public List<AutorDTO> buscar() {
       List<Autor> autores = autorRepository.findAll();
        List<AutorDTO> autoresDTO = new ArrayList<>();
        for (Autor autor : autores){
            AutorDTO dto = new AutorDTO();
            dto.setId(autor.getId());
            dto.setNome(autor.getNome());
            autoresDTO.add(dto);
            autoresDTO.add(dto);

        }
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


