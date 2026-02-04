package com.example.aula_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    /*
    -----------------------------------------------------------------------------
    Quando acessar essa rota vai chamar o index.html
    index fica no resources/templates
    */
    @GetMapping("/")
    public String index(Model model){
        /*
        Injeta o código na view direto do backend
        Com base no valor de attributeName ele vai encontrar no index.html e injetar
        */
        model.addAttribute("Mensagem", "Bem-vindo com mensagem do Backend!");
        return "index";
    }
    //-----------------------------------------------------------------------------
    //O valor que vier da requisição HTTP será capturado e guardado dentro da variável nome.
    @PostMapping("/produto")
    public String produto(@RequestParam String nome){
        System.out.println("Produto cadastrado: " + nome);
        return "index";
    }
}
