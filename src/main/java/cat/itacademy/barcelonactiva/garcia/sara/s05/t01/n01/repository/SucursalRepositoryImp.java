package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.repository;

import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.Sucursal;

import java.util.Optional;

public class SucursalRepositoryImp implements SucursalRepository{
    @Override
    public Sucursal findAllById(int id) {
        return null;
    }

    @Override
    public void deleteAllById(int id) {

    }

    @Override
    public <S extends Sucursal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Sucursal> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Sucursal> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Sucursal> findAll() {
        return null;
    }

    @Override
    public Iterable<Sucursal> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Sucursal entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Sucursal> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
