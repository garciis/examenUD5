package pps.maven.examenud5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

   @GetMapping("/examen")
   public String welcome() {
      return "Bienvenido al endpoint de la aplicación Examen UD5 y su rama feature/initial-setup";
   }

}
