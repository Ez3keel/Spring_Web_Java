package com.example.aula_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("produto", new Produto(produtos.size() + 1)); //seta o id de acordo com o tamanho da lista
        model.addAttribute("produtos", produtos);
        return "produto";
    }
    //-----------------------------------------------------------------------------
    //O valor que vier da requisição HTTP será capturado e guardado dentro da variável nome.
    @PostMapping("/produto/salvar")
    public String produto(@ModelAttribute Produto paramsProduto){
        System.out.println("Produto cadastrado: " + paramsProduto);

//Produra no array e filtra se tem algum com o mesmo ID e remove
        Produto produtoParaEditar = produtos.stream()
                .filter( p -> p.getId() == paramsProduto.getId())
                .findFirst()
                .orElse(null);

        //Caso tenha no array o mesmo id ele vai encontrar e remover
        if(produtoParaEditar != null){
            produtos.removeIf(p -> p.getId() == paramsProduto.getId());
        }
        //depois vai adicionar o produto novamente no array.
        produtos.add(paramsProduto);
        return "redirect:/";//Redireciona após o post para ir para o metodo acima get
    }

    @GetMapping("/produto/editar/{id}")
    public String editar(@PathVariable int id, Model model){

        //Itera na lista procurando o ID para editar
        Produto produtoParaEditar = produtos.stream()
                        .filter( p -> p.getId() == id)
                        .findFirst()
                        .orElse(null);

        model.addAttribute("produto", produtoParaEditar); //seta o id de acordo com o tamanho da lista
        model.addAttribute("produtos", produtos);
        return "produto";
    }

    @PostMapping("/produto/excluir")
    public String produto(@RequestParam int id){
        System.out.println("Produto excluido: " + id);
        produtos.removeIf(p-> p.getId() == id);
        return "redirect:/";

    }


}
