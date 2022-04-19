package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.services;

import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.SucursalDTO;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class SucursalServiceImp implements SucursalService{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<SucursalDTO> getSucursal() {
        String query = "FROM SucursalDTO";
        List<SucursalDTO>resultado= entityManager.createQuery(query).getResultList();

        return resultado;
    }

    @Override
    public void deleteSucursal(int id) {

    }

    @Override
    public void addSucursal(SucursalDTO sucursal) {

    }

    @Override
    public void updateSucursal(SucursalDTO sucursal) {

    }

    @Override
    public List<SucursalDTO> getSucursalById(int id) {
        return null;
    }
}
