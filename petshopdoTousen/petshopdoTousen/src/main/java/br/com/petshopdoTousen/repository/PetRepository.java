package br.com.petshopdoTousen.repository;

import br.com.petshopdoTousen.entity.Pet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PetRepository {

    List<Pet> listaPet = new ArrayList<>();


    public Pet persistenciaListaPet(Pet persistPet) {

        this.listaPet.add(persistPet);

        return persistPet;

    }

    public List<Pet> buscaTodosPets() {

        return listaPet;
    }

    public Pet buscaPetPorID(Long id) {

        for (Pet p : listaPet) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }
}