package com.example.EXAMEN1.CONTROLLERS;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MarcaController {

    // Esta es la "llave" que abre la puerta de /marcas
    @GetMapping("/marcas")
    public String listarMarcas(Model model) {
        List<Marca> lista = new ArrayList<>();
        // Agregamos datos de prueba para ver algo en la tabla
        lista.add(new Marca(1, "Toyota", "Japón", 1937));
        lista.add(new Marca(2, "Ford", "EE.UU.", 1903));
        lista.add(new Marca(3, "BMW", "Alemania", 1916));
        lista.add(new Marca(4, "Chevrolet", "EE.UU.", 1911));
        lista.add(new Marca(5, "Honda", "Japón", 1948));
        lista.add(new Marca(6, "Ferrari", "Italia", 1947));
        lista.add(new Marca(7, "Tesla", "EE.UU.", 2003));
        lista.add(new Marca(8, "Hyundai", "Corea del Sur", 1967));
        lista.add(new Marca(9, "Mazda", "Japón", 1920));
        lista.add(new Marca(10, "Nissan", "Japón", 1933));

        model.addAttribute("marcas", lista);
        return "lista"; // Esto debe coincidir con el nombre de tu lista.html
    }
}
