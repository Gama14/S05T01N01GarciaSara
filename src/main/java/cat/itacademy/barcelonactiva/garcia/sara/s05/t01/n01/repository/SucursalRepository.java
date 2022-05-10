package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.repository;

import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepository extends JpaRepository <Sucursal,Integer>{

    Sucursal findAllById(int id);

    void deleteAllById(int id);
}
