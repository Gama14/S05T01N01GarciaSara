package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.services;

import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.Sucursal;
import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class SucursalService {

    @Autowired
    SucursalRepository sucursalRepository;

    public void addSucursal(Sucursal sucursal){
        sucursalRepository.save(sucursal);


    }

    public void updateSucursal(Sucursal sucursal){
        sucursalRepository.save(sucursal);
    }

    public void deleteSucursal (int id){
        sucursalRepository.deleteAllById(id);

    }

    public Sucursal getSucursal (int id) throws Exception {
        Optional<Sucursal> optionalSucursal =sucursalRepository.findById(id);
        return optionalSucursal.orElseThrow(() -> new Exception("No hi ha cap sucursal amb l'id: " + id));
    }

    public List<Sucursal> getAllSucursal (){

        return (List<Sucursal>) sucursalRepository.findAll();
    }




}
