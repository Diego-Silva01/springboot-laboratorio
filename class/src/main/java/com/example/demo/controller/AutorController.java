        package com.example.demo.controller;

        import com.example.demo.entidys.Autor;
        import com.example.demo.service.AutorService;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RestController;

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
        }
