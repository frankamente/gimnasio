package com.marquez.gimnasio;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Person hello() {
        return new Person("Rafalitro", "Marquelu");
    }

    @PostMapping("/index")
    public ResponseEntity index(@RequestBody final Person person) {
        if (person.getName().equals("Rafalitro")) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
