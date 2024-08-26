package com.example.Esercizio_Get_Post;

import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return name;
    }

    @PostMapping("/name/reverse")
    public String reverseName(@RequestBody String name){
        StringBuilder reverseName = new StringBuilder(name);
        return reverseName.reverse().toString();
    }
}
