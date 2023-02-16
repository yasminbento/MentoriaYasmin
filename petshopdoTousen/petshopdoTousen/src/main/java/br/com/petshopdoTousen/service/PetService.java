package br.com.petshopdoTousen.service;

import br.com.petshopdoTousen.entity.Pet;
import br.com.petshopdoTousen.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public Pet salvaPet (Pet petRequest) {

        return petRepository.persistenciaListaPet(petRequest);
    }

    public List<Pet> buscaTodosPets() {
        return petRepository.buscaTodosPets();
    }
}
