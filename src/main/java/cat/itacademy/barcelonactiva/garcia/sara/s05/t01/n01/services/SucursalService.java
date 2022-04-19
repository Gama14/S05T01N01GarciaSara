package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.services;

import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.Sucursal;
import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.SucursalDTO;

import java.util.List;

public interface SucursalService {
    List<SucursalDTO> getSucursal();

    void deleteSucursal(int id);

    void addSucursal(SucursalDTO sucursal);

    void updateSucursal(SucursalDTO sucursal);

    List<SucursalDTO> getSucursalById(int id);
}
