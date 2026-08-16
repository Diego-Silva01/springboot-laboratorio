        package com.example.demo.controller;

        import com.example.demo.dtos.AutorDTO;
        import com.example.demo.entidys.Autor;
        import com.example.demo.service.AutorService;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

    @RestController
        public class AutorController {
            private final AutorService autorService;
           public AutorController(AutorService autorService){
                this.autorService = autorService;
            }
            @PostMapping("/autor")
            public AutorDTO salvar(@RequestBody AutorDTO autorDTO){
               return autorService.salvar(autorDTO);
            }

            @GetMapping("/buscar")
            public List<Autor> buscar(){
              return autorService.buscar();
            }
            @GetMapping("/autor/{id}")
        public Autor buscarPorId(@PathVariable Long id){
               return autorService.buscarPorId(id);
            }
            @PutMapping("/autor/{id}")
        public Autor updateAutor(@PathVariable Long id, @RequestBody Autor autor){
               return autorService.updateAutor(autor, id);
            }
            @DeleteMapping("/autor/{id}")
        public void deleteAutor(@PathVariable Long id){
               autorService.deleteAutor(id);

            }

        }

