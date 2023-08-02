package com.gaspar.uso_dto.controller;

import com.gaspar.uso_dto.dto.CityDto;
import com.gaspar.uso_dto.entity.City;
import com.gaspar.uso_dto.repository.CityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.List;

@RestController
public class CityController {
    private final CityRepository repository;

    public CityController(CityRepository repository) {
        this.repository = repository;
    }

    private final String names[]={            "Hugo",
            "Martín",
            "Lucas",
            "Mateo",
            "Leo",
            "Daniel",
            "Alejandro",
            "Pablo",
            "Manuel",
            "Álvaro",
            "Adrián",
            "David",
            "Mario",
            "Enzo",
            "Diego",
            "Marcos",
            "Izan",
            "Javier",
            "Marco",
            "Álex",
            "Bruno",
            "Oliver",
            "Miguel",
            "Thiago",
            "Antonio",
            "Marc",
            "Carlos",
            "Ángel",
            "Juan",
            "Gonzalo",
            "Gael",
            "Sergio",
            "Nicolás",
            "Dylan",
            "Gabriel",
            "Jorge",
            "José",
            "Adam",
            "Liam",
            "Eric",
            "Samuel",
            "Darío",
            "Héctor",
            "Luca",
            "Iker",
            "Amir",
            "Rodrigo",
            "Saúl",
            "Víctor",
            "Francisco",
            "Iván",
            "Jesús",
            "Jaime",
            "Aarón",
            "Rubén",
            "Ian",
            "Guillermo",
            "Erik",
            "Mohamed",
            "Julen",
            "Luis",
            "Pau",
            "Unai",
            "Rafael",
            "Joel",
            "Alberto",
            "Pedro",
            "Raúl",
            "Aitor",
            "Santiago",
            "Rayan",
            "Pol",
            "Nil",
            "Noah",
            "Jan",
            "Asier",
            "Fernando",
            "Alonso",
            "Matías",
            "Biel",
            "Andrés",
            "Axel",
            "Ismael",
            "Martí",
            "Arnau",
            "Imran",
            "Luka",
            "Ignacio",
            "Aleix",
            "Alan",
            "Elías",
            "Omar",
            "Isaac",
            "Youssef",
            "Jon",
            "Teo",
            "Mauro",
            "Óscar",
            "Cristian",
            "Leonardo"};


//    @PostMapping("generar")
//    public void generar(){
//        System.out.println("inicio");
//        for(int i = 0; i < 148_500;i++){
//            repository.save(new City(null,names[i%100],names[i%100]+names[i%100]));
//        }
//        System.out.println("final");
//    }

    @GetMapping("/all")
    public List<City> getallEntities(){
        long start = System.currentTimeMillis();
        List<City> all = repository.findAll();
        logDuration("getallEntities   ",Duration.ofMillis(System.currentTimeMillis()-start),all.size());
        return  all.subList(0,1);
    }

    @GetMapping("/enti")
    public List<CityDto> getallEntitiess(){
        long start = System.currentTimeMillis();
        List<CityDto> all = repository.findAllDtos();
        logDuration("getallEntitiesDto",Duration.ofMillis(System.currentTimeMillis()-start),all.size());
        return  all.subList(0,1);
    }

    private void logDuration(String servicio, Duration duration, int size){
        System.out.print(" Service"+servicio);
        System.out.print(" took"+duration.toMillis());
        System.out.println(" to return"+size);

    }
}
