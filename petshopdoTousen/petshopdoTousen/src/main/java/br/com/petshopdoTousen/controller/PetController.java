package br.com.petshopdoTousen.controller;

import br.com.petshopdoTousen.entity.Pet;
import br.com.petshopdoTousen.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet-do-tousen")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping
    public Pet cadastrarPet (@RequestBody Pet petRequest) {

        return petService.salvaPet(petRequest);
    }

    @GetMapping("/all-pet")
    public List<Pet> buscarTodosPets () {
        return petService.buscaTodosPets();
    }

    @GetMapping("/{id}")
    public Pet buscarPetsPorID (@PathVariable Long id) {
        return petService.buscaPetPorID(id);
    }

}
