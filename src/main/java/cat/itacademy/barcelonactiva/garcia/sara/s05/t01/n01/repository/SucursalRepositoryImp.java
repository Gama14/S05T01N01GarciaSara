package cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.repository;

import cat.itacademy.barcelonactiva.garcia.sara.s05.t01.n01.model.Sucursal;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class SucursalRepositoryImp implements SucursalRepository {

    @Override
    public Sucursal findAllById(int id) {
        return null;
    }

    @Override
    public void deleteAllById(int id) {

    }

    @Override
    public List<Sucursal> findAll() {
        return null;
    }

    @Override
    public List<Sucursal> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Sucursal> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Sucursal> findAllById(Iterable<Integer> integers) {
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

    @Override
    public <S extends Sucursal> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Sucursal> List<S> saveAll(Iterable<S> entities) {
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
    public void flush() {

    }

    @Override
    public <S extends Sucursal> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Sucursal> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Sucursal> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Sucursal getOne(Integer integer) {
        return null;
    }

    @Override
    public Sucursal getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Sucursal> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Sucursal> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Sucursal> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Sucursal> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Sucursal> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Sucursal> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Sucursal, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}