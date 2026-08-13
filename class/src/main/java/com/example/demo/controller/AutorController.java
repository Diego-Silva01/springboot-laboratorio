        package com.example.demo.controller;

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
            public Autor salvar(@RequestBody Autor autor){
               return autorService.salvar(autor);
            }

            @GetMapping("/buscar")
            public List<Autor> buscar(){
              return autorService.buscar();
            }
            @GetMapping("/autor/{id}/")
        public Autor autor(@PathVariable Long id){
               return autorService.buscarPorId(id);
            }
            @PutMapping("/autor/{id}/")
        public Autor updateAutor(@PathVariable Long id, @RequestBody Autor autor){
               return autorService.updteAutor(autor, id);
            }

        }
