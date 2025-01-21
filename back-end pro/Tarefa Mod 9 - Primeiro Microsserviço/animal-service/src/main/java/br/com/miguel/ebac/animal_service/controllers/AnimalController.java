package br.com.miguel.ebac.animal_service.controllers;

import br.com.miguel.ebac.animal_service.dto.AnimalDTO;
import br.com.miguel.ebac.animal_service.dto.CatDTO;
import br.com.miguel.ebac.animal_service.dto.DogDTO;
import br.com.miguel.ebac.animal_service.entidades.Animal;
import br.com.miguel.ebac.animal_service.entidades.Cat;
import br.com.miguel.ebac.animal_service.entidades.Dog;
import br.com.miguel.ebac.animal_service.repository.AnimalRepository;
import br.com.miguel.ebac.animal_service.repository.CatRepository;
import br.com.miguel.ebac.animal_service.repository.DogRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private DogRepository dogRepository;
    private CatRepository catRepository;
    private AnimalRepository animalRepository;

    //spring vai usar este construtor automaticamente por injeção de dependencia
    public AnimalController(DogRepository dogRepository, CatRepository catRepository, AnimalRepository animalRepository) {
        this.dogRepository = dogRepository;
        this.catRepository = catRepository;
        this.animalRepository = animalRepository;
    }

    @GetMapping
    public List<AnimalDTO> findAllAnimals() {
        List<AnimalDTO> allAnimals = new ArrayList<>();
        allAnimals.addAll(animalRepository.findAllCats());
        allAnimals.addAll(animalRepository.findAllDogs());
        return allAnimals;
    }

    @PostMapping("/create-dog")
    private Animal createDog(@RequestBody Dog dog) {
        return dogRepository.save(dog);
    }

    @PostMapping("/create-cat")
    private Animal createCat(@RequestBody Cat cat) {
        return catRepository.save(cat);
    }

    @GetMapping("/not-adopted-dogs")
    private List<DogDTO> findNotAdoptedDogs() {
        return dogRepository.findNotAdopted();
    }

    @GetMapping("/adopted-dogs")
    private List<DogDTO> findAdoptedDogs() {
        return dogRepository.findAdopted();
    }

    @GetMapping("/not-adopted-cats")
    private List<CatDTO> findNotAdoptedCats() {
        return catRepository.findNotAdopted();
    }

    @GetMapping("/adopted-cats")
    private List<CatDTO> findAdoptedCats() {
        return catRepository.findAdopted();
    }


}
