package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.services;

import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.Sucursal;

import java.util.List;

public interface SucursalService {
    List<Sucursal> getSucursal();

    void deleteSucursal(int id);

    void addSucursal(Sucursal sucursal);

    void updateSucursal(Sucursal sucursal);

    List<Sucursal> getSucursalById(int id);
}
