package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.controllers;


import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.DTO.SucursalDTO;
import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.Sucursal;
import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SucursalController {

    @Autowired
    SucursalService sucursalService;

    @PostMapping("sucursal/add")
    public void addSucursal(@RequestBody SucursalDTO sucursalDto){
    Sucursal sucursal = new Sucursal(sucursalDto.getNomSucursal(),sucursalDto.getPaisSucursal()) ;
    sucursalService.addSucursal(sucursal);


    }

    @PutMapping ("sucursal/update/{id}")
    public void updateSucursal(@PathVariable int id,@RequestBody SucursalDTO sucursalDto) throws Exception {


        Sucursal sucursal1 = sucursalService.getSucursal(id);

        if(sucursalDto.getNomSucursal() != null) {
            sucursal1.setNomSucursal(sucursalDto.getNomSucursal());
        }else if (sucursalDto.getPaisSucursal() != null){
            sucursal1.setPaisSucursal(sucursalDto.getPaisSucursal());
        }

    }

    @DeleteMapping("sucursal/delete/{id}")
    public void deleteSucursal (int id){
    sucursalService.deleteSucursal(id);

    }

    @GetMapping("sucursal/getOne/{id}")
    public Sucursal getSucursal (int id) throws Exception {

        return sucursalService.getSucursal(id);
    }

    @GetMapping("sucursal/getAll")
    public List<Sucursal> getAllSucursal (){

        return sucursalService.getAllSucursal();
    }
}
