package mag.ej04.controllers;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class NumerosController {
    Random random = new Random();
    public Set<Integer> lista = new LinkedHashSet<>(); // Similar a ArrayList pero no admite duplicados

    @GetMapping({ "/", "/list", "" })
    public String showList(Model model) {
        model.addAttribute("cantidadTotal", lista.size());
        model.addAttribute("listaNumeros", lista);
        return "indexView";
    }


    @GetMapping("/new")
    public String showNew() {

        boolean added;
        do{
            added = lista.add(random.nextInt(100) + 1);
        } while (!added);

        return "redirect:/list";
    }
    
    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable Integer id) {
        lista.remove(id);
        return "redirect:/list";
    }
    
}
