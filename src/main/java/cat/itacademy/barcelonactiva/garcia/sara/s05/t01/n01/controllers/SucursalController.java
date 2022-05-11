package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.controllers;


import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.DTO.SucursalDTO;
import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.Sucursal;
import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursal")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping("/add")
    public ResponseEntity<?> addSucursal(@RequestBody SucursalDTO sucursalDto){
    Sucursal sucursal = new Sucursal(sucursalDto.getNomSucursal(),sucursalDto.getPaisSucursal(),sucursalDto.getTipusSucursal()) ;


    return ResponseEntity.status(HttpStatus.CREATED).body(sucursalService.addSucursal(sucursal));
    }

    @PutMapping ("/update/{id}")
    public void updateSucursal(@PathVariable Long id,@RequestBody SucursalDTO sucursalDto) throws Exception {

        Sucursal sucursal1 = sucursalService.getSucursal(id);

        if(sucursalDto.getNomSucursal() != null) {
            sucursal1.setNomSucursal(sucursalDto.getNomSucursal());
        }else if (sucursalDto.getPaisSucursal() != null){
            sucursal1.setPaisSucursal(sucursalDto.getPaisSucursal());
            sucursal1.setTipusSucursal(sucursalDto.getTipusSucursal());
        }
        sucursalService.updateSucursal(sucursal1);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSucursal (@PathVariable Long id){
    String missatge ="";
        if(!sucursalService.existsById(id)){
         missatge = "No s'ha trobat cap sucursal amb l'id: "+id;
       }else{
            sucursalService.deleteSucursal(id);
          missatge= "La sucursal amb id "+id+" ha estat eliminada amb éxit";
        }
    return missatge;
    }

    @GetMapping("/getOne/{id}")
    public Sucursal getSucursal (@PathVariable Long id) throws Exception {
        return sucursalService.getSucursal(id);
    }

    @GetMapping("/getAll")
    public List<Sucursal> getAllSucursal (){

        return sucursalService.getAllSucursal();
    }
}
