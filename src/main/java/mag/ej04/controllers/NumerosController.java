package mag.ej04.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import mag.ej04.services.NumerosService;

@Controller
public class NumerosController {

    @Autowired (required = true)
    private NumerosService numerosServices;
    
    @GetMapping({ "/", "/list", "" })
    public String showList(Model model) {
        model.addAttribute("cantidadTotal", numerosServices.getLista().size());
        model.addAttribute("listaNumeros", numerosServices.getLista());
        return "indexView";
    }


    @GetMapping("/new")
    public String showNew() {
        numerosServices.add();
        
        return "redirect:/list";
    }
    
    @GetMapping("/delete/{id}")
    public String showDelete(@PathVariable Integer id) {
        numerosServices.delete(id);
        return "redirect:/list";
    }
    
}
