package com.example.aula_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    //private Produto produto = new Produto();
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

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
        model.addAttribute("produto", new Produto());
        model.addAttribute("produtos", produtos);
        return "produto";
    }
    //-----------------------------------------------------------------------------
    //O valor que vier da requisição HTTP será capturado e guardado dentro da variável nome.
    @PostMapping("/produto/salvar")
    public String produto(@ModelAttribute Produto paramsProduto){
        System.out.println("Produto cadastrado: " + paramsProduto);
        produtos.add(paramsProduto);
        //Redireciona após o post para ir para o metodo acima get
        return "redirect:/";
    }
}
