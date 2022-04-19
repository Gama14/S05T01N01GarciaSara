package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.controllers;


import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.Sucursal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SucursalController {

    @PostMapping("/add")
    public void addSucursal(){

    }
    @PutMapping ("/update")
    public void updateSucursal(Sucursal sucursal){

    }

    @DeleteMapping("/delete/{id}")
    public void deleteSucursal (int id){

    }

    @GetMapping("/getOne/{id}")
    public Sucursal getSucursal (int id){

        return null;
    }

    @GetMapping("/getAll")
    public List<Sucursal> getAllSucursal (int id){

        return null;
    }
}
